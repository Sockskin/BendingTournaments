package me.ranawxy.commands;

import me.ranawxy.bendingtournaments.BendingTournaments;

public class Commands {
	
	private final BendingTournaments plugin;
	
    public Commands(BendingTournaments plugin) {
        this.plugin = plugin;
        
    }

	public BendingTournaments getPlugin() {
		return plugin;
	}

}
