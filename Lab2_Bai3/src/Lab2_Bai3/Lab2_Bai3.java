package Lab2_Bai3;

import java.util.Scanner;

public class Lab2_Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out .print("Nhap so dien su dung: ");
		int d = scanner.nextInt();
		int tien ;
		if(d<50)
			tien = d*1000;
		else tien = 50*1000+(d-50)*1200;
		System.out.printf("So tien dien phai tra la %d dong",tien);

	}

}
