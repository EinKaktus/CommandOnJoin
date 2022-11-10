package de.kaktus.main.events;

import de.kaktus.main.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinCommand implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if (p.hasPermission("execute.command")){
            p.performCommand(Main.command);
        }
    }
}
