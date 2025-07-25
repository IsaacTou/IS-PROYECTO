package src.main.view.components;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public abstract class Button extends JButton {
    public Button(String text, Color colorBackground, int width, int height) {
        super(text);
        setBackground(colorBackground);
        setOpaque(true);
        setFont(new Font("Arial", Font.BOLD, 18)); // Fuente por defecto
        setForeground(Color.WHITE); // Texto en blanco por defecto
        setPreferredSize(new Dimension(width, height)); // Tamaño por defecto
        
    }
}

