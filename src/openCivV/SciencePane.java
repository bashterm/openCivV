package openCivV;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SciencePane extends JPanel {
	public SciencePane(){
		FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(centerLayout);
		this.setBackground(Color.black);
		this.setSize(vars.xdimen,vars.ydimen - 120);
		this.setVisible(true);
		
		JButton techTreeButton = new customButton("Show Tech Tree");
		techTreeButton.addActionListener((ActionEvent event) -> {
			new techTree("foo");
		});
		this.add(techTreeButton);
	}
}
