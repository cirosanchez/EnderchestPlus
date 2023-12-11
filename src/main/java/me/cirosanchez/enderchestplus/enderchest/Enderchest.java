package me.cirosanchez.enderchestplus.enderchest;

import lombok.Getter;
import lombok.Setter;
import me.cirosanchez.enderchestplus.EnderchestPlus;
import me.cirosanchez.enderchestplus.models.EnderchestPlusPlayer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Enderchest {
    @Getter
    private EnderchestPlusPlayer owner;
    @Getter
    @Setter
    private Integer level;
    @Getter
    private Inventory inv;
    @Getter
    private List<ItemStack> items;
    @Getter
    @Setter
    private String title;
    @Getter
    private List<Player> group;
    public Enderchest(EnderchestPlusPlayer player, Integer level){
        this.owner = player;
        this.title = ChatColor.translateAlternateColorCodes('&', EnderchestPlus.getInstance().getConfig().getString("enderchest.title"));
        this.inv = Bukkit.createInventory(null, 9*6, title);
        this.level = level;
        this.items = new ArrayList<>();
        this.group = new ArrayList<>();
    }

    public void openInventory(Player player){
        this.inv.clear();
        for (int i = 0; i < items.size(); i++){
            inv.setItem(i, items.get(i));
        }
        Integer num = inv.getSize() - items.size();

        String name = EnderchestPlus.getInstance().getConfig().getString("enderchest.item.name")
        for (int i = 0; i < num; i++){
            // inv.setItem(items.size() + i,);
        }
        player.openInventory(inv);
    }



}
