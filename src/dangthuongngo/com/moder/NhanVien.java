package dangthuongngo.com.moder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NhanVien {
	private String ma;
	private String ten;
	private Calendar namSinh;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Calendar getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(Calendar namSinh) {
		this.namSinh = namSinh;
	}
	private String hienThiNgayThang()
	{
		String s="";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d=namSinh.getTime();
		s=sdf.format(d);
		return s;
	}
	@Override
	public String toString() {
		return ma+"\t"+ten+"\t"+hienThiNgayThang();
	}

}
