import javax.swing.*;
import java.awt.*;

public class TaskEx extends JFrame{
	public TaskEx() {
		setTitle("�޸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();   // �����̳� ������ �𸣰���  
		// �޴� ����
		JMenuBar mb = new JMenuBar();
		JMenu FileMenu = new JMenu("����(F)");
		JMenu EditMenu = new JMenu("����(E)");
		JMenu FormMenu = new JMenu("����(O)");
		JMenu ViewMenu = new JMenu("����(V)");
		JMenu HelpMenu = new JMenu("����(H)");
	
		
		mb.add(FileMenu);
		mb.add(EditMenu);
		mb.add(FormMenu);
		mb.add(ViewMenu);
		mb.add(HelpMenu);
		setJMenuBar(mb);
		
		c.setBackground(Color.WHITE);   // ���� �ȹٲ�� ����
		c.add(new JTextArea());
		

	    
		
		setSize(300,200);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new TaskEx();

	}
}