import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public JButton jokeButton = new JButton("Joke");
	public JButton answerButton = new JButton("Punchline");
	
	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}
	public void makeButtons() {
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(jokeButton);
		panel.add(answerButton);
		frame.setVisible(true);
		frame.pack();
		jokeButton.addActionListener(this);
		answerButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource()== jokeButton){
			 JOptionPane.showMessageDialog(null, "Don't look at the answer.");
		 }
		 if (e.getSource() == answerButton){
			 JOptionPane.showMessageDialog(null, "IDIOT! I told you not to look at the answer!");
		 }
	}
}
