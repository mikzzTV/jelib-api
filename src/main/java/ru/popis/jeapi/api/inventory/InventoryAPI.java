package ru.popis.jeapi.api.inventory;

import ru.popis.jeapi.api.inventory.types.EntriesInventory;
import ru.popis.jeapi.api.inventory.types.PagedInventory;
import ru.popis.jeapi.api.inventory.types.SingularInventory;

import java.util.Collection;
import java.util.Collections;

public interface InventoryAPI {

    SingularInventory createSingular(String title, int rows);

    PagedInventory createPaged(String title, int rows);

    <T> EntriesInventory<T> createEntries(String title, int rows, Collection<T> entries);

    default <T> EntriesInventory<T> createEntries(String title, int rows) {
        return createEntries(title, rows, Collections.emptySet());
    }

}
