import java.util.Scanner;

// 선택정렬, 버블정렬
public class Sort {
    static int [] data = {5, 3, 8, 1, 2, 7}; // 1, 2, 3, 5, 7, 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        while(true) {
            menu();
            menu = scanner.nextInt();
            switch(menu) {
                case 1:
                    selectionSort();
                    System.out.println("선택 정렬이 완료되었습니다.");
                    break;
                case 2:
                    bubbleSort();
                    System.out.println("버블 정렬이 완료되었습니다.");
                    break;
                case 3:
                    showArray();
                    break;
                case 4:
                    return;
            }
        }
    }

    static void menu() {
        System.out.println("메뉴");
        System.out.println("1) 선택정렬 하기");
        System.out.println("2) 버블정렬 하기");
        System.out.println("3) 결과 보기");
        System.out.println("4) 종료하기");
        System.out.print("> ");
    }

    static void selectionSort() {
        int temp;
        int min; // 최솟값의 인덱스를 기억하는 변수

        for (int i = 0; i < data.length - 1; i++) { // 반복 횟수는 데이터 개수 - 1
            min = i;
            for (int j = i + 1; j < data.length; j++) {
                if(data[j] < data[min]) {
                    min = j;
                }
            }
            temp = data[min]; // 첫 번째와 최솟값을 자리 바꿈
            data[min] = data[i];
            data[i] = temp;
        }
    }

    static void bubbleSort() {
        int temp;

        for (int i = 0; i < data.length - 1; i++) { // 반복 횟수는 데이터 개수 - 1
            for (int j = 0; j < data.length - 1; j++) {
                if(data[j] > data[j+1]) {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    static void showArray() {
        System.out.print("결과: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
