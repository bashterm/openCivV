package openCivV;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;

public class customButton extends JButton {
	public customButton(String text){
		setText(text);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setFont(new Font("Tahoma", Font.BOLD,12));
	}
}
