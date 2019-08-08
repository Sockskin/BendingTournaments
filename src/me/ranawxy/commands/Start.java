package me.ranawxy.commands;

import java.util.List;

import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class Start extends BTCommand {

	// Constructor for 'Start' Command.
	
	public Start(String noPermissionMessage, String mustBePlayerMessage, String name, String properUse,
	
	String description, String[] aliases) {
		
	super(noPermissionMessage, mustBePlayerMessage, name, properUse, description, aliases);
	
	}

	@Override
	public void help(CommandSender sender, boolean description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(CommandSender sender, List<String> args) {

		if (sender.hasPermission("bt.admin.start")) {
			
		return;
			
		}
		
		else if (args.size() == 0) {
			
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBending Tournaments &8- &7Correct usage is /bt start"));
			
		if (getName().equalsIgnoreCase("Start")) {
			
		sender.sendMessage("Ran the start command successfully.");
			
		}
		
		}
		
	}

}
