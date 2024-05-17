package com.pluralsight;

public class HoverCraft {
    private int maxAltitude;
    private int waterSpeed;
    private int airSpeed;
    private String controlSystem;

    public HoverCraft(int maxAltitude, int waterSpeed,
                      int airSpeed, String controlSystem) {
        this.maxAltitude = maxAltitude;
        this.waterSpeed = waterSpeed;
        this.airSpeed = airSpeed;
        this.controlSystem = controlSystem;
    }
}
