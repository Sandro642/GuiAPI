package fr.sandro642.github.GuiAPI;

import fr.sandro642.github.misc.CreateGui;
import fr.sandro642.github.misc.OpenGui;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class GuiAPI {

    private static GuiAPI instance;
    private Plugin plugin;

    public GuiAPI(Plugin plugin) {
        this.plugin = plugin;
    }

    public void createInv(String name, int size) {
        inventory = plugin.getServer().createInventory(null, size, name);
        CreateGui.inventorySizes.put(name, size);
    }

    public void openInv(Player player, String name) {
        OpenGui.openInventory(player, name);
    }

    public void setItem(Material material, int slot, String name) {
        inventory.setItem(slot, new ItemStack(material));
    }

    public static GuiAPI getInstance() {
        return instance;
    }

}
