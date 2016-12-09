package openCivV;

import javax.swing.*;
import java.awt.EventQueue;
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
		setSize(640,360);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
