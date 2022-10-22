package ru.popis.jeapi.api.inventory.button;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import java.util.function.BiConsumer;

public interface ClickableInventoryButton extends InventoryButton {

    BiConsumer<Player, ClickType> getTriggeredAction();
}
