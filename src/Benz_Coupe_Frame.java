import javax.swing.JFrame;

public class Benz_Coupe_Frame extends JFrame{
	public Benz_Coupe_Frame() {
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Benz_Coupe());
		setVisible(true);
	}
	public static void main(String[] args) {
		Benz_Coupe_Frame s = new Benz_Coupe_Frame();
	}
}
