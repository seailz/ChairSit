package com.seailz.chairsit;

import com.seailz.chairsit.listeners.RightClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChairSit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new RightClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
