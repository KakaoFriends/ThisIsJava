import java.util.Scanner;

// 욕설 탐지기
public class StringIndexOfBadWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            str = scanner.nextLine();
            if(str.indexOf("씨발") != -1) {
                System.out.println("욕설이 감지되었습니다.");
            }
        } while(!str.equals("이응"));
    }
}
