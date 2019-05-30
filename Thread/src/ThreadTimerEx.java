import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx(){
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	    Container c = getContentPane();
	    c.setLayout(new FlowLayout());
	    
	    JLabel timerLabel = new JLabel();
	    timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
	    c.add(timerLabel);
	    
	    TimerThread th = new TimerThread(timerLabel);
	    
	    setSize(300 ,170);
	    setVisible(true);
	    
	    th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ThreadTimerEx();
	}

}