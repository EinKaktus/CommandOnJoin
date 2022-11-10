package de.kaktus.main;

import de.kaktus.main.events.JoinCommand;
import de.kaktus.main.util.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String command = "say hi";

    public static FileManager fm;

    @Override
    public void onEnable() {
        fm = new FileManager();
        fm.savecfg();
        fm.getConfig();
        Bukkit.getPluginManager().registerEvents(new JoinCommand(), this);
    }
}
