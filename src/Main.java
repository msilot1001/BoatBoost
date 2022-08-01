import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[Boat] Boat Patcher Enabled");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[Boat] Boat Patcher Disabled");
    }
}