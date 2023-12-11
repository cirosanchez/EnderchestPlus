package me.cirosanchez.enderchestplus.models;

import java.io.File;
import java.util.UUID;

public class EnderchestPlusPlayer {
    private final UUID uuid;
    private Enderchest enderchest;


    public EnderchestPlusPlayer(UUID uuid) {
        this.uuid = uuid;
    }

}
