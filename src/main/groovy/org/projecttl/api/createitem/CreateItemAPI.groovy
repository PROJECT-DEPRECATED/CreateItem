package org.projecttl.api.createitem

import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin
import org.projecttl.api.createitem.commands.ExampleItem
import org.projecttl.api.createitem.commands.arguments.ArgumentForExampleItem
import org.projecttl.api.createitem.listeners.ItemClickEvent

class CreateItemAPI extends JavaPlugin {

    PluginManager manager = server.pluginManager

    @Override
    void onEnable() {
        logger.info("API has enabled.")

        getCommand("createItem").setExecutor(new ExampleItem())
        getCommand("createItem").tabCompleter = new ArgumentForExampleItem()

        manager.registerEvents(new ItemClickEvent(), this)
    }

    @Override
    void onDisable() {
        logger.info("API has disabled.")
    }
}
