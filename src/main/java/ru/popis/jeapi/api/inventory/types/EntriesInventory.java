package ru.popis.jeapi.api.inventory.types;

import ru.popis.jeapi.api.inventory.button.InventoryButton;

import java.util.Collection;

public interface EntriesInventory<T> extends PagedInventory {

    Collection<T> getShowingEntries();

    InventoryButton getButton(T entry);

    void addEntry(T entry);

}
