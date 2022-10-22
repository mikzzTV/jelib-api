package ru.popis.jeapi.api.inventory.button;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface InventoryButton {

    ItemStack getIcon(Player viewer);

}
