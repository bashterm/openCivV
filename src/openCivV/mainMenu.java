package openCivV;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class mainMenu extends JFrame{
	private void initUI(){
		setTitle("Menu");
		setSize(200,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JButton quitButton = new customButton("Quit");
		quitButton.addActionListener((ActionEvent event) ->{
			System.exit(0);
		});
		createLayout(quitButton);
	}
	public mainMenu(){
		initUI();
	}
	public static void mainMenu(){
		EventQueue.invokeLater(() ->{
			mainMenu men= new mainMenu();
			men.setVisible(true);;
		});
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
