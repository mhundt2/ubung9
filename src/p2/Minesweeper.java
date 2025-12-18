package p2;

public class Minesweeper {

    public static int[][] grid = new int[3][3];

    public static void main(String[] args) {
        grid[0][1] = -1;
        grid[1][2] = -1;
        grid[2][2] = -1;

        calculateGrid();
        printGrid();
    }

    public static void calculateGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != -1) {
                    grid[i][j] = countAdjacentMines(i, j);
                }
            }
        }
    }

    public static int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < 3 && j >= 0 && j < 3) {
                    if (grid[i][j] == -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void printGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}


