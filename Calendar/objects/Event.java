package objects;

import java.text.SimpleDateFormat;

import javax.swing.JPanel;

import source.Program;

public class Event {
	public String title;
	public String subtitle;
	public String note;
	public SimpleDateFormat date;
	public Category category;
	
	private JPanel panel;
	private int WIDTH = Program.window.getWidth() - 20;
	private int HEIGHT = 36;
	private int MARGIN_TOP = 4;
	private int MARGIN_BOTTOM = 4;
	private int MARGIN_LEFT = 6;
	private int MARGIN_RIGHT = 6;
	
	
	public Event(String title, String subtitle, String note, SimpleDateFormat date, Category category) {
		this.title = title;
		this.subtitle = subtitle;
		this.note = note;
		this.date = date;
		this.category = category;
		
	}
	
	public JPanel GetPanel() { 
		if (panel != null) { 
			return panel;
		} else {
			panel = new JPanel();
			panel.setSize(WIDTH, HEIGHT);
			return panel;
		}			
	}
}
