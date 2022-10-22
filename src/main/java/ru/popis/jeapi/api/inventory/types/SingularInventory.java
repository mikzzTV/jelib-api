package ru.popis.jeapi.api.inventory.types;

import ru.popis.jeapi.api.inventory.button.InventoryButton;

public interface SingularInventory extends BaseInventory {

    /**
     * добавить айтем
     * @param slot - куда сетить айтем
     * @param button - иконка
     */
    void setItem(int slot, InventoryButton button);

    /**
     * Узнать имя инв
     * @return name инвенторя
     */
    String getName();

    /**
     * удалить айтем по слоту
     * @param slot - айтем
     */
    void removeItem(int slot);

    /**
     * очистить инвентарь
     */
    void clearInventory();

    /**
     * кол-во слотов в инв
     * @return кол-во слотов в инв
     */
    int size();
}
