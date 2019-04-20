import javax.swing.*;
import java.awt.*;

public class TaskEx extends JFrame{
	public TaskEx() {
		setTitle("메모장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();   // 컨테이너 개념을 모르겠음  
		// 메뉴 생성
		JMenuBar mb = new JMenuBar();
		JMenu FileMenu = new JMenu("파일(F)");
		JMenu EditMenu = new JMenu("편집(E)");
		JMenu FormMenu = new JMenu("서식(O)");
		JMenu ViewMenu = new JMenu("보기(V)");
		JMenu HelpMenu = new JMenu("도움말(H)");
	
		
		mb.add(FileMenu);
		mb.add(EditMenu);
		mb.add(FormMenu);
		mb.add(ViewMenu);
		mb.add(HelpMenu);
		setJMenuBar(mb);
		
		c.setBackground(Color.WHITE);   // 색깔 안바뀌는 이유
		c.add(new JTextArea());
		

	    
		
		setSize(300,200);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new TaskEx();

	}
}