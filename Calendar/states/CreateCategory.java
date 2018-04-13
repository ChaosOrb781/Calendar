package states;

import java.awt.Color;

import javax.swing.JPanel;

public class CreateCategory extends DefaultScreen implements IState {
	private JPanel INSTANCE;
		
	private CreateCategory() {
		super();
		setBackground(Color.GREEN);
	}
	
	public JPanel GetInstance() {
		if (INSTANCE == null) {
			INSTANCE = new CreateCategory(); 
		}
		return INSTANCE;
	}

	@Override
	public void Render() { }
}
