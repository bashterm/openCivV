package openCivV;

import java.awt.*;
import java.awt.color.*;
import javax.swing.*;

import java.awt.event.ActionEvent;

public class UILoader {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new UILoader();
			}
		});
	}

	public UILoader() {
		initUI();
	}

	private static void initUI() {
		FlowLayout menuLayout = new FlowLayout(FlowLayout.TRAILING);
		JFrame frame = new JFrame();
		frame.setLayout(menuLayout);
		frame.setTitle("Open Civ V");
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JButton menuButton = new customButton("Menu");
		frame.add(menuButton);
		frame.setVisible(true);
		menuButton.addActionListener((ActionEvent event) -> {
			mainMenu.mainMenu();
		});
	}

}
