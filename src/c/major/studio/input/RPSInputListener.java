package c.major.studio.input;

import java.io.IOException;

public class RPSInputListener implements Runnable{
	private boolean isDebugged=true;
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
//		while(true)
//		{
			if(isDebugged)
			{
				System.out.println("in run...");
			}
			int intChar = -1;
			try {
				intChar = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			char receivedChar = (char)intChar;
			if(isDebugged)
			{
				System.out.println("received:"+receivedChar);
			}
//		}
	}
}
