package test;

import java.util.Random;

public class RandomArraySum {
	public static void main(String[] args) {
		int rows = 3;
		int cols = 4;
		int [][] arr = new int[rows][cols];
		Random rand = new Random();
		int sum = 0;
		
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				arr[i][j] = rand.nextInt(10);
//				sum += arr[i][j];
//			}
//		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("합은"+sum);
	}
}
