package openCivV;

import javax.swing.JFrame;

public class techTree {
	public techTree(String treeFile){
		JFrame frame = new JFrame("Technology Tree");
		frame.setSize(vars.xdimen/2,vars.ydimen/2);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
