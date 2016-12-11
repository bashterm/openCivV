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
		BorderLayout overAllLayout = new BorderLayout();
		TopBar bar = new TopBar();
		JFrame frame = new JFrame();
		frame.setLayout(overAllLayout);
		frame.setTitle("Open Civ V");
		frame.setSize(vars.xdimen, vars.ydimen);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(bar, overAllLayout.PAGE_START);
		frame.setVisible(true);
	}

}
