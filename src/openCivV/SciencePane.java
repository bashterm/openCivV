package openCivV;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class SciencePane extends JPanel {
	public SciencePane(){
		FlowLayout centerLayout = new FlowLayout(FlowLayout.CENTER);
		this.setLayout(centerLayout);
		this.setBackground(Color.black);
		this.setSize(vars.xdimen/3,vars.ydimen);
	}
}
