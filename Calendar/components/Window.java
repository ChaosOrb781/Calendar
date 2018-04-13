package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Window extends JFrame {	
	public static int BORDER_SIZE = 5;
	public static int TOPBAR_HEIGHT = 30;
	
	public Window(String title, int width, int height) {
		super();
		setTitle(title);
		setSize(width, height);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		add(DefaultLayout.GetInstance());
	}
	
	public Window(String title, Rectangle rect) {
		this(title, rect.width, rect.height);
		setLocation(rect.x, rect.y);
	}
} 
