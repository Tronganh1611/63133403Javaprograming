package lab1;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		int dai = scanner.nextInt();
		System.out.print("Nhập chiều rộng: ");
		int rong = scanner.nextInt();
		int cv = (dai+rong)*2;
		int dt = dai*rong;
		int min = Math.min(dai, rong);
		System.out.printf("chu vi là %d \n",cv);
		System.out.printf("diện tích là %d \n",dt);
		System.out.printf("cạnh nhỏ nhất %d ",min);

	}

}
