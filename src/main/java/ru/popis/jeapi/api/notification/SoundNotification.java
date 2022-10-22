package ru.popis.jeapi.api.notification;

import ru.popis.jeapi.api.music.SoundWrapper;

public interface SoundNotification extends Notification {

    SoundWrapper getSoundWrapper();
}
