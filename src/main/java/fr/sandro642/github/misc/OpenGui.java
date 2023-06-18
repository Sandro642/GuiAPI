package fr.sandro642.github.misc;

import fr.sandro642.github.GuiAPI.GuiAPI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;

public class OpenGui {

    private static Plugin plugin; // Change 'private' to 'private static' to allow access in the static method

    public static void setPlugin(Plugin plugin) {
        OpenGui.plugin = plugin; // Assign the 'plugin' parameter to the static field
    }

    public static void openInventory(Player player, String name) {
        if (CreateGui.inventorySizes.containsKey(name)) {
            int size = CreateGui.inventorySizes.get(name);
            Inventory inventory = Bukkit.createInventory(null, size, name);
            player.openInventory(inventory);
        } else {
            player.sendMessage("L'inventaire spécifié n'existe pas.");
        }
    }

    public static void addItem(Material material, int slot, String name) {
        if (GuiAPI.inventory != null) {
            ItemStack item = new ItemStack(material);
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(name);
            item.setItemMeta(itemMeta);

            GuiAPI.inventory.setItem(slot, item);
        }
    }
}
