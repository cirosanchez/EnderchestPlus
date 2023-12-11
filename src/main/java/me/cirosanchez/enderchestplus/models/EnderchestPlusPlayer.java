package me.cirosanchez.enderchestplus.models;

import lombok.Getter;
import lombok.Setter;
import me.cirosanchez.enderchestplus.enderchest.Enderchest;

import java.util.UUID;

public class EnderchestPlusPlayer {
    @Getter
    private final UUID uuid;

    @Getter
    @Setter
    private Enderchest enderchest;

    public EnderchestPlusPlayer(UUID uuid) {
        this.uuid = uuid;
    }

}
