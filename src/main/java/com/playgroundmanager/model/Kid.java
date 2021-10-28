package com.playgroundmanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.playgroundmanager.utils.PlayGround;
import lombok.Data;


import java.io.Serializable;


/**
 * @author Aurimas
 * @created 2021-10-29
 */

@Data
public class Kid implements Serializable{
    @JsonProperty("playGround")
    private PlayGround playGround;
    private Ticket ticket;
}
