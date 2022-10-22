package ru.popis.jeapi.api.bars;

import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

public interface Bar {

    Collection<UUID> getViewers();

    void show(Collection<Player> players);

    void hide(Collection<Player> gamers);

    void destroy();

    default void hide(Player... players) {
        this.hide(Arrays.asList(players));
    }

    default void show(Player... players) {
        this.show(Arrays.asList(players));
    }

}
