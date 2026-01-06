
package net.Mil3sinMe.nothingPlugin;

import net.Mil3sinMe.nothingPlugin.commands.SecretCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class NothingPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the command
        this.getCommand("secret").setExecutor(new SecretCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}