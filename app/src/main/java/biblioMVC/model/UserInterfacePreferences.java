package biblioMVC.model;

import java.awt.Color;

/**
 *
 * @author Arthur de Souza Manske
 */
public class UserInterfacePreferences {
    private boolean mode;
    private Color   color;

    public UserInterfacePreferences(boolean mode, Color color)
    {
        this.mode  = mode;
        this.color = color;
    }
    
    public boolean getMode()
    {
        return this.mode;
    }
    
    public Color getColor()
    {
        return this.color;
    }
    
    public void setMode(boolean mode)
    {
        this.mode = mode;
    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }
}