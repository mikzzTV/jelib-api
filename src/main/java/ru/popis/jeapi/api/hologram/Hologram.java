package ru.popis.jeapi.api.hologram;

import org.bukkit.entity.Player;
import ru.popis.jeapi.api.bars.Bar;
import ru.popis.jeapi.api.hologram.line.HologramLine;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Consumer;

public interface Hologram extends Bar {

    int getId();

    <T extends HologramLine> Collection<T> getLines();

    Optional<Consumer<Player>> getTouchAction();

    void setTouchAction(Consumer<Player> action);

    default int getSize() {
        return this.getLines().size();
    }

    default boolean isTouchable() {
        return this.getTouchAction().isPresent();
    }

}
