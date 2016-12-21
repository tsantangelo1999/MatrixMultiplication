package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int[][] a = { {1, 2, -2, 0}, {-3, 4, 7, 2}, {6, 0, 3, 1} };
        final int[][] b = { {-1, 3}, {0, 9}, {1, -11}, {4, -5} };
        int[][] prod = MatrixMult.mult(a, b);
        for(int i = 0; i < prod.length; i++)
        {
            for(int j = 0; j < prod[i].length; j++)
            {
                System.out.print(prod[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
