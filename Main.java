
public class Main {

	public static void main(String[] args) {
		Snake snake = new Snake(4, 0, 1, 0);
		SnakePart P1 = new SnakePart(3,0,0,0,snake);
		SnakePart P2 = new SnakePart(2,0,0,0, snake);
		SnakePart P3 = new SnakePart(1,0,0,0, snake);
		SnakePart P4 = new SnakePart(0,0,0,0, snake);
		//new BoardGraphics(snake, 50);
		new BoardGraphics();
	}
}
