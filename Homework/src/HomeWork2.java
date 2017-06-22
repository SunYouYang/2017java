import java.util.Scanner;
public class HomeWork2 {

	public static double length(short x,short y){
		int sum = x*x+y*y;
		double sqrt = Math.sqrt(sum);
		
		return sqrt;
	}
	
	
	public static double max(double n, double m, double l){
		if((n>m)&&(n>l)) return n;
		else if((n<m)&&(m>l)) return m;
		else return l;
	}
	
	public static double sumExtra(double n, double m, double l){
		if((n>m)&&(n>l)) return m+l;
		else if((n<m)&&(m>l)) return n+l;
		else return m+n;
	}
	
	public static double Area(short x1,short y1,short x2,short y2,short x3,short y3){
		double mul = 0.5* (((x1*y2)+(x2*y3)+(x3*y1))-((x2*y1)+(x3*y2)+(x1*y3)));
		
		
		if(mul<0){return (-1)*mul;}
		else return mul;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("(x1,y1),(x2,y2),(x3,y3)값을 순서대로 입력하시오");
	
		short x1=scan.nextShort();
		short y1=scan.nextShort();
		
		System.out.println("(x1,y1)은 ("+x1+","+y1+")");
		
		short x2=scan.nextShort();
		short y2=scan.nextShort();
		
		System.out.println("(x2,y2)은 ("+x2+","+y2+")");
	
		short x3=scan.nextShort();
		short y3=scan.nextShort();
		
		System.out.println("(x3,y3)은 ("+x3+","+y3+")");
	
		double a= length(x1,y1);
		double b= length(x2,y2);
		double c= length(x3,y3);
		
		scan.close();
		
		if(max(a,b,c)<sumExtra(a,b,c)){
			System.out.println("삼각형을 만들 수 있습니다.");
		}
		else System.out.println("삼각형을 만들 수 없습니다.");
		
		System.out.println("삼각형의 면적은"+Area(x1,y1,x2,y2,x3,y3));
	
	}

}
