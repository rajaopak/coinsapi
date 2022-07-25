package id.rajaopak.coinsapi;

import org.bukkit.OfflinePlayer;

public interface CoinsAPI {

    /**
     * Check if the player has enough coins.
     * if the coins of player has is more than or equal to the amount of coins, return true.
     * else return false.
     *
     * @param player Player to check
     * @param amount Amount to check
     * @return true if player has enough coins, false otherwise
     */
    boolean has(OfflinePlayer player, double amount);

    /**
     * Add coins to a player
     *
     * @param player Player to Add Coins to
     * @param amount Amount to Add
     */
    void add(OfflinePlayer player, double amount);

    /**
     * Remove coins for specify amount of player has.
     *
     * @param player  Player to remove coins from
     * @param amount  Amount of coins to remove
     */
    void remove(OfflinePlayer player, double amount);

    /**
     * Set the amount of coins a player has.
     *
     * @param player  Player to set coins for
     * @param amount  Amount of coins
     */
    void set(OfflinePlayer player, double amount);

    /**
     * Get the amount of coins a player has.
     *
     * @param player  Player to get coins from
     * @return        Amount of coins player has
     */
    double get(OfflinePlayer player);

    /**
     * Reset player's balance to 0.
     *
     * @param player Player to reset
     */
    void reset(OfflinePlayer player);

    /**
     * Reset all players' balance.
     */
    void resetAll();

}
