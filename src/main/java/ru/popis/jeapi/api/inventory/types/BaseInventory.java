package ru.popis.jeapi.api.inventory.types;

import org.bukkit.entity.Player;

public interface BaseInventory {

    /**
     * Открыть инвентарь
     * @param player - кому открыть
     */
    void openInventory(Player player);
}
