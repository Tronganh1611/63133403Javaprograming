package Lab1_Bai3_TheTich;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		double tt = Math.pow(canh, 3);
		System.out.printf("Thể tích: %.2f ",tt);

	}

}
