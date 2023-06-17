package fr.sandro642.github.misc;

import fr.sandro642.github.GuiAPI.GuiAPI;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;

public class CreateGui {

    private Plugin plugin;
    public static Map<String, Integer> inventorySizes;

    public static void setPlugin(Plugin plugin) {
        inventorySizes = new HashMap<>();
        CreateGui.setPlugin(plugin);
    }

}
