package org.projecttl.api.createitem.commands

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.Inventory
import org.projecttl.api.inventorygui.utils.AddGuiItem

class ExampleItem extends AddGuiItem implements CommandExecutor {

    @Override
    boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender

            if (command.name.equalsIgnoreCase("createItem")) {
                if (args.length == 0) {
                    player.sendMessage "<CreateItem> You aren't player."
                    return true
                }

                else if (args.length > 0) {
                    if (args[0].equalsIgnoreCase("example1")) {
                        Inventory inventory = Bukkit.createInventory null, 27, "${ChatColor.BLUE}Example Item"

                        onCreateItem(inventory, 10, Material.DIAMOND_SWORD, "Diamond Sword", null, 1, false)
                        onCreateItem(inventory, 13, Material.DIAMOND_AXE, "${ChatColor.DARK_AQUA}Nightmare Axe", null, 1, false)
                        onCreateItem(inventory, 16, Material.CROSSBOW, "${ChatColor.YELLOW}${player.name}'s Crossbow", null, 1, false)

                        onCreateExitButton(inventory, 26)
                        player.openInventory(inventory)

                        return true
                    }
                }
            }
        }

        return false
    }
}
