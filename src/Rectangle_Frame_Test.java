import javax.swing.JFrame;

public class Rectangle_Frame_Test extends JFrame{
	public Rectangle_Frame_Test() {
		setSize(300, 300);
		setTitle("���콺�� �簢�� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Rectangle_Frame());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Rectangle_Frame_Test s = new Rectangle_Frame_Test();
	}
}
