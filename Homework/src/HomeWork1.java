import java.util.Scanner;
public class HomeWork1 {
	
	public static short max(short n, short m, short l){
		if((n>m)&&(n>l)) return n;
		else if((n<m)&&(m>l)) return m;
		else return l;
	}
	
	public static int sumExtra(int n, int m, int l){
		if((n>m)&&(n>l)) return m+l;
		else if((n<m)&&(m>l)) return n+l;
		else return m+n;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������� 3�� �Է��Ͻÿ�.");
		
		short a = scan.nextShort();
		short b = scan.nextShort();
		short c = scan.nextShort();
		
		scan.close();
		
		if(max(a,b,c)<sumExtra(a,b,c)){
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		}
		else System.out.println("�ﰢ���� ���� �� �����ϴ�.");
	}

}
