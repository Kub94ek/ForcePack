package com.convallyria.forcepack.paper.event;

import com.convallyria.forcepack.paper.util.GameProfile;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class ResourcePackLoadedEvent extends Event {
    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final GameProfile profile;
    private final UUID id;

    public ResourcePackLoadedEvent(GameProfile profile, UUID id) {
        this.profile = profile;
        this.id = id;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public GameProfile getProfile() {
        return profile;
    }

    public UUID getId() {
        return id;
    }
}
