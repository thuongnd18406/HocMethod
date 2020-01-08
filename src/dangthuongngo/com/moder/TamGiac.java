package dangthuongngo.com.moder;

public class TamGiac {
	private double a;
	private double b;
	private double c;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public TamGiac(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public TamGiac() {
		super();
	}
	@Override
	public String toString() {
		return "Chu vi = "+ tinhChuVi() +"\t Diện tích = "+tinhDienTich();
	}
	
	public double tinhChuVi()
	{
		return a+b+c;
	}
	private double tinhNuaChuVi() {
		return tinhChuVi()/2;
	}
	
	public double tinhDienTich()
	{
		double p=tinhNuaChuVi();
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	
}
