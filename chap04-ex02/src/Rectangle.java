import java.util.Scanner;

public class Rectangle {
	int wldth;
	int height;
	
	public  Rectangle() {
		
	}
	
	public int getArea() {
		return wldth * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(); // ��ü
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է�");
		
		rect.wldth = scan.nextInt();
		rect.height = scan.nextInt();
		
		System.out.println("�簢���� ����" + rect.getArea());
		
		scan.close();

	}

}
