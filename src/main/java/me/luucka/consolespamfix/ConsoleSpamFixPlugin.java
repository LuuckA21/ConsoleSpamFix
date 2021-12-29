package me.luucka.consolespamfix;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConsoleSpamFixPlugin extends JavaPlugin {

    public void onEnable() {
        saveDefaultConfig();
        ((Logger) LogManager.getRootLogger()).addFilter(new LogFilter(this));
    }

    public void onDisable() {
    }
}
