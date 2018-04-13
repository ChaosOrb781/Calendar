package source;

import java.awt.Rectangle;

import javax.swing.SwingUtilities;

import components.Window;

public class Program {
	
	public static Rectangle defaultSize = new Rectangle(0,0,700,420); 
	public static Window window;
	
	public static void main(String[] args) {
		window = new Window("Calendar by Chaos", defaultSize);
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() { setup(); }
	    });
	}
	
	private static void setup() {
		window.setVisible(true);
	}
}
