package me.ranawxy.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class LocationAdd {
	
	// Method for splitting up coordinate/world strings
	// Example: `120, 53, 154, world_tournament` would be a config value of a location
	
	public Location parseLocation(String coords) {
	    String[] split = coords.split(",");

	    if (split.length != 4) {
	        return null;
	    }

	    double x, y, z;

	    try {
	        x = Double.parseDouble(split[0]);
	        y = Double.parseDouble(split[1]);
	        z = Double.parseDouble(split[2]);
	    } catch (NumberFormatException e) {
	        return null;
	    }

	    World w = Bukkit.getServer().getWorld(split[3]);
	    if (w != null) {
	        return new Location(w, y, z, x);
	    }  else {
	        return null;
	    }

	}
	
	

}
