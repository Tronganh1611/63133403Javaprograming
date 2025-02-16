package Lab3;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int n = scanner.nextInt();
		 scanner.nextLine();
		String[] sv= new String[n];
		float[] diem = new float[n];
		for(int i=0; i<n;i++) {
			System.out.printf("Nhap ten cua sinh vien thu %d : ",i+1);
			sv[i]=scanner.nextLine();
			System.out.println();
			System.out.printf("Nhap diem cua sinh vien thu %d : ",i+1);
			diem[i]=scanner.nextFloat();
			 scanner.nextLine();
		}
		
		Xepdstheodiem(n, sv, diem);
		
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + sv[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + XetHL(diem[i]));
        }
		
	}
	public static String XetHL(float diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
	public static void Xepdstheodiem(int n, String[] sv, float[] diem) {
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
            	if(diem[j] > diem[j+1]) {
            		float tam1 = diem[j];
            		diem[j]=diem[j+1];
            		diem[j+1]=tam1;
            		
            		String tam2= sv[j];
            		sv[j]=sv[j+1];
            		sv[j+1]=tam2;
            	}
            }
		}
	}
}
