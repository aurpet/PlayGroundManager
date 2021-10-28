package com.playgroundmanager.services;

import com.playgroundmanager.model.Kid;
import com.playgroundmanager.utils.PlayGround;

import java.util.Map;

/**
 * @author Aurimas
 * @created 2021-10-29
 */
public interface PlayerService {
    int APPEND = 0;
    int NOT_APPEND = 1;

    int addNewPlayer(Kid kid);
    Map<Long, Kid> showAllPlayers();
    void deletePlayerById(Long id);
    long countVisitorsByPlayGround(PlayGround playGround);
}
