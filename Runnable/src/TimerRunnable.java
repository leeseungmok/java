import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel){
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
