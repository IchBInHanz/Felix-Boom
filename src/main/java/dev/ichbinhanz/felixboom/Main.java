package dev.ichbinhanz.felixboom;

import dev.ichbinhanz.felixboom.listeners.BoomListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        listernerRegister();
        Bukkit.getLogger().fine("FelixBoom Enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine("FelixBoom Disabled!");
    }

    private void listernerRegister() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new BoomListener(), this);
    }
}
