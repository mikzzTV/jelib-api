package ru.popis.jeapi.api.hologram.line;

import java.util.Optional;

public interface HologramLine<T> {

    Optional<T> getSource();
}
