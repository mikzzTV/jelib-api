package ru.popis.jeapi.api.container;

import java.util.Optional;

public interface Container<K, V> {

    Optional<V> get(K key);

    <E extends V> Optional<E> get(K key, Class<E> type);

    default boolean contains(K key) {
        return this.get(key).isPresent();
    }

}
