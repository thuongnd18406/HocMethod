package dangthuongngo.com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import dangthuongngo.com.moder.NhanVien;

public class TestNhanVien {
	public static void main(String[] args) {
		NhanVien teo=new NhanVien();
		teo.setMa("NV1");
		teo.setTen("Tèo đại bàng");
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,2001);
		cal.set(Calendar.MONTH,Calendar.APRIL);
		cal.set(Calendar.DATE,15);
		teo.setNamSinh(cal);
		Date dns=cal.getTime(); //có thể dùng
		System.out.println(teo);
		
		//SỰ CỐ Y2K
		//Ngày xưa hệ thống lưu 2 số cuối của năm
		//ví dụ 1982-->82
		//thì 1900-->00, 2000-->00
		Date d=new Date(1970,2,15);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d));

	}
}
