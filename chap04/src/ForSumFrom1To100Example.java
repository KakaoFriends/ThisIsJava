import java.util.Scanner;

// 4.3.1 1부터 100까지 합을 출력
public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        System.out.println("짝수를 계산하고 싶으면 1을, 홀수를 계산하고 싶으면 2를 눌러주세요.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력: ");
        int inputInt = scanner.nextInt();

        switch(inputInt) {
            case 1:
                for (i = 1; i <= 100; i++) {
                    if(i % 2 == 0) {
                        sum += i;
                    }
                }
                break;
            case 2:
                for (i = 1; i <= 100; i++) {
                    if(i % 2 == 1) {
                        sum += i;
                    }
                }
                break;
        }

        System.out.println("1 ~ " + (i-1) + " 합 : " + sum);
    }
}
