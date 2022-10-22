package ru.popis.jeapi.api.model;

import lombok.NonNull;

public interface BoundingBox extends Cloneable {

    Position getLowerPoint();

    Position getUpperPoint();

    Position getCenter();

    Position[] getCorners();

    boolean isInside(@NonNull Position position);

    default boolean isOutside(@NonNull Position position) {
        return !this.isInside(position);
    }

}
