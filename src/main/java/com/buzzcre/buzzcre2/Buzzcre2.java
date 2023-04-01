package com.buzzcre.buzzcre2;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.text.Text;

public class Buzzcre2 implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            handler.player.sendMessage(Text.of("バズクリワールドへようこそ！ なにかあったらチャットで発言してね！"));
            System.out.println(handler.player.getName() + " が参加したようだ");
        });
    }
}
