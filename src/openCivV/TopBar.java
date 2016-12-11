package openCivV;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class TopBar extends JPanel {
	public TopBar(){
		FlowLayout rightLayout = new FlowLayout(FlowLayout.TRAILING);
		this.setLayout(rightLayout);
		this.setSize(1280,60);
		this.setBackground(Color.BLACK);
		this.setBorder(borders.empty);
		JButton menuButton = new customButton("Menu");
		this.add(menuButton);
		menuButton.addActionListener((ActionEvent event) -> {
			mainMenu.mainMenu();
		});
		
	}
}
class leftHalf extends JPanel {
	public leftHalf(){
		
	}
}
class rightHalf extends JPanel {
	public rightHalf(){
		
	}
}
