package ru.popis.jeapi.api.bars.boss;

import org.bukkit.boss.BarColor;
import ru.popis.jeapi.api.bars.Bar;

public interface BossBar extends Bar {

    String getTitle();

    float getProgress();

    void setTitle(String title);

    void setProgress(float progress);

    void setStyle(int segments);

    void setColor(BarColor barColor);

    void setProperty(BossBarProperty property, boolean flag);

    /**
     * рассчитать и установить прогресс босс бару
     * @param max - макс. значение
     * @param current - текущее значение
     */
    default void setProgress(Number max, Number current) {
        this.setProgress(current.floatValue() / max.floatValue());
    }

    public static enum BossBarProperty {

        CREATE_FOG,
        DARKEN_SKY,
        PLAY_MUSIC;

    }

}
