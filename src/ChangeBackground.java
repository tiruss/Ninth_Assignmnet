import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackground extends JFrame{
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	
	public ChangeBackground() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		panel = new JPanel();
		button1 = new JButton("�����");
		button1.addActionListener(new MyListener());
		panel.add(button1);
		button2 = new JButton("��ũ��");
		button2.addActionListener(new MyListener());
		panel.add(button2);
		this.add(panel);
		this.setVisible(true);
	}
			
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				panel.setBackground(Color.YELLOW);
			} else if (e.getSource() == button2 ) {
				panel.setBackground(Color.PINK);
			}
		}
	}
}

