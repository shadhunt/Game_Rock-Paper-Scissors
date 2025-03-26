package c.major.studio.input;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class RPSGui extends JFrame implements KeyListener{

	private JLabel labelInput;
	private JLabel labelInfo;
	private int index = 0;
	private String displayString = "";
	private Timer timer;
	public RPSGui() throws HeadlessException {
		super();
		this.setTitle("Rock Paper Scissors v1.0");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setLayout(new BorderLayout()); 
		labelInitialize();
		infoInitialize();
		this.setFont(new Font("Arial", Font.BOLD,20));
		this.add(labelInfo, BorderLayout.NORTH);
		this.add(labelInput, BorderLayout.CENTER);
		this.setFocusable(true);
		this.setVisible(true);
		timer.start();
		// TODO Auto-generated constructor stub
	}

	private void labelInitialize()
	{
		labelInput = new JLabel("Press an operation key...", JLabel.CENTER);
	}
	private void infoInitialize()
	{
		String[] strArray = {"Q=Rock", "W=Paper", "E=Scissors"};
		labelInfo = new JLabel();
		timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(index < strArray.length)
				{
					displayString+=strArray[index];
					labelInfo.setText(displayString);
					index++;
				}
				else {
					timer.stop();
				}
				
			}
		});
	}
	public RPSGui(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public RPSGui(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public RPSGui(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char inputChar = e.getKeyChar();
		switch(inputChar) {
			case 'q':
			case 'Q':
				labelInput.setText("Rock");
				break;
			case 'w':
			case 'W':
				labelInput.setText("Paper");
				break;
			case 'e':
			case 'E':
				labelInput.setText("Scissors");
				break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
	}
	
}
