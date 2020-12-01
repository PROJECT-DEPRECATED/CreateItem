package org.projecttl.api.createitem.utils

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

class CreateItem {

    void addItem(Material setItemType, int setAmount, Player player) {
        ItemStack newItem = new ItemStack(setItemType)
        newItem.amount = setAmount

        player.getInventory().addItem(newItem)
    }

    void addCustomItem(Material setItemType, int setAmount, Player player, String setItemName, List<String> setItemLore) {
        ItemStack newItem = new ItemStack(setItemType)
        ItemMeta meta = newItem.itemMeta

        meta.displayName = setItemName
        meta.lore = setItemLore

        newItem.itemMeta = meta
        newItem.amount = setAmount

        player.getInventory().addItem newItem
    }
}
