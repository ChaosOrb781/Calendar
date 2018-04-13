package states;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EventDisplay extends DefaultScreen{
	private JPanel INSTANCE;
	
	private EventDisplay() {
		super();
		setBackground(Color.RED);
	}
	
	public JPanel GetInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EventDisplay(); 
		}
		return INSTANCE;
	}
}
