import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.
//
public class CutenessTV implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	

public static void main(String[] args)
{
	CutenessTV tv = new CutenessTV();
	tv.makeGUI();
}

public void makeGUI()
{
	frame = new JFrame();
	frame.setVisible(true);
	panel = new JPanel();
	frame.add(panel);
	button1 = new JButton();
	button2 = new JButton();
	button3 = new JButton();
	panel.add(button1);
	button1.addActionListener(this);
	panel.add(button2);
	button2.addActionListener(this);
	panel.add(button3);
	button3.addActionListener(this);
}

	

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1)
		{
			showDucks();
		}
		if (e.getSource() == button2)
		{
			showFrog();
		}
		if (e.getSource() == button3)
		{
			showFluffyUnicorns();
		}
	}
}