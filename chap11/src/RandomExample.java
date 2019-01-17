import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 11.13.2 로또 번호 얻기
public class RandomExample {
    public static void main(String[] args) {
        // 선택번호
        Scanner scanner = new Scanner(System.in);
        System.out.print("번호를 입력하세요: ");
        int[] selectNumber = new int[6];
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = scanner.nextInt();
        }

        // 당첨번호
        int[] winningNumber = new int[6];
        Random random = new Random(5);
        System.out.print("당첨 번호: ");
        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 당첨여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        int match = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(selectNumber[i] == winningNumber[j]) {
                    match++;
                }
            }
        }
        System.out.print("당첨 여부: ");
        switch(match) {
            case 6:
                System.out.println("1등에 당첨되셨습니다.");
                break;
            case 5:
                System.out.println("2등에 당첨되셨습니다.");
                break;
            case 4:
                System.out.println("3등에 당첨되셨습니다.");
                break;
            case 3:
                System.out.println("4등에 당첨되셨습니다.");
                break;
            case 2:
                System.out.println("5등에 당첨되셨습니다.");
                break;
            case 1:
                System.out.println("6등에 당첨되셨습니다.");
                break;
            case 0:
                System.out.println("일치하는 숫자가 없습니다.");
        }
    }
}
