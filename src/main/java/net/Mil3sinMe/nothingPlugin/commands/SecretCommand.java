
package net.Mil3sinMe.nothingPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SecretCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("&cThis command can only be used by players!");
            return true;
        }
        
        Player player = (Player) sender;
        player.sendMessage("This is a &dksecret&r message!");
        
        return true;
    }
}
