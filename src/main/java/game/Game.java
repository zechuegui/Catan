package game;

import start.HexagonPanel;

import javax.swing.*;
import java.util.Random;

public class Game {

	public static void main(String[] args) {

		Game game = new Game();

		int[] dices = game.rollDices();

		for (int dice : dices) {
			System.out.println(dice);
		}

//		JFrame frame = new JFrame();
//
//		for (int i = 0; i < 20; i++) { // Add all hex's
//
//			HexagonPanel hexagonPanel = new HexagonPanel();
////			hexagonPanel.setBounds();
//
//
//		}
//
//		frame.add(new HexagonPanel());
//		frame.add(new HexagonPanel());
//		frame.add(new HexagonPanel());
//
//		frame.pack();
//		frame.setVisible(true);

		Board b = new Board();

		b.generateBoard();
	}

	private int[] rollDices() {

		Random random = new Random();
		int[] dices = new int[2];

		dices[0] = random.nextInt(6) + 1;
		dices[1] = random.nextInt(6) + 1;

		return dices;
	}
}
