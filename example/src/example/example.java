package example;

import java.util.Random;
import java.util.Scanner;


public class example {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int score = 0;

		while (score <= 3) {

			System.out.println("내고싶은걸 입력하시오(0~2): ");
			int user = scanner.nextInt(); // 사용자값 받아옴
			int computer = random.nextInt(3);

			switch (user) {
			case 0:
				System.out.println("가위를 내셨습니다");
				break;
			case 1:
				System.out.println("바위를 내셨습니다");
				break;
			case 2:
				System.out.println("보를 내셨습니다");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				System.exit(0);
			}
			

			if (computer == 0) { // 컴퓨터 랜덤
				System.out.print("컴퓨터는 가위");
			} else if (computer == 1) {
				System.out.print("컴퓨터는 바위");
			} else if (computer == 2) {
				System.out.print("컴퓨터는 보");
			}
			System.out.println("를 내셨습니다");

			if (user == computer) {
				System.out.println("비겼습니다 0점");
				score = score + 0;
			} else if (user == 1 && computer == 0) {
				System.out.println("이겼습니다 1점");
				score = score + 1;
			} else if (user == 0 && computer == 2) {
				System.out.println("이겼습니다 1점");
				score = score + 1;
			} else if (user == 2 && computer == 1) {
				System.out.println("이겼습니다 1점");
				score = score + 1;
			} else
				System.out.println("졌습니다 0점");
			score = score + 0;

			if (score == 3) {
				System.out.println("3점을 달성했습니다");
				System.exit(0);
				
			}
		}
	}
}
