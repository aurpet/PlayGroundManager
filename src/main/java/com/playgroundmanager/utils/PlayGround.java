package com.playgroundmanager.utils;


import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Aurimas
 * @created 2021-10-27
 */
public enum PlayGround {
    DOUBLE_SWINGS("DS"),
    CAROUSEL("C"),
    SLIDE("S"),
    BALL_PIT("BP");

    private String playSite;

    PlayGround(String playSite) {
        this.playSite = playSite;
    }

    @JsonValue
    public String getPlaySite() {
        return playSite;
    }

    public void setPlaySite(String playSite) {
        this.playSite = playSite;
    }
}
