package ru.popis.jeapi.api.bars.boss;

import org.bukkit.boss.BarColor;

import java.util.Map;

public interface BossBarAPI {

    BossBar createBossBar(String title, BarColor barColor, Map<BossBar.BossBarProperty, Boolean> properties, int segments, float progress);

    BossBar createBossBar(String title, BarColor barColor, int segments, float progress);

    BossBar createBossBar(String title, BarColor barColor, int segments);

    BossBar createBossBar(String title, BarColor barColor);

}
