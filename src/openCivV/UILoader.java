package openCivV;

import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
public class UILoader {
	public static void main(String[] args){
		initUI();
	}
	public UILoader() {
		initUI();
	}
	private static void initUI(){
		JFrame frame = new JFrame();
		frame.setTitle("Open Civ V");
		frame.setSize(1280,720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		JButton menuButton = new JButton("Menu");
		menuButton.addActionListener((ActionEvent event) ->{
			mainMenu.mainMenu();
		});
		
		createLayout(menuButton);
	}
	 private static void createLayout(JComponent... arg) {

	        Container pane = getContentPane();
	        GroupLayout gl = new GroupLayout(pane);
	        pane.setLayout(gl);

	        gl.setAutoCreateContainerGaps(true);

	        gl.setHorizontalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0])
	        );

	        gl.setVerticalGroup(gl.createSequentialGroup()
	                .addComponent(arg[0])
	        );
   }
	 
}
