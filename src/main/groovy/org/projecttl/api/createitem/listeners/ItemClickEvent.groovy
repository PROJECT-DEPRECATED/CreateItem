package org.projecttl.api.createitem.listeners

import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class ItemClickEvent implements Listener {

    @EventHandler
    void onClickedItem(InventoryClickEvent event) {
        Player player = (Player) event.whoClicked

        if (event.view.title.equalsIgnoreCase("${ChatColor.BLUE}Example Item")) {
            if (event.currentItem.itemMeta.displayName.equalsIgnoreCase("Diamond Sword")) {
                player.sendMessage("<CreateItem> You cannot touched this items.")
                event.cancelled = true
            }

            else if (event.currentItem.itemMeta.displayName.equalsIgnoreCase("${ChatColor.DARK_AQUA}Nightmare Axe")) {
                player.sendMessage("<CreateItem> You cannot touched this items.")
                event.cancelled = true
            }

            else if (event.currentItem.itemMeta.displayName.equalsIgnoreCase("${ChatColor.YELLOW}${player.name}'s Crossbow")) {
                player.sendMessage("<CreateItem> You cannot touched this items.")
                event.cancelled = true
            }
        }
    }
}
