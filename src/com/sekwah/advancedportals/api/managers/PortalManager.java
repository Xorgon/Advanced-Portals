package com.sekwah.advancedportals.api.managers;

import com.sekwah.advancedportals.AdvancedPortalsPlugin;
import com.sekwah.advancedportals.api.portal.Portal;
import org.bukkit.entity.Player;

import java.util.HashMap;

/**
 * When a player leaves the server any data stored on them is removed to free memory.
 *
 * @author sekwah41
 */
public class PortalManager {

    /**
     * Store data of when the player last entered the portal
     */
    private HashMap<Player, Long> lastAttempt = new HashMap();

    /**
     * Tracks what portal a player has selected
     */
    private HashMap<Player, Portal> selectedPortal = new HashMap();

    private AdvancedPortalsPlugin plugin;

    private static PortalManager instance = new PortalManager();

    /**
     * Cooldown time for players to try entering portals.
     */
    private static final int COOLDOWN = 0;

    public PortalManager(){
        this.loadPortals();
    }

    /**
     * Load the default data into the portals.
     */
    private void loadPortals(){

    }

    /**
     * A player has left the server
     * @param player
     */
    public static void playerLeave(Player player){
        instance.lastAttempt.remove(player);
        instance.selectedPortal.remove(player);
    }
}
