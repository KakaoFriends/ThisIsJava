import java.util.Scanner;

// PhoneInfo 클래스 호출
public class PhoneMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneInfo phone;

    }

    public static PhoneInfo create() {
        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.println("전화번호를 입력하세요: ");
        String phoneNum = scanner.nextLine();
        System.out.println("email을 입력하세요: ");
        String email = scanner.nextLine();
        System.out.println("그룹을 입력하세요[1: 가족, 2: 친구, 3: 동료] : ");
        int group = scanner.nextInt();
        return new PhoneInfo(name, age, phoneNum, email, group);
    }
}
