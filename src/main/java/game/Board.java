package game;

import org.w3c.dom.ls.LSOutput;
import start.Hex;
import start.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Board {

	Hex[] board = new Hex[19];

	ArrayList<Resource> availabelResources = new ArrayList<>(
			Arrays.asList(Resource.Wool, Resource.Wool, Resource.Wool, Resource.Wool, Resource.Wood, Resource.Wood,
			              Resource.Wood, Resource.Wood, Resource.Grain, Resource.Grain, Resource.Grain, Resource.Grain,
			              Resource.Brick, Resource.Brick, Resource.Brick, Resource.Ore, Resource.Ore, Resource.Ore,
			              Resource.Nothing));

	ArrayList<Integer> availableTokens = new ArrayList<>(
			Arrays.asList(2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8, 9, 9, 10, 10, 11, 11, 12));

	Resource[] harbors = new Resource[]{Resource.Wool, Resource.Wood, Resource.Grain, Resource.Brick, Resource.Ore,
			Resource.Nothing, Resource.Nothing, Resource.Nothing, Resource.Nothing};

	public void generateBoard() {

		Random random = new Random();

		for (int i = 0; i < board.length; i++) {

			Resource randomResource = availabelResources.get(random.nextInt(availabelResources.size()));
			int randomToken;

			randomToken = randomResource != Resource.Nothing ? availableTokens.get(
					random.nextInt(availableTokens.size())) : 0;


			board[i] = new Hex(randomResource, randomToken);

			availabelResources.remove(randomResource);
			if (randomToken != 0) {
				availableTokens.remove(Integer.valueOf(randomToken));
			}

		}

		for (Hex h : board) {
			System.out.println(h);
		}
	}
}
