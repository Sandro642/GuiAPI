package fr.sandro542.github.test;

import fr.sandro642.github.GuiAPI.GuiAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Player player = Bukkit.getPlayer("Sandro542");
        GuiAPI.use().createinv("bick", 9);
        GuiAPI.use().setItem(Material.ENCHANTED_BOOK, 0, "test");

        if (player.isOp()) {
            GuiAPI.use().openInv(player, "bick");
        }
    }
}
