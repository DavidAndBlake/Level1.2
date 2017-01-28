import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListWords {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		ArrayList<String> list = new ArrayList<String>();
		list.add("A word");
		list.add("laserbeam");
		String listChoice = list.get((int) (Math.random() * 2));
		String question = JOptionPane.showInputDialog("Type the following: " + listChoice);

		if (question.equals(listChoice)) {
			System.out.println("f");
			double stop = System.currentTimeMillis();
			JOptionPane.showMessageDialog(null, "Correct! Your time was " + (stop - start) / 1000 + " seconds.");
		}

		else {
			JOptionPane.showMessageDialog(null, "You suck. 0/10");
		}

	}
}
