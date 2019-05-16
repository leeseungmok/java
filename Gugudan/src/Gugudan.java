import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gugudan extends JFrame{
	private JTextField tf = new JTextField(50);
	public Gugudan() {
		setTitle("구구단 출력");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Gugudan", SwingConstants.CENTER);

		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.setBackground(Color.WHITE);
		c.add(tf);

		JButton aa = new JButton("1단");
		JButton bb = new JButton("2단");
		JButton cc = new JButton("3단");
		JButton dd = new JButton("4단");
		JButton ee = new JButton("5단");
		JButton ff = new JButton("6단");
		JButton gg = new JButton("7단");
		JButton hh = new JButton("8단");
		JButton ii = new JButton("9단");
		
		
		aa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton bb = (JButton) e.getSource();
				for(int i=1;i<=1;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		bb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton bb = (JButton) e.getSource();
				for(int i=2;i<=2;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		cc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton cc = (JButton) e.getSource();
				for(int i=3;i<=3;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		dd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton dd = (JButton) e.getSource();
				for(int i=4;i<=4;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		ee.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton ee = (JButton) e.getSource();
				for(int i=5;i<=5;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		ff.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton ff = (JButton) e.getSource();
				for(int i=6;i<=6;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		gg.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton gg = (JButton) e.getSource();
				for(int i=7;i<=7;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		hh.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton hh = (JButton) e.getSource();
				for(int i=8;i<=8;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});
		ii.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JButton ii = (JButton) e.getSource();
				for(int i=9;i<=9;i++){
					for(int j=1;j<=9;j++){
						System.out.println(i+"x"+j+"="+i*j);
					}
					System.out.println();
				}
			}
		});

		this.add(aa);
		this.add(bb);
		this.add(cc);
		this.add(dd);
		this.add(ee);
		this.add(ff);
		this.add(gg);
		this.add(hh);
		this.add(ii);
		
		
		setSize(600,600);
		setVisible(true);
	}		

	public static void main(String[] args) {
		
		new Gugudan();

	}
	
}
