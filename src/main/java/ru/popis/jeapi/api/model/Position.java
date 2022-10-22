package ru.popis.jeapi.api.model;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.function.Function;

public interface Position extends Cloneable {

    double getX();

    double getY();

    double getZ();

    float getYaw();

    float getPitch();

    default Function<World, Location> toLocation() {
        return world -> new Location(world, getX(), getY(), getZ(), getYaw(), getPitch());
    }

}
