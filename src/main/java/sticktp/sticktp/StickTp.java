package sticktp.sticktp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class StickTp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Wyn's plugin tnt enabled.");
        this.getCommand("magicstick").setExecutor(new MagicStick());
        Bukkit.getPluginManager().registerEvents(new tpCommand(),this);
    }
}