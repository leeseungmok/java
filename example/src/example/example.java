package example;

import java.util.Random;
import java.util.Scanner;


public class example {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int score = 0;

		while (score <= 3) {

			System.out.println("��������� �Է��Ͻÿ�(0~2): ");
			int user = scanner.nextInt(); // ����ڰ� �޾ƿ�
			int computer = random.nextInt(3);

			switch (user) {
			case 0:
				System.out.println("������ ���̽��ϴ�");
				break;
			case 1:
				System.out.println("������ ���̽��ϴ�");
				break;
			case 2:
				System.out.println("���� ���̽��ϴ�");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				System.exit(0);
			}
			

			if (computer == 0) { // ��ǻ�� ����
				System.out.print("��ǻ�ʹ� ����");
			} else if (computer == 1) {
				System.out.print("��ǻ�ʹ� ����");
			} else if (computer == 2) {
				System.out.print("��ǻ�ʹ� ��");
			}
			System.out.println("�� ���̽��ϴ�");

			if (user == computer) {
				System.out.println("�����ϴ� 0��");
				score = score + 0;
			} else if (user == 1 && computer == 0) {
				System.out.println("�̰���ϴ� 1��");
				score = score + 1;
			} else if (user == 0 && computer == 2) {
				System.out.println("�̰���ϴ� 1��");
				score = score + 1;
			} else if (user == 2 && computer == 1) {
				System.out.println("�̰���ϴ� 1��");
				score = score + 1;
			} else
				System.out.println("�����ϴ� 0��");
			score = score + 0;

			if (score == 3) {
				System.out.println("3���� �޼��߽��ϴ�");
				System.exit(0);
				
			}
		}
	}
}
