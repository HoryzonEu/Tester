package eu.horyzon.tester.bungee.listener;

import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Chat implements Listener {
	@EventHandler
	public void onChat(ChatEvent e) {
		if(!(e.getSender() instanceof ProxiedPlayer))
			return;

		ProxiedPlayer p = (ProxiedPlayer) e.getSender();
		if (e.isCommand())
			p.sendMessage(new TextComponent("[Bungee] Chat command: " + e.getMessage() + " [" + e.getSender().getClass().getName() + "]"));
		else
			p.sendMessage(new TextComponent("[Bungee] Chat message: " + e.getMessage() + " [" + e.getSender().getClass().getName() + "]"));
	}
}