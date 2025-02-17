package Lab4;

import java.util.Scanner;

public class Sanpham {
	private String tensp;
    private double dongia;
    private double giamgia;
	public Sanpham(String tensp, double dongia, double giamgia) {
		super();
		this.tensp = tensp;
		this.dongia = dongia;
		this.giamgia = giamgia;
	}
	public Sanpham() {
		
	}
	public Sanpham (String tensp, double dongia) {
		this.tensp = tensp;
		this.dongia = dongia;
	}
	public  void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tensp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        dongia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamgia = scanner.nextDouble();
    }

    public  double getThueNhapKhau() {
        return dongia * 0.1;
    }

    public  void xuat() {
        System.out.println("Tên sản phẩm: " + tensp);
        System.out.println("Đơn giá: " + dongia);
        System.out.println("Giảm giá: " + giamgia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public static void main(String[] args) {
		Sanpham sp = new Sanpham();
		sp.xuat();
		sp.nhap();
	}



}
