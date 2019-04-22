package aaaa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class aaaaa extends JFrame {
	public aaaaa() {
		setTitle("리스너 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.setBackground(Color.MAGENTA);

		JButton a = new JButton("리스너");
		a.setBackground(Color.BLUE);
		a.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton b = (JButton) e.getSource();
				if (b.getBackground().equals(Color.BLUE)) {
					b.setBackground(Color.GREEN);
				} else {
					b.setBackground(Color.BLUE);
				}

			}
		});

		this.add(a);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new aaaaa();
	}

}
