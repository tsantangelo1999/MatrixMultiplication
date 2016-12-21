package com.company;

public class MatrixMult
{
    public static int[][] mult(int[][] a, int[][] b)
    {
        int[][] result = new int[a.length][b[0].length];
        for(int i = 0; i < result.length; i++)
        {
            for(int j = 0; j < result[i].length; j++)
            {
                int sum = 0;
                for(int k = 0; k < a[0].length; k++)
                {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
