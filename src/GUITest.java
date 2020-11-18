import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {
	private static final int WIDTH = 300;
	private static final int HEIGHT = 400;
	
	public static void main(String[] args) {
		// So far, all of our programs were sequential and they reached the END. 
		JFrame frame = new JFrame("Dark Wave");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton("Man who stare");
		JButton b2 = new JButton("At goats");
		JButton b52 = new JButton("at code monkeys");
		JButton newButton = new JButton("Do not touch");
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Stop staring");
				
			}
		});
		frame.add(b1);
		frame.add(b2);
		frame.add(b52);
		frame.add(newButton);
		
		frame.pack();
		frame.setVisible(true);
	}
}
