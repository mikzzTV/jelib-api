package ru.popis.jeapi.api.inventory.mask;

import ru.popis.jeapi.api.inventory.button.InventoryButton;
import ru.popis.jeapi.api.inventory.types.BaseInventory;

public interface InventoryMask {

    InventoryMask setPattern(String... pattern);

    InventoryMask setButton(char pos, InventoryButton button);

    void apply(BaseInventory inventory);

}
