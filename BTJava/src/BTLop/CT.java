package BTLop;

public class CT {

	public static void main(String[] args) {
		Sanpham sp = new Sanpham();
		Sanpham sp1 = new Sanpham(2, "Quan Jean", "Quan" ,"qj.jpg");
		sp.setMaSp(1);
		sp.setTenSp("Ao so mi");
		sp.setLoaiSp("Ao");
		sp.setAnhSp("ao.jpg");
		//in thong tin
		String Thongtinsp1=sp.toString();
		String Thongtinsp2 = "Sanpham [maSp=" + sp1.maSp + ", tenSp=" + sp1.tenSp + ", loaiSp=" + sp1.loaiSp + ", anhSp=" + sp1.anhSp + "]";
		System.out.println(Thongtinsp1);
		System.out.println(Thongtinsp2);

	}

}
