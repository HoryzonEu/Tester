package eu.horyzon.tester.bukkit.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteract implements Listener {

	@EventHandler
	public void onPlayerInteractInventory(InventoryClickEvent e) {
		if (e.getInventory() == null)
			return;

		e.getWhoClicked().sendMessage("raw slot: " + e.getRawSlot() + " ");
		e.getWhoClicked().sendMessage("Action type: " + e.getAction().name());
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		e.getPlayer().sendMessage("Action type: " + e.getAction().name());
	}
}