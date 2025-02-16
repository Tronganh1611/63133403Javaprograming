package Arraylist;

import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		//tạo 2 sp
		Sanpham sp = new Sanpham();
		Sanpham sp1 = new Sanpham(2, "Quan Jean", "Quan" ,"qj.jpg");
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
			System.out.println(x.toString());
	}

}