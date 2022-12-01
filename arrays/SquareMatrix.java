package com.assignments.arrays;

import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		// create a object of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows/columns ");
		int rc = sc.nextInt();

		try {
			if (rc>0) {
				int mat[][] = new int[rc][rc];
				System.out.println("Enter all the values of matrix ");
				// take input matrix
				for (int i = 0; i < rc; i++) {
					for (int j = 0; j < rc; j++) {
						mat[i][j] = sc.nextInt();
					}
				}
				System.out.println("*******************************");
				System.out.println("original Matrix:");
				System.out.println("*******************************");
				// print original matrix
				for (int i = 0; i < rc; i++) {
					for (int j = 0; j < rc; j++) {
						System.out.print(mat[i][j] + "\t");
					}
					System.out.println("");
				}
				System.out.println("*******************************");
				for (int i = 0; i < rc; i++) {

					for (int j = 0; j < rc; j++) {
						if (i == 0) {
							if (j == 0) {
								System.out.print("First row of matrix => ");
							}
							System.out.print(mat[i][j] + " ");
						} else if (i == rc - 1) {
							if (j == 0) {
								System.out.print("Last row of matrix => ");
							}
							System.out.print(mat[i][j] + " ");
						} else
							break;

					}
					System.out.println("");
				}
				System.out.println("");
				for (int j = 0; j < rc; j++) {
					for (int i = 0; i < rc; i++) {
						if (j == 0) {
							if (i == 0) {
								System.out.print("First column of matrix => ");
								System.out.print(mat[i][j] + "\n");
							} else {
								System.out.print("                          " + mat[i][j] + "\n");
							}
						} else if (j == rc - 1) {
							if (i == 0) {
								System.out.print("Last column of matrix => ");
								System.out.print(mat[i][j] + "\n");
							} else {
								System.out.print("                         " + mat[i][j] + "\n");
							}

						} else
							break;

					}
					System.out.println("");
				} 
			}else {
				System.out.println("Enter valid input .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}

	}

}
