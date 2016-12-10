package openCivV;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class topRightLayout implements LayoutManager{
	private int vgap;
	public topRightLayout(){
		this(5);
	}
	public topRightLayout(int v){
		vgap = v;
	}
	/* Required by LayoutManager. */
    public void addLayoutComponent(String name, Component comp) {
    }

    /* Required by LayoutManager. */
    public void removeLayoutComponent(Component comp) {
    }
	@Override
	public void layoutContainer(Container parent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}
}
