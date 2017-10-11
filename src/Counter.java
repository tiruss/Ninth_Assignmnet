import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Counter extends JFrame implements ActionListener{
	private JLabel label1, label2;
	private JButton button;
	private int count = 0;
	public Counter() {
		JPanel panel = new JPanel();
		label1 = new JLabel("Counter");
		panel.add(label1);
		label2 = new JLabel("" + count);
		label2.setFont(new Font("Serif", Font.BOLD| Font.ITALIC, 100));
		panel.add(label2);
		
		button = new JButton("카운터 증가");
		panel.add(button);
		button.addActionListener(this);
		add(panel);
		setSize(300, 200);
		setTitle("저의 카운터 입니다");
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label2.setText(""+count);
	}
}
