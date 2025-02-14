package Lab3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen n:  ");
		int n = scanner.nextInt();
		boolean kt =true;
		if (n<2)
			System.out.printf("%d khong phai so nguyen to",n);
		else {
			for(int i=2; i< (int)Math.sqrt(n);i++)
				if(n % i ==0 )
					kt = false;
		}
		if (kt==true)
			System.out.printf("%d la so nguyen to",n);
		else 
			System.out.printf("%d khong phai so nguyen to",n);
	}

}
