package states;

import java.awt.Color;

import javax.swing.JPanel;

public class CreateEvent extends DefaultScreen implements IState {
	private JPanel INSTANCE;
	
	private CreateEvent() {
		super();
		setBackground(Color.YELLOW);
	}
	
	public JPanel GetInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CreateEvent(); 
		}
		return INSTANCE;
	}

	@Override
	public void Render() { }
}
