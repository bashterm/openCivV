package openCivV;

import java.awt.*;
import java.awt.color.*;
import javax.swing.*;

import java.awt.event.ActionEvent;

public class UILoader {
	static JFrame frame = new JFrame();

	public static void main(String[] args) {
		initUI();
	}

	public UILoader() {
		initUI();
	}

	private static void initUI() {

		frame.setTitle("Open Civ V");
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		JButton menuButton = new customButton("Menu");
		menuButton.addActionListener((ActionEvent event) -> {
			mainMenu.mainMenu();
		});

		frame.add(createLayout(menuButton));
	}

	private static JPanel createLayout(JComponent... arg) {
		FlowLayout menuLayout = new FlowLayout(FlowLayout.TRAILING);
		final JPanel gl = new JPanel();
		gl.setLayout(menuLayout);
		gl.add(arg[0]);
		return gl;
	}

}
