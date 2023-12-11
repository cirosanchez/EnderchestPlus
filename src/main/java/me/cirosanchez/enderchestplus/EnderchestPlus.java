package me.cirosanchez.enderchestplus;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderchestPlus extends JavaPlugin {
    @Getter
    static EnderchestPlus instance;
    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {

    }
}
