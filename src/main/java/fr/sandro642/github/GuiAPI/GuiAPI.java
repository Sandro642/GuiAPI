package fr.sandro642.github.GuiAPI;

import java.util.Map;
import java.util.HashMap;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.Bukkit;

public class GuiAPI {

    private Plugin plugin;
    private Map<String, Inventory> inventories;
    private static GuiAPI instance;

    public GuiAPI(Plugin plugin) {
        this.plugin = plugin;
        this.inventories = new HashMap<>();
    }

    public void createInventory(String name, int size) {
        Inventory inventory = Bukkit.createInventory(null, size, name);
        inventories.put(name, inventory);
    }

    public void openInventory(Player player, String name) {
        Inventory inventory = inventories.get(name);
        if (inventory != null) {
            player.openInventory(inventory);
        } else {
            player.sendMessage("The inventory '" + name + "' does not exist.");
        }
    }

    public void addItem(String inventoryName, int slot, Material material, String itemName) {
        Inventory inventory = inventories.get(inventoryName);
        if (inventory != null) {
            ItemStack itemStack = new ItemStack(material);
            itemStack.getItemMeta().setDisplayName(itemName);
            inventory.setItem(slot, itemStack);
        } else {
            plugin.getLogger().warning("Failed to add item to inventory '" + inventoryName + "'. The inventory does not exist.");
        }
    }

    public static GuiAPI use() {
        return instance;
    }
}
