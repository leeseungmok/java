import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class RandomThread extends Thread{
    	private Container contentPane;
    	private boolean flag=false;
    	public RandomThread(Container contentPane){
    		this.contentPane = contentPane;
    	}
    	
    	void finish(){
    		flag = true;  // 스레드 종료 명령 flag에 표시 
    		
    	}
    	
    	public void run(){
    		while(true){
    			int x = ((int)(Math.random()*contentPane.getWidth()));
    			int y = ((int)(Math.random()*contentPane.getHeight()));
    			JLabel label = new JLabel("Java");
    			label.setSize(80 , 30);
    			label.setLocation(x, y);
    			contentPane.add(label);
    			contentPane.repaint();
    			try{
    				Thread.sleep(300);
    				if(flag==true){
    					contentPane.removeAll();
    					label = new JLabel("finish");
    					label.setSize(80, 30);
    					label.setLocation(100, 100);
    					label.setForeground(Color.RED);
    					contentPane.add(label);
    					contentPane.repaint();
    					return;
    				}
    			}
    			catch(InterruptedException e) {return; }
    		}
    	}
    	
	

}
