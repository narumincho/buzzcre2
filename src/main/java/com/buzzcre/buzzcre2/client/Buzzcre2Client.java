package com.buzzcre.buzzcre2.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class Buzzcre2Client implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            server.getCommandManager().executeWithPrefix(server.getCommandSource(), "/tell " + handler.player.getName() + " バズクリワールドへようこそ！ なにかあったらチャットで発言してね！");
        });
    }
}
