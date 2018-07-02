import javax.swing.JOptionPane;

public class TestGameOfLife {

	public static void setBoard(GameOfLife board) {
		// the two alive cells in the upper left
		board.setCellState(3, 4, GameOfLife.ALIVE);
		board.setCellState(4, 4, GameOfLife.ALIVE);
		// the block in the upper right
		board.setCellState(3, 13, GameOfLife.ALIVE);
		board.setCellState(3, 14, GameOfLife.ALIVE);
		board.setCellState(4, 13, GameOfLife.ALIVE);
		board.setCellState(4, 14, GameOfLife.ALIVE);
		// the beehive in the center
		board.setCellState(8, 7, GameOfLife.ALIVE);
		board.setCellState(8, 8, GameOfLife.ALIVE);
		board.setCellState(9, 6, GameOfLife.ALIVE);
		board.setCellState(9, 9, GameOfLife.ALIVE);
		board.setCellState(10, 7, GameOfLife.ALIVE);
		board.setCellState(10, 8, GameOfLife.ALIVE);
		// tje g;oder om tje ;pwer ;eft
		board.setCellState(15, 6, GameOfLife.ALIVE);
		board.setCellState(16, 4, GameOfLife.ALIVE);
		board.setCellState(16, 6, GameOfLife.ALIVE);
		board.setCellState(17, 5, GameOfLife.ALIVE);
		board.setCellState(17, 6, GameOfLife.ALIVE);
		// the blinker in the lower right
		board.setCellState(13, 13, GameOfLife.ALIVE);
		board.setCellState(13, 14, GameOfLife.ALIVE);
		board.setCellState(13, 15, GameOfLife.ALIVE);
	}

	public static void main(String[] args) {
		GameOfLife life = null;
		life = new MyGameOfLife();
		setBoard(life);

		System.out.println("Generation 0:");
		System.out.println(life.toString());

		life.nextGeneration();
		JOptionPane.showMessageDialog(null, "Click OK to continue.");
		System.out.println("Generation 1:");
		System.out.println(life);
		System.out.println();

		life.nextGeneration();
		JOptionPane.showMessageDialog(null, "Click OK to continue.");
		System.out.println("Generation 2:");
		System.out.println(life);
		System.out.println();

		life.nextGeneration();
		JOptionPane.showMessageDialog(null, "Click OK to continue.");
		System.out.println("Generation 3:");
		System.out.println(life);
		System.out.println();

		life.nextGeneration();
		JOptionPane.showMessageDialog(null, "Click OK to continue.");
		System.out.println("Generation 4:");
		System.out.println(life);
		System.out.println();

		life.nextGeneration();
		JOptionPane.showMessageDialog(null, "Click OK to continue.");
		System.out.println("Generation 5:");
		System.out.println(life);
		System.out.println();

		life.nextGeneration();
		JOptionPane.showMessageDialog(null, "Click OK to continue.");
		System.out.println("Generation 6:");
		System.out.println(life);
		System.out.println();

	}

}
