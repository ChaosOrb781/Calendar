package components;

import java.awt.Rectangle;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame {	
	public Window(String title, int width, int height) {
		super();
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public Window(String title, Rectangle rect) {
		this(title, rect.width, rect.height);
		setLocation(rect.x, rect.y);
	}
} 
