import javax.swing.JFrame;

public class Draw_Mouse_Frame extends JFrame {
	public Draw_Mouse_Frame() {
		setSize(600, 600);
		setTitle("마우스로 그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Draw_Mouse());
		setVisible(true);
	}
	public static void main(String[] args) {
		Draw_Mouse_Frame s = new Draw_Mouse_Frame();
	}
}
