import javax.swing.JFrame;

public class Signal_Light_Frame extends JFrame{
	public Signal_Light_Frame() {
		add(new Signal_Light());
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Signal_Light_Frame();
	}
}
