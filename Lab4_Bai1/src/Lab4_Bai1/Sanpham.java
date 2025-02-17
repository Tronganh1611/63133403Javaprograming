package Lab4_Bai1;

import java.util.Scanner;


public class Sanpham {
	private static String tensp;
	private static double dongia;
    private static double giamgia;
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
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}
	public static  void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tensp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        dongia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamgia = scanner.nextDouble();
    }

    public static  double getThueNhapKhau() {
        return dongia * 0.1;
    }

    public static  void xuat() {
        System.out.println("Tên sản phẩm: " + tensp);
        System.out.println("Đơn giá: " + dongia);
        System.out.println("Giảm giá: " + giamgia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public static void main(String[] args) {
		nhap();
		xuat();
	}



}
