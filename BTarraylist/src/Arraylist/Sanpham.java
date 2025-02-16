package Arraylist;

public class Sanpham {
	int maSp;
	String tenSp;
	String loaiSp;
	String anhSp;
	
	public Sanpham() {
		
	}
	public Sanpham(int maSp, String tenSp, String loaiSp, String anhSp) {
		super();
		this.maSp = maSp;
		this.tenSp = tenSp;
		this.loaiSp = loaiSp;
		this.anhSp = anhSp;
	}
	public int getMaSp() {
		return maSp;
	}
	public void setMaSp(int maSp) {
		this.maSp = maSp;
	}
	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public String getLoaiSp() {
		return loaiSp;
	}

	public void setLoaiSp(String loaiSp) {
		this.loaiSp = loaiSp;
	}

	public String getAnhSp() {
		return anhSp;
	}

	public void setAnhSp(String anhSp) {
		this.anhSp = anhSp;
	}
	
	@Override
	public String toString() {
		return "Sanpham [maSp=" + maSp + ", tenSp=" + tenSp + ", loaiSp=" + loaiSp + ", anhSp=" + anhSp + "]";
	}
	

}