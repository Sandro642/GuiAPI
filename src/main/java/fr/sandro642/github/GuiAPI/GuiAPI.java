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
    public static Inventory inventory;

    private Plugin plugin;

    public GuiAPI(Plugin plugin) {
        this.plugin = plugin;
    }

    // set

    public void createinv(String name, int size) {
        name = inventory.toString();
        CreateGui.inventorySizes.put(name, size);
    }

    public void openInv(Player player, String name) {
        OpenGui.openInventory(player, name);
    }

    public void setItem(Material material, int slot, String name) {
        OpenGui.addItem(material, slot, name);
    }



    // Getter class ChannelzAPI

    public static GuiAPI use() {
        return instance;
    }

}
