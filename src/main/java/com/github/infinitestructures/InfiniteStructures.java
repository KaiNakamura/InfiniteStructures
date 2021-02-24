package com.github.infinitestructures;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class InfiniteStructures extends JavaPlugin {
    @Override
    public void onEnable() {
        // Save default config, fails silently if config already exists
        saveDefaultConfig();

        // Create world init listener
        getServer().getPluginManager().registerEvents(new WorldInitListener(), this);
    }

    public static InfiniteStructures getInstance() {
        return (InfiniteStructures) Bukkit.getPluginManager().getPlugin("InfiniteStructures");
    }
}
