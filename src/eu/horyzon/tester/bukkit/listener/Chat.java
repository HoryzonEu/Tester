package eu.horyzon.tester.bukkit.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Chat implements Listener {
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		e.getPlayer().sendMessage("[Spigot] " + e.getMessage());
	}

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		e.getPlayer().sendMessage("[Spigot] " + e.getMessage());
	}
}