import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

      class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	
	    public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
		
	

	@Override
	public void run() {
		int n=0;
		while(true){
			timerLabel.setText(Integer.toString(n));
			n++;
			try{
			    Thread.sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
		}
		
	}
	

}
