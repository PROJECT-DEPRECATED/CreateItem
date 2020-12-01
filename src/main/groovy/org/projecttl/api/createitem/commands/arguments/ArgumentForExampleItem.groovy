package org.projecttl.api.createitem.commands.arguments

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

class ArgumentForExampleItem implements TabCompleter {

    @Override
    List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.name.equalsIgnoreCase("createItem")) {
            if (args.length == 1) {
                ArrayList<String> firstArguments = new ArrayList<>()
                firstArguments.add "example1"

                return firstArguments
            }
        }

        return onTabComplete(sender, command, alias, args)
    }
}
