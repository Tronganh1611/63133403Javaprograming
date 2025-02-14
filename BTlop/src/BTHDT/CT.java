package BTHDT;

import java.util.ArrayList;

import BTHDT.Sanpham;

public class CT {

	public static void main(String[] args) {
		//tạo 2 sp
		Sanpham sp = new Sanpham();
		Sanpham sp1 = new Sanpham(2, "Quan Jean", "Quan" ,"qj.jpg");
		sp.setMaSp(1);
		sp.setTenSp("Ao so mi");
		sp.setLoaiSp("Ao");
		sp.setAnhSp("ao.jpg");
		//in thong tin
		String Thongtinsp1=sp.toString();
		String Thongtinsp2 = "Sanpham [maSp=" + sp1.maSp + ", tenSp=" + sp1.tenSp + ", loaiSp=" + sp1.loaiSp + ", anhSp=" + sp1.anhSp + "]";
//		System.out.println(Thongtinsp1);
//		System.out.println(Thongtinsp2);
		ArrayList<Sanpham> dsSp;
		//Tao  moi
		dsSp = new ArrayList<Sanpham>();
		
		//Nhap 3 san pham
		Sanpham sp2 = new Sanpham(2, "Quan Jean", "Quan" ,"qj.jpg");
		Sanpham sp3 = new Sanpham(3, "Quan Jean", "Quan" ,"qj.jpg");
		Sanpham sp4 = new Sanpham(4, "Quan Jean", "Quan" ,"qj.jpg");
		//Them san pham vao ds
		dsSp.add(sp);
		dsSp.add(sp1);
		dsSp.add(sp2);
		dsSp.add(sp3);
		dsSp.add(sp4);
		
		for (Sanpham x : dsSp)
			System.out.println(sp.toString());
	}

}