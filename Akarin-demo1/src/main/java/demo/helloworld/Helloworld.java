package demo.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class Helloworld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("hello world---------------------------------------------------------------------------------");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
