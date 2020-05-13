package solutions;

import solutions.configuration.PrintArrayAbstractClass;

public class E02 extends PrintArrayAbstractClass {

    private int[] arrX;
    private int[] arrY;

    private int maxIncreaseKeepingSkyline(int[][] grid) {
        getMaxInterSect(grid);
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                int num = Math.min(arrX[i], arrY[j]);
                sum += (num - grid[i][j]);
            }
        }
        return sum;
    }

    private void getMaxInterSect(int[][] grid) {
        int n = grid.length;
        arrX = new int[n];
        arrY = new int[n];
        for (int i = 0; i < n; i++) {
            int maxX = -1;
            int maxY = -1;
            for (int j = 0; j < n; j++) {
                maxX = Math.max(maxX, grid[i][j]);
                maxY = Math.max(maxY, grid[j][i]);
            }
            arrX[i] = maxX;
            arrY[i] = maxY;
        }

    }

    @Override
    public void run() {
       int[][] grid = new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
}
