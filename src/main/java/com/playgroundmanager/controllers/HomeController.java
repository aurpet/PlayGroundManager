package com.playgroundmanager.controllers;


import com.playgroundmanager.model.Kid;
import com.playgroundmanager.services.PlayerService;
import com.playgroundmanager.services.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * @author Aurimas
 * @created 2021-10-29
 */

@RestController
public class HomeController {

    @Autowired
    private PlayerServiceImpl playerService;

    @PostMapping("/new-player")
    public ResponseEntity addNewPlayer(@RequestBody Kid kid) {
        if (playerService.addNewPlayer(kid)== PlayerService.APPEND){
            return new ResponseEntity("New player successfully added", HttpStatus.CREATED);
        } else {
            return new ResponseEntity("Double swings never allow for more than 2 kids!", HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/all")
    public @ResponseBody Map<Long, Kid> getAllPlayers(){
        return playerService.showAllPlayers();
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deletePlayer (@PathVariable long id){
        playerService.deletePlayerById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
