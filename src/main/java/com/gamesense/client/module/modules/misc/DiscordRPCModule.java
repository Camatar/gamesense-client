package com.gamesense.client.module.modules.misc;

import com.gamesense.api.util.misc.Discord;
import com.gamesense.client.command.Command;
import com.gamesense.client.module.Module;

public class DiscordRPCModule extends Module {
    public DiscordRPCModule(){
        super("DiscordRPC", Category.Misc);
        setDrawn(false);
        setEnabled(true);
    }

    public void onEnable(){
        Discord.startRPC();
        if (mc.player != null || mc.world != null){
            Command.sendClientMessage("Discord RPC started!");
        }
    }

    public void onDisable(){
        Discord.stopRPC();
        if (mc.player != null || mc.world != null) {
            Command.sendClientMessage("Discord RPC stopped!");
        }
    }
}