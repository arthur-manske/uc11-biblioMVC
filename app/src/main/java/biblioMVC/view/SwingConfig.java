/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.view;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Arthur de Souza Manske
 */
public final class SwingConfig {
    public static String setFlatLafTheme(boolean darkTheme, Color accent)
    {
        final FlatLaf theme = (darkTheme ? new FlatDarculaLaf() : new FlatLightLaf());

        try {
            UIManager.setLookAndFeel(theme);
            return null;
        } catch (UnsupportedLookAndFeelException e) {
            return e.getLocalizedMessage();
        }
    }
}
