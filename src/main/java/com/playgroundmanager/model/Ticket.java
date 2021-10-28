package com.playgroundmanager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;


/**
 * @author Aurimas
 * @created 2021-10-29
 */
@Data
public class Ticket {
    @JsonProperty("isVIP")
    private boolean isVIP;
    @JsonProperty("ticketValidTime")
    LocalDateTime ticketValidTime;
}
