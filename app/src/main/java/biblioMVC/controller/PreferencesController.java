package biblioMVC.controller;

import biblioMVC.model.UserInterfacePreferences;

import java.awt.Color;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferencesController {
    private final UserInterfacePreferences prefs;
    private final Preferences              manager;

    public PreferencesController(String className)
    {
        this.manager = Preferences.userRoot().node(className);
        this.prefs   = new UserInterfacePreferences(false, new Color(0x00));

        this.prefs.setMode(this.manager.getBoolean("interface.mode", false));
        this.prefs.setColor(new Color(this.manager.getInt("interface.accent_color", 0x3f3f6f)));
        
        this.sync();
    }
    
    private boolean sync()
    {
        this.manager.putBoolean("interface.mode", this.prefs.getMode());
        this.manager.putInt("inteface.accent_color", this.prefs.getColor().getRGB());
        
        try {
            this.manager.sync();
            return true;
        } catch (BackingStoreException ex) {
            return false;
        }
    }
    
    public boolean isDarkModeEnabled()
    {
        return this.prefs.getMode();
    }
    
    public Color getAccentColor()
    {
        return this.prefs.getColor();
    }

    public void setDarkModeEnabled(boolean enable)
    {
        this.prefs.setMode(enable);
        this.sync();
    }

    public void setAccentColor(Color color)
    {
        this.prefs.setColor(color);
        this.sync();
    }
}