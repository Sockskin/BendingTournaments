package me.ranawxy.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class BTCommand implements SubCommand {
	
	protected String noPermissionMessage, mustBePlayerMessage;

	private String name;
	
	private String properUse;
	
	private String description;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProperUse() {
		return properUse;
	}


	public void setProperUse(String properUse) {
		this.properUse = properUse;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String[] getAliases() {
		return aliases;
	}


	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}


	private String[] aliases;	

	
	protected boolean isPlayer(final CommandSender sender) {
		
		if (sender instanceof Player) {
			
			return true;
			
		} else {
			
			// Send 'You must be a player' message
			
			return false;
			
		}
		
	}
}

