package me.sakuratao.knockbackapi;

import cn.nuym.spigot.knockback.IKnockback;
import cn.nuym.spigot.knockback.KnockbackAPI;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class KBAPI extends JavaPlugin {

    public static String name = "AirSpigot";

    public KBAPI() {
    }

    @Override
    public void onEnable() {
    }

    public static void setKnockbackProfile(Player player, String knockbackProfile) {
        IKnockback<?, ?, ?, ?> profile = KnockbackAPI.getByName(knockbackProfile);
        if (player.isOnline() && profile != null) {
            KnockbackAPI.applyKnockback(profile, player);
        }

    }
}
