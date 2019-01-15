// 전화번호부 클래스 필드
public class PhoneInfo {
    // 필드
    String name; // 이름
    int age; // 나이
    String phoneNum; // 전화번호
    String email; // 이메일
    int group; // 그룹

    // 생성자
    public PhoneInfo(String name, int age, String phoneNum, String email, int group) {
        this.name = name;
        this.age = age;
        this.phoneNum = phoneNum;
        this.email = email;
        this.group = group;
    }

    // 메소드
    public void showPhoneInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("전화번호: " + phoneNum);
        System.out.println("이메일: " + email);
        switch(group) {
            case 1:
                System.out.println("그룹: 가족");
            case 2:
                System.out.println("그룹: 친구");
            case 3:
                System.out.println("그룹: 동료");
        }
    }
}
