package ru.popis.jeapi.api.inventory.types;

import org.bukkit.entity.Player;
import ru.popis.jeapi.api.inventory.button.InventoryButton;

public interface PagedInventory extends BaseInventory {

    /**
     * Открыть инвентарь
     * @param player - кому открыть
     * @param page - какую страницу открыть (по умолчанию 1ю)
     */
    void openInventory(Player player, int page);

    /**
     * добавить айтем
     * @param page - страница
     * @param slot - куда сетить айтем
     * @param item - DItem с действием
     */
    void setItem(int page, int slot, InventoryButton item);
    void addItem(int page, InventoryButton dItem);

    /**
     * засетить этот айтем на все слоты
     */
    void setItem(int slot, InventoryButton item);

    /**
     * удалить айтем по слот
     * @param page - страница
     * @param slot - айтем
     */
    void removeItem(int page, int slot);

    /**
     * удалить страницу из памяти
     * @param page - номер страницы
     */
    void removePage(int page);

    /**
     * очистить все интенватри (кроме кнопок вперед/назад)
     */
    void clearPages();

    /**
     * имя инвентаря
     * @return - имя
     */
    String getName();

    /**
     * кол-во слотов в инв
     * @return - кол-во слотов в инв
     */
    int size();

    /**
     * кол-во страниц
     * @return - число страниц
     */
    int pages();

}
