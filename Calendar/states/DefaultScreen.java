package states;

import java.awt.Color;

import javax.swing.JPanel;

import source.Program;

@SuppressWarnings("serial")
public class DefaultScreen extends JPanel {
	protected int MARGIN_TOP = 4;
	protected int MARGIN_BOTTOM = 4;
	protected int MARGIN_LEFT = 6;
	protected int MARGIN_RIGHT = 6;
	protected int WIDTH = Program.window.getWidth() - MARGIN_LEFT - MARGIN_RIGHT;
	protected int HEIGHT = Program.window.getHeight() - MARGIN_TOP - MARGIN_BOTTOM;
	
	protected DefaultScreen() {
		super();
		setLocation(MARGIN_LEFT, MARGIN_TOP);
		setSize(WIDTH, HEIGHT);
		
		//Debug
		setBackground(Color.BLUE);
	}
}
