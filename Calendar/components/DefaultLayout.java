package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

import source.Program;

public class DefaultLayout extends JPanel {
	private static DefaultLayout INSTANCE;
	
	private DefaultLayout() {
		super();
		if (Program.window.getSize() == null) {
			setSize(Program.defaultSize.getSize());
		} else {
			setSize(Program.window.getSize());
		}
			
			
		//setSize((Program.window.getSize() == null) ? Program.defaultSize.getSize() : Program.window.getSize());
	}
	
	public static JPanel GetInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DefaultLayout();
		}
		return INSTANCE;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Polygon p = new Polygon();
		int WIDTH = Program.window.getContentPane().getWidth();
		int HEIGHT = Program.window.getContentPane().getHeight();
		p.addPoint(0, 0);
		p.addPoint(WIDTH, 0);
		p.addPoint(WIDTH, HEIGHT);
		p.addPoint(0, HEIGHT);
		p.addPoint(0, 0);
		p.addPoint(Window.BORDER_SIZE, Window.TOPBAR_HEIGHT);
		p.addPoint(WIDTH - Window.BORDER_SIZE, Window.TOPBAR_HEIGHT);
		p.addPoint(WIDTH - Window.BORDER_SIZE, HEIGHT - Window.BORDER_SIZE);
		p.addPoint(Window.BORDER_SIZE, HEIGHT - Window.BORDER_SIZE);
		p.addPoint(Window.BORDER_SIZE, Window.TOPBAR_HEIGHT);
		g.setColor(Color.RED);
		g.drawPolygon(p);
	}
}
