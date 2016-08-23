package com.simpleduino.FixWeather;

import com.simpleduino.FixWeather.Listener.WorldListener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Simple-Duino on 05/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class FixWeather extends JavaPlugin {

    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(new WorldListener(), this);
    }

    public void onDisable()
    {

    }

}
