import java.util.Scanner;

// 자유창작
public class RockScissorsPaperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again = "y";
        int medal = 0;
        do {
            int num = (int)(Math.random() * 3) + 1;
            int givenMedal;
            System.out.println("현재 메달 수는 " + medal + "개 입니다.");

            System.out.print("가위, 바위, 보 중 하나를 입력해 주세요: ");
            String input = scanner.next();

            switch (num) {
                case 1:
                    System.out.print("컴퓨터: 가위 / ");
                    if (input.equals("가위")) {
                        System.out.println("비겼습니다.");
                        System.out.println("자동으로 다시 시작합니다.");
                        System.out.println("");
                        continue;
                    }
                    else if (input.equals("바위")) {
                        System.out.println("이겼습니다.");
                        givenMedal = (int)(Math.random() * 4) + 1;
                        switch (givenMedal) {
                            case 1:
                                medal += 100;
                                System.out.println("메달이 100개 지급되었습니다.");
                                break;
                            case 2:
                                medal += 50;
                                System.out.println("메달이 50개 지급되었습니다.");
                                break;
                            case 3:
                                medal += 20;
                                System.out.println("메달이 20개 지급되었습니다.");
                                break;
                            case 4:
                                System.out.println("꽝입니다.");
                        }
                    }
                    else if (input.equals("보")) {
                        System.out.println("졌습니다.");
                    }
                    else System.out.println("잘못 내셨습니다.");
                    break;
                case 2:
                    System.out.print("컴퓨터: 바위 / ");
                    if (input.equals("가위")) {
                        System.out.println("졌습니다.");
                    }
                    else if (input.equals("바위")) {
                        System.out.println("비겼습니다.");
                        System.out.println("자동으로 다시 시작합니다.");
                        System.out.println("");
                        continue;
                    }
                    else if (input.equals("보")) {
                        System.out.println("이겼습니다.");
                        givenMedal = (int)(Math.random() * 4) + 1;
                        switch (givenMedal) {
                            case 1:
                                medal += 100;
                                System.out.println("메달이 100개 지급되었습니다.");
                                break;
                            case 2:
                                medal += 50;
                                System.out.println("메달이 50개 지급되었습니다.");
                                break;
                            case 3:
                                medal += 20;
                                System.out.println("메달이 20개 지급되었습니다.");
                                break;
                            case 4:
                                System.out.println("꽝입니다.");
                        }
                    }
                    else System.out.println("잘못 내셨습니다.");
                    break;
                case 3:
                    System.out.print("컴퓨터: 보 / ");
                    if (input.equals("가위")) {
                        System.out.println("이겼습니다.");
                        givenMedal = (int)(Math.random() * 4) + 1;
                        switch (givenMedal) {
                            case 1:
                                medal += 100;
                                System.out.println("메달이 100개 지급되었습니다.");
                                break;
                            case 2:
                                medal += 50;
                                System.out.println("메달이 50개 지급되었습니다.");
                                break;
                            case 3:
                                medal += 20;
                                System.out.println("메달이 20개 지급되었습니다.");
                                break;
                            case 4:
                                System.out.println("꽝입니다.");
                        }
                    }
                    else if (input.equals("바위")) {
                        System.out.println("졌습니다.");
                    }
                    else if (input.equals("보")) {
                        System.out.println("비겼습니다.");
                        System.out.println("자동으로 다시 시작합니다.");
                        System.out.println("");
                        continue;
                    }
                    else System.out.println("잘못 내셨습니다.");
                    break;
            }
            System.out.print("게임을 다시 시작하시겠습니까? (Y/n) : ");
            again = scanner.next();
            System.out.println("");

        } while(again.equals("y") || again.equals("Y"));

        scanner.close();
    }
}
