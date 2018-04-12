package source;

import java.awt.Rectangle;

import javax.swing.SwingUtilities;

import components.Window;

public class Program {
	
	private static Rectangle defaultSize = new Rectangle(0,0,700,420); 
	public static Window window;
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        public void run() { setup(); }
	    });
	}
	
	private static void setup() {
		window = new Window("Calendar by Chaos", defaultSize);
		window.setVisible(true);
	}
}
