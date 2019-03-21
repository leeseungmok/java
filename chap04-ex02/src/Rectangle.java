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
		Rectangle rect = new Rectangle(); // 객체
		Scanner scan = new Scanner(System.in);
		System.out.print("입력");
		
		rect.wldth = scan.nextInt();
		rect.height = scan.nextInt();
		
		System.out.println("사각형의 면적" + rect.getArea());
		
		scan.close();

	}

}
