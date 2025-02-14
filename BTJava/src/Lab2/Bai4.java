package Lab2;

import java.util.Scanner;

public class Bai4 {
	
	public static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập biến a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập biến b: ");
		int b = scanner.nextInt();
		if(a == 0){
			if(b == 0){
			System.out.print("Phương trình có vô số nghiệm");
			}
			else{ System.out.print("Phương trình vô nghiệm");
			}
		}
		else {
			double x=(double)-b/a;
			System.out.printf("nghiệm của phương trình là x = %.2f", x);
			
		}
	}
	
	public static void giaiPTB2() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập biến a: ");
		int a = scanner.nextInt();
		System.out.print("Nhập biến b: ");
		int b = scanner.nextInt();
		System.out.print("Nhập biến c: ");
		int c = scanner.nextInt();
		if (a==0) {
			if(b == 0){
				if(c == 0){
				System.out.print("Phương trình có vô số nghiệm");
				}
				else{ System.out.print("Phương trình vô nghiệm");
				}
			}
			else {
				double x=(double)-c/b;
				System.out.printf("nghiệm của phương trình là x = %.2f", x);
				
			}
		}else {
			double Delta = Math.pow(b, 2) - 4 * a * c ;
			if (Delta <0) System.out.print("Phương trình vô nghiệm");
			else if (Delta == 0) System.out.printf("phương trình có nghiệm kép là x = %.2f", (double)-b/(2*a));
			else if (Delta > 0) System.out.printf("phương trình có 2 nghiệm là x1 = %.2f, x2 = %.2f", (-b+Math.sqrt(Delta))/(2*a),(-b-Math.sqrt(Delta))/(2*a));
			
		}

	}
	
	public static void tinhTienDien() {
		Scanner scanner = new Scanner(System.in);
		System.out .print("Nhap so dien su dung: ");
		int d = scanner.nextInt();
		int tien ;
		if(d<50)
			tien = d*1000;
		else tien = 50*1000+(d-50)*1200;
		System.out.printf("So tien dien phai tra la %d dong",tien);
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ma;
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            ma = scanner.nextInt();
            switch (ma) {
            case 1:
                giaiPTB1();
                break;
            case 2:
                giaiPTB2();
                break;
            case 3:
                tinhTienDien();
                break;
            case 4:
                System.out.println("Kết thúc chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
        }}
}
