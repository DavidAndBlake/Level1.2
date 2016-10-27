import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Monster implements ActionListener {
	public static void main(String[] args) {

	}

	void createUI() {
		JFrame monsterFrame = new JFrame();
		JPanel monsterPanel = new JPanel();
		monsterFrame.setDefaultCloseOperation(monsterFrame.EXIT_ON_CLOSE);
		monsterFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		monsterFrame.add(monsterPanel);
		monsterFrame.setVisible(true);
		JButton ghostButton = new JButton("Ghost");
		JButton zombieButton = new JButton("Zombie");
		JButton clownButton = new JButton("It");
		monsterPanel.add(ghostButton);
		monsterPanel.add(zombieButton);
		monsterPanel.add(clownButton);
		JButton trickButton = new JButton("Trick");
		JButton treatButton = new JButton("Treat");
		monsterPanel.add(trickButton);
		monsterPanel.add(treatButton);

		ghostButton.addActionListener(this);
		zombieButton.addActionListener(this);
		clownButton.addActionListener(this);
		
		trickButton
	}

	public Monster() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
