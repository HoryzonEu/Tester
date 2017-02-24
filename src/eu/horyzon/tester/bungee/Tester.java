package eu.horyzon.tester.bungee;

import eu.horyzon.tester.bungee.listener.Chat;
import net.md_5.bungee.api.plugin.Plugin;

public class Tester extends Plugin {

	@Override
	public void onEnable() {
		getProxy().getPluginManager().registerListener(this, new Chat());
	}

	@Override
	public void onDisable() {

	}
}