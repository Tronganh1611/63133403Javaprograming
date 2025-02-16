package Lab3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n;i++) {
			System.out.printf("Nhap phan tu thu %d cua mang: ",i+1);
			a[i]=scanner.nextInt();
		}
		 Arrays.sort(a);
		 System.out.printf("Mang da duoc xep: ");
			for(int i:a)
				System.out.printf("%d ",i);
		System.out.println();
		System.out.printf("Phan tu nho nhat trong mang la %d ",a[0]);
		System.out.println();
		int t=0;
		int d=0;
		for(int i=0; i<n;i++) {
			if(a[i]%3==0) {
				t = t+a[i];
				d++;
			}
		}
		System.out.printf("Trung binh cong cac so chia het cho 3: %.2f ",(float)t/d);
	}

}
