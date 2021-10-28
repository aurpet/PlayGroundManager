package com.playgroundmanager.services;

import com.playgroundmanager.model.Kid;
import com.playgroundmanager.utils.PlayGround;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Aurimas
 * @created 2021-10-29
 */
@Slf4j
@Service
public class PlayerServiceImpl implements PlayerService {
    private static Long kidId = 0L;
    private static Map<Long, Kid> kids = new HashMap<>();

    @Override
    public int addNewPlayer(Kid kid) {
        if (!isPlayGroundFull(kid)){
            kidId++;
            kids.put(kidId, kid);
            return PlayerService.APPEND;
        } else {
            log.info("============ Playground is full !! Only two children are allowed on DOUBLE_SWINGS   ==========");
            return PlayerService.NOT_APPEND;
        }
    }

    @Override
    public Map<Long, Kid> showAllPlayers() {
        return kids;
    }

    @Override
    public long countVisitorsByPlayGround(PlayGround playGround) {
        return kids.values().stream().filter(v -> v.getPlayGround().equals(playGround)).count();
    }

    @Override
    public void deletePlayerById(Long id) {
        if (kids.get(id)!=null){
            log.info(" =====  Kid was removed  ====");
            kids.remove(id);
        } else {
            log.info("============ Record doesn't exist   ==========");
        }
    }

    private boolean isPlayGroundFull(Kid newKid){
        int kidSize = 0;

        for (Map.Entry<Long, Kid> entry : kids.entrySet()) {
            if (entry.getValue().getPlayGround().equals(PlayGround.DOUBLE_SWINGS)){
                kidSize++;
            }
        }
        if (kidSize==2 && newKid.getPlayGround().equals(PlayGround.DOUBLE_SWINGS)){
            return true;
        } else{
            return false;
        }
    }

}
