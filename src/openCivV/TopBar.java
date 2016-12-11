package openCivV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TopBar extends JPanel {
	
	public TopBar(){
		this.setLayout(new BorderLayout());
		this.setSize(vars.xdimen,60);
		this.setBackground(Color.BLACK);
		this.setBorder(borders.empty);
		this.add(new rightHalf(), BorderLayout.EAST);
		this.add(new leftHalf(), BorderLayout.WEST);
		
		this.setVisible(true);
	}
}
class leftHalf extends JPanel {
	public static JRadioButton scienceToggle = new JRadioButton();
	public leftHalf(){
		FlowLayout leftLayout = new FlowLayout(FlowLayout.LEADING);
		this.setSize(vars.xdimen/2,60);
		this.setBackground(Color.BLACK);
		this.setBorder(borders.empty);
		ActionListener tfActionListener = new ActionListener(){
			public void actionPerformed(ActionEvent actionevent){
				JRadioButton button = (JRadioButton) actionevent.getSource();
				UILoader.science.setVisible(button.isSelected());
			}
		};
				
		
		scienceToggle.setToolTipText("Show or Hide Science Pane");
		scienceToggle.setSelected(true);
		scienceToggle.setBackground(Color.black);
		scienceToggle.addActionListener(tfActionListener);
		this.add(scienceToggle);
	}
}
class rightHalf extends JPanel {
	public rightHalf(){
		FlowLayout rightLayout = new FlowLayout(FlowLayout.TRAILING);
		this.setSize(vars.xdimen/2,60);
		this.setBackground(Color.BLACK);
		this.setBorder(borders.empty);
		
		JButton menuButton = new customButton("Menu");
		menuButton.setToolTipText("Show the Main Menu");
		this.add(menuButton);
		menuButton.addActionListener((ActionEvent event) -> {
			mainMenu.mainMenu();
		});
	}
	
}
