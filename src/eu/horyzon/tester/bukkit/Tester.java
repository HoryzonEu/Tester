package eu.horyzon.tester.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

import eu.horyzon.tester.bukkit.listener.Chat;
import eu.horyzon.tester.bukkit.listener.PlayerInteract;

public class Tester extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
		getServer().getPluginManager().registerEvents(new Chat(), this);
	}

	@Override
	public void onDisable() {

	}
}