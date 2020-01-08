package dangthuongngo.com.test;

import dangthuongngo.com.moder.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg1 =new TamGiac();
		tg1.setA(4);
		tg1.setB(5);
		tg1.setC(6);
		System.out.println(tg1);
		//ta không thể truy suất vào Support method (private)
		
		
		//dùng constructure đầy đủ đối số
		TamGiac tg2=new TamGiac(6,8,10);
		System.out.println(tg2);
	}

}
