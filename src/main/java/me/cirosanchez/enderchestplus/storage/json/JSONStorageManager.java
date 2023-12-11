package me.cirosanchez.enderchestplus.storage.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import me.cirosanchez.enderchestplus.enderchest.Enderchest;

import java.io.*;

public class JSONStorageManager {
    public static Enderchest getEnderchest(String path){
        File file = new File(path);
        try (FileReader reader = new FileReader(file)){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.fromJson(reader, Enderchest.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void saveEnderchest(Enderchest enderchest, String path){
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter writer = new FileWriter(file)){
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String str = gson.toJson(enderchest);
            writer.write(str);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
