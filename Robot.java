import java.awt.Point;
import java.util.Random;

public class Robot {
	Random random;
	int currX = -1;
	int currY = -1;
	int startX = -1;
	int startY = -1;
	public Robot(int x, int y) {
		random = new Random();
		random.setSeed(12345);
		this.currX = x;
		this.currY = y;
		this.startX = x;
		this.startY = y;
	}
	public Point getLocation() {
		return new Point(currX, currY);
	}
	public double getDistanceFromStart() {
		return getDistanceBetweenPoints();
	}
	public void makeRandomMove() {
		int dir = random.nextInt(4);
		switch (dir) {
			case 0:
				currY--;
				break;
			case 1: 
				currY++;
				break;
			case 2:
				currX++;
				break;
			case 3:
				currX--;
				break;
		}
	}
	private double getDistanceBetweenPoints() {
		int changeInX = Math.abs(currX - startX);
		int changeInY = Math.abs(currY - startY);
		return Math.sqrt((changeInX * changeInX) + (changeInY * changeInY));
	}
}
