package ru.violence.permissionwhitelist.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {
    @EventHandler
    public void on(PlayerLoginEvent event) {
        if (event.getResult() == PlayerLoginEvent.Result.ALLOWED
                && !event.getPlayer().hasPermission("permissionwhitelist.allow")) {
            event.setResult(PlayerLoginEvent.Result.KICK_WHITELIST);
            event.setKickMessage("§cYou are not whitelisted!");
        }
    }
}
