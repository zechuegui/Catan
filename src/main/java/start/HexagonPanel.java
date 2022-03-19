package start;

import javax.swing.*;
import java.awt.*;

public class HexagonPanel extends JPanel {

	public HexagonPanel() {

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Polygon polygon = new Polygon();

		for (int i = 0; i < 6; i++) {
			int xval = (int) (20 + 20
			                             * Math.cos(i * 2 * Math.PI / 6D));
			int yval = (int) (20 + 20
			                             * Math.sin(i * 2 * Math.PI / 6D));
			polygon.addPoint(xval, yval);
		}


		g.drawPolygon(polygon);
	}
}
