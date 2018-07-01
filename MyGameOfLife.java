import java.util.Arrays;

public class MyGameOfLife implements GameOfLife {

	private static int[][] table;
	private int rows = 19;
	private int columns = 19;
	private int num = 0;

	public MyGameOfLife() {
		table = new int[rows][columns];

		for (int[] innerArr : table)
			Arrays.fill(innerArr, 0);

	}

	public static void main(String[] args) {
		new MyGameOfLife();
	}

	@Override
	public int getCellState(int row, int col) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCellState(int row, int col, int state) {
		// TODO Auto-generated method stub
		table[row - 1][col - 1] = state;
	}

	@Override
	public void nextGeneration() {
		// TODO Auto-generated method stub
		int neighbors = 0;
		int subtractor = -1;
		int[][] nextGen = new int[rows][columns];

		for (int[] innerArr : nextGen) {
			Arrays.fill(innerArr, 0);
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (table[i][j] != nextGen[i][j]) {
					if (table[i][j] == 1) {
						for (int check = 0; check < 3; check++) {
							if (table[i - 1][j + subtractor] == 1) {
								neighbors++;
								subtractor++;
							} else {
								subtractor++;
							}
						}
						subtractor = -1;
						for (int check = 0; check < 3; check++) {
							if (table[i][j + subtractor] == 1) {
								neighbors++;
								subtractor++;
							} else {
								subtractor++;
							}
						}
						subtractor = -1;
						for (int check = 0; check < 3; check++) {
							if (table[i + 1][j + subtractor] == 1) {
								neighbors++;
								subtractor++;
							} else {
								subtractor++;
							}
						}
						subtractor = -1;
						neighbors = neighbors - 1;
						if (neighbors == 2) {
							nextGen[i][j] = 1;
						} else if (neighbors == 3) {
							nextGen[i][j] = 1;
						} else {
							nextGen[i][j] = 0;
						}
						neighbors = 0;

					} else {

					}

				} else {
					if (i == 0 | i == 18) {

					}
					for (int check = 0; check < 3; check++) {
						if (table[i - 1][j + subtractor] == 1) {
							neighbors++;
							subtractor++;
						} else {
							subtractor++;
						}
					}
					subtractor = -1;
					for (int check = 0; check < 3; check++) {
						if (table[i][j + subtractor] == 1) {
							neighbors++;
							subtractor++;
						} else {
							subtractor++;
						}
					}
					subtractor = -1;
					for (int check = 0; check < 3; check++) {
						if (table[i + 1][j + subtractor] == 1) {
							neighbors++;
							subtractor++;
						} else {
							subtractor++;
						}
					}
					subtractor = -1;
					if (neighbors == 3) {
						nextGen[i][j] = 1;
					} else {
						nextGen[i][j] = 0;
					}
					neighbors = 0;

				}
			}
		}
		table = nextGen;

	}

	public String toString() {
		String newTable = "";
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if (table[i][j] == 0) {
					newTable += ". ";
				} else {
					newTable += "0 ";
				}
			}
			newTable += "\n";
		}
		return newTable;

	}

}
