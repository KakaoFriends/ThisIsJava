import java.util.Scanner;

// 자유창작
public class RockScissorsPaperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;
        do {
            int num = (int) (Math.random() * 3) + 1;

            System.out.print("가위, 바위, 보 중 하나를 입력해 주세요: ");
            String input = scanner.next();

            switch (num) {
                case 1:
                    if (input.equals("가위")) System.out.println("비겼습니다.");
                    else if (input.equals("바위")) System.out.println("이겼습니다.");
                    else if (input.equals("보")) System.out.println("졌습니다.");
                    else System.out.println("잘못 내셨습니다.");
                    System.out.println("컴퓨터: 가위");
                    break;
                case 2:
                    if (input.equals("가위")) System.out.println("졌습니다.");
                    else if (input.equals("바위")) System.out.println("비겼습니다.");
                    else if (input.equals("보")) System.out.println("이겼습니다.");
                    else System.out.println("잘못 내셨습니다.");
                    System.out.println("컴퓨터: 바위");
                    break;
                case 3:
                    if (input.equals("가위")) System.out.println("이겼습니다.");
                    else if (input.equals("바위")) System.out.println("졌습니다.");
                    else if (input.equals("보")) System.out.println("비겼습니다.");
                    else System.out.println("잘못 내셨습니다.");
                    System.out.println("컴퓨터: 보");
                    break;
            }
                System.out.print("게임을 다시 시작하시겠습니까? (Y/n) : ");
                again = scanner.next();

        } while(again.equals("y") || again.equals("Y"));
    }
}
