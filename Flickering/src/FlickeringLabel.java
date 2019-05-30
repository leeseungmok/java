import java.awt.Color;

import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
    	private long delay;
    	public FlickeringLabel(String text, long delay){
    		super(text);
    		this.delay = delay;
    		setOpaque(true);
    		Thread th = new Thread(this);
    		th.start();
    	}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int n=0;
			while(true){
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n == 0)n = 1;
			else n = 0;
			try{
				Thread.sleep(delay);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}

}
