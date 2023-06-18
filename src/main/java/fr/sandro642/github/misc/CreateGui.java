package fr.sandro642.github.misc;

import fr.sandro642.github.GuiAPI.GuiAPI;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;

public class CreateGui {

    private static Plugin plugin; // Change 'private' to 'private static' to allow access in the static method
    public static Map<String, Integer> inventorySizes;

    public static void setPlugin(Plugin plugin) {
        inventorySizes = new HashMap<>();
        CreateGui.plugin = plugin; // Assign the 'plugin' parameter to the static field
    }
}
