package it.zmario.zspleef.utils;

import it.zmario.zspleef.zSpleef;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigHandler {

    private static File config;
    private static YamlConfiguration configFile;

    private static File messages;
    private static YamlConfiguration messagesFile;

    private static File sounds;
    private static YamlConfiguration soundsFile;

    private static File powerups;
    private static YamlConfiguration powerupsFile;

    public static void checkConfig() {
        if (!zSpleef.getInstance().getDataFolder().exists()) {
            zSpleef.getInstance().getDataFolder().mkdirs();
        }
        config = new File(zSpleef.getInstance().getDataFolder(), "config.yml");
        if (!config.exists()) {
            zSpleef.getInstance().saveResource("config.yml", true);
            Debug.info("&aFile 'config.yml' created with success.");
        }
        configFile = YamlConfiguration.loadConfiguration(config);
    }

    public static void reloadConfig() {
        try {
            configFile.save(config);
            configFile = YamlConfiguration.loadConfiguration(config);
        } catch (IOException e) {
            e.printStackTrace();
            Debug.severe("Can't reload the file 'config.yml'.");
        }
    }

    public static YamlConfiguration getConfig() {
        return configFile;
    }

    public static void checkMessages() {
        messages = new File(zSpleef.getInstance().getDataFolder(), "messages.yml");
        if (!messages.exists()) {
            zSpleef.getInstance().saveResource("messages.yml", true);
            Debug.info("&aFile 'messages.yml' created with success.");
        }
        messagesFile = YamlConfiguration.loadConfiguration(messages);
    }

    public static void reloadMessages() {
        try {
            messagesFile.save(messages);
            messagesFile = YamlConfiguration.loadConfiguration(messages);
        } catch (IOException e) {
            e.printStackTrace();
            Debug.severe("Can't reload the file 'messages.yml'.");
        }
    }

    public static YamlConfiguration getMessages() {
        return messagesFile;
    }

    public static void checkSounds() {
        sounds = new File(zSpleef.getInstance().getDataFolder(), "sounds.yml");
        if (!sounds.exists()) {
            zSpleef.getInstance().saveResource("sounds.yml", true);
            Debug.info("&aFile 'sounds.yml' created with success.");
        }
        soundsFile = YamlConfiguration.loadConfiguration(sounds);
    }

    public static void reloadSounds() {
        try {
            soundsFile.save(sounds);
            soundsFile = YamlConfiguration.loadConfiguration(sounds);
        } catch (IOException e) {
            e.printStackTrace();
            Debug.severe("Can't reload the file 'sounds.yml'.");
        }
    }

    public static YamlConfiguration getSounds() {
        return soundsFile;
    }

    public static void checkPowerups() {
        powerups = new File(zSpleef.getInstance().getDataFolder(), "powerups.yml");
        if (!powerups.exists()) {
            zSpleef.getInstance().saveResource("powerups.yml", true);
            Debug.info("&aFile 'powerups.yml' created with success.");
        }
        powerupsFile = YamlConfiguration.loadConfiguration(powerups);
    }

    public static void reloadPowerups() {
        try {
            powerupsFile.save(powerups);
            powerupsFile = YamlConfiguration.loadConfiguration(powerups);
        } catch (IOException e) {
            e.printStackTrace();
            Debug.severe("Can't reload the file 'powerups.yml'.");
        }
    }

    public static YamlConfiguration getPowerups() {
        return powerupsFile;
    }


}
