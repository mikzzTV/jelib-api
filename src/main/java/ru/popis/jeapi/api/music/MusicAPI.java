package ru.popis.jeapi.api.music;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public interface MusicAPI {

    /**
     * Проиграть звук игроку
     * @param player - кому играть
     * @param soundType - какой звук
     */
    void play(Player player, SoundWrapper soundType);

    void play(Player player, SoundWrapper soundType, float volume, float pitch);

    void play(Player player, Sound sound);

    void play(Player player, Sound sound, float volume, float pitch);

    void play(Location location, SoundWrapper soundType);

    void play(Location location, SoundWrapper soundType, float volume, float pitch);

    void play(Location location, Sound sound);

    void play(Location location, Sound sound, float volume, float pitch);

}
