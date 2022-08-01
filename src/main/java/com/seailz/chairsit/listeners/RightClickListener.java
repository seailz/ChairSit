package com.seailz.chairsit.listeners;

import org.bukkit.block.Block;
import org.bukkit.block.data.type.Stairs;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RightClickListener implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK) return;
        if (!event.getClickedBlock().getType().toString().endsWith("STAIRS")) return;

        Block block = event.getClickedBlock();
        Arrow arrow = (Arrow) block.getWorld().spawnEntity(block.getLocation().add(0.5, 0, 0.5), EntityType.ARROW);
        arrow.setInvulnerable(true);
        arrow.setPassenger(event.getPlayer());
    }

}
