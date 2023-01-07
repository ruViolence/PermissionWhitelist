package ru.violence.permissionwhitelist;

import org.bukkit.plugin.java.JavaPlugin;
import ru.violence.permissionwhitelist.listener.LoginListener;

public class PermissionWhitelistPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new LoginListener(), this);
    }
}
