package randomNum;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RandomNum implements ActionListener {
	
	public int screenWidth;
	public int screenHeight;
	
	public static void main(String[] args) {
		RandomNum randomNum = new RandomNum();
		randomNum.everything();
		
	}
	private void everything() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.setText("Click this button");
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		screenSetting();
		frame.setSize(screenWidth, screenHeight);
		button.addActionListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	public void screenSetting()
	{
		screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, (int)(Math.random()*100000));
		
	}
	
}
