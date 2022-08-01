import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.Vector;


public class EventListener implements Listener{
    @EventHandler
    public void move(VehicleMoveEvent event) {
        Vehicle vehicle = event.getVehicle();
        Entity passenger = (Entity) event.getVehicle().getPassenger();

        if(vehicle instanceof Boat ) {
            if(passenger instanceof Player) {
                Boat boat = (Boat) vehicle;
                Player player = (Player) passenger;
                ItemStack item = player.getItemInHand();

                if(item != null && item.getType() == Material.FEATHER && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("메인로터")) {
                    int multiplier = 1;
                    boat.setVelocity(new Vector(0, 0.1D, 0));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }
                if(item != null && item.getType() == Material.COAL && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("속도0.5배")) {
                    int multiplier = 1;
                    boat.setVelocity(new Vector(boat.getLocation().getDirection().multiply(multiplier).getX(), 0, boat.getLocation().getDirection().multiply(multiplier).getZ()));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }
                if(item != null && item.getType() == Material.COAL && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("속도1배")) {
                    int multiplier = 1;
                    boat.setVelocity(new Vector(boat.getLocation().getDirection().multiply(multiplier).getX(), 0, boat.getLocation().getDirection().multiply(multiplier).getZ()));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }
                if(item != null && item.getType() == Material.COAL && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("속도1.5배")) {
                    int multiplier = 2;
                    boat.setVelocity(new Vector(boat.getLocation().getDirection().multiply(multiplier).getX(), 0, boat.getLocation().getDirection().multiply(multiplier).getZ()));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }

                // 사용료 부과
                if(item != null && item.getType() == Material.COAL && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("속도2배")) {
                    int multiplier = 2;
                    boat.setVelocity(new Vector(boat.getLocation().getDirection().multiply(multiplier).getX(), 0, boat.getLocation().getDirection().multiply(multiplier).getZ()));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }
                if(item != null && item.getType() == Material.COAL && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("속도3배")) {
                    int multiplier = 3;
                    boat.setVelocity(new Vector(boat.getLocation().getDirection().multiply(multiplier).getX(), 0, boat.getLocation().getDirection().multiply(multiplier).getZ()));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }
                if(item != null && item.getType() == Material.COAL && player.getInventory().getItemInHand().getItemMeta().getDisplayName().equals("antotaxi5cheatenable_c100125")) {
                    int multiplier = 5;
                    boat.setVelocity(new Vector(boat.getLocation().getDirection().multiply(multiplier).getX(), 0, boat.getLocation().getDirection().multiply(multiplier).getZ()));
                    Location loc = boat.getLocation();
                    player.getWorld().playSound(loc, Sound.ENTITY_WOLF_GROWL, 1, 0);
                    player.getWorld().spawnParticle(Particle.SQUID_INK, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.SMOKE_LARGE, loc.getX(), loc.getY() + 1, loc.getZ(), 0);
                    player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, loc.getX(), loc.getY() + 1, loc.getZ(), 0);

                    // 점수 부과
                    ScoreboardManager manager = Bukkit.getScoreboardManager();
                    Scoreboard board = manager.getMainScoreboard();
                    Objective obj = board.getObjective("boosttime");

                    assert obj != null;
                    Score score = obj.getScore(player.getName());

                    score.setScore(score.getScore() + multiplier);
                }
            }
        }
    }
}
