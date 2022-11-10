package de.kaktus.main.util;

import de.kaktus.main.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FileManager {

    File file = new File("plugins/CommandOnJoin", "config.yml");
    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

    public void getConfig(){
        if (cfg.getString("Command") == null){
            cfg.set("Command", Main.command);
        }else{
            Main.command = cfg.getString("Command");
        }
        savecfg();
    }

    public void savecfg(){
        try {
            cfg.save(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
