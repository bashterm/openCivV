package openCivV;

import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
public class UILoader extends JFrame {
	public static void main(String[] args){
		EventQueue.invokeLater(() ->{
			UILoader load= new UILoader();
			load.setVisible(true);;
		});
	}
	public UILoader() {
		initUI();
	}
	private void initUI(){
		setTitle("Open Civ V");
		setSize(1280,720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton menuButton = new JButton("Menu");
		menuButton.addActionListener((ActionEvent event) ->{
			mainMenu.mainMenu();
		});
		
		createLayout(menuButton);
	}
	 private void createLayout(JComponent... arg) {

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
