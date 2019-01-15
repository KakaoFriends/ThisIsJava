import java.util.Scanner;

// PhoneInfo 클래스 호출
public class PhoneMain {
    public static void main(String[] args) {
        int menu;

    }
}

class PhoneManager {
    static Scanner scanner = new Scanner(System.in);
    final int MAX = 100;
    PhoneInfo [] people = new PhoneInfo[MAX];
    int cnt = 0;

    public static void menu() {
        System.out.println();
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1) 추가하기");
        System.out.println("2) 수정하기");
        System.out.println("3) 삭제하기");
        System.out.println("4) 검색하기");
        System.out.println("5) 그룹보기");
        System.out.println("6) 전체보기");
        System.out.println("7) 종료하기");
    }

    public PhoneInfo create() {
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