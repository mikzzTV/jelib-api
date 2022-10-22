package ru.popis.jeapi.api.hologram.line;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class TextHologramLine implements HologramLine<String> {

    private final String text;

}
