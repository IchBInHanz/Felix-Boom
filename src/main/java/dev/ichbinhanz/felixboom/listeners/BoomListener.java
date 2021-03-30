package dev.ichbinhanz.felixboom.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BoomListener implements Listener {
    @EventHandler
    public void onBoom(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (!(e.getAction() == Action.RIGHT_CLICK_AIR)) return;
        if (!(e.getItem().getType() == Material.STICK)) return;
        // if(!p.hasPermission("felixboom.*")) return;
        if(!p.isOp()) return;
        Fireball s = e.getPlayer().launchProjectile(Fireball.class);
    }
}
