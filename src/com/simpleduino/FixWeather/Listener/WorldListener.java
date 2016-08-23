package com.simpleduino.FixWeather.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * Created by Simple-Duino on 05/04/2016.
 * Copyrights Simple-Duino, all rights reserved
 */
public class WorldListener implements Listener {

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e)
    {
        e.setCancelled(true);
    }

}
