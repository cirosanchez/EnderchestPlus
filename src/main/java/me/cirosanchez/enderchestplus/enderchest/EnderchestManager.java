package me.cirosanchez.enderchestplus.enderchest;

import com.google.gson.JsonObject;
import me.cirosanchez.enderchestplus.storage.json.JSONStorageManager;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.UUID;

public class EnderchestManager {
    public static Enderchest createEnderchest(Player player) {
        UUID uuid = player.getUniqueId();
        File file = new File("enderchests/" + uuid.toString() + ".json");
        if (file.exists()) {
            return JSONStorageManager.getEnderchest(file.getPath());
        }

    }
}
