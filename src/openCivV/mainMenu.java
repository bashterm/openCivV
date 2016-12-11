package openCivV;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class mainMenu {
	private void initUI() {
		FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
		JFrame frame = new JFrame();
		frame.setLayout(centerLayout);
		frame.setTitle("Menu");
		frame.setSize(vars.xdimen/3, vars.ydimen/3);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);

		JButton quitButton = new customButton("Quit");
		quitButton.addActionListener((ActionEvent event) -> {
			System.exit(0);
		});
		frame.add(quitButton);
		frame.setVisible(true);
		
	}

	public mainMenu() {
		initUI();
	}

	public static void mainMenu() {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new mainMenu();
			}
		});
	}


}
