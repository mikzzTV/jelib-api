package ru.popis.jeapi.api.notification;

import org.bukkit.entity.Player;

public interface Notification {

    String getContent();

    NotificationPosition getPosition();

    void send(Player... players);

    void broadcast();

}
