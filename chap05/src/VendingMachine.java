import java.util.Scanner;

// 자유창작
public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] menu = { {700, 10},
                          {800, 5},
                          {900, 3},
                          {500, 15},
                          {1000, 7} };

        int machineMoney = 0;
        int inputMoney = 0;
        int inputMenu = 0;
        String again = "y";

        do {
            for (int i = 0; i < 5; ++i) System.out.println();
            System.out.println("메뉴");
            System.out.println("1) 콜라: " + menu[0][0] + "원 [" + menu[0][1] + "개 남음]");
            System.out.println("2) 사이다: " + menu[1][0] + "원 [" + menu[1][1] + "개 남음]");
            System.out.println("3) 커피: " + menu[2][0] + "원 [" + menu[2][1] + "개 남음]");
            System.out.println("4) 환타: " + menu[3][0] + "원 [" + menu[3][1] + "개 남음]");
            System.out.println("5) 토레타: " + menu[4][0] + "원 [" + menu[4][1] + "개 남음]");
            System.out.println("--------------------");

            System.out.println("현재 잔액: " + machineMoney + "원\n");
            if(machineMoney < 500) {
                System.out.println("잔액이 부족합니다. 돈을 넣어주세요.");
                System.out.print("> ");
                inputMoney = scanner.nextInt();
                machineMoney += inputMoney;
                continue;
            }
            else {
                System.out.println("구매할 음료(1~5)를 선택해 주세요.");
                System.out.print("> ");
                inputMenu = scanner.nextInt();
                switch(inputMenu) {
                    case 1:
                        if(machineMoney < menu[0][0]) {
                            System.out.println("돈이 부족합니다. 돈을 더 넣어주세요.");
                            System.out.print("> ");
                            inputMoney = scanner.nextInt();
                            machineMoney += inputMoney;
                            continue;
                        }
                        else if(menu[0][1] < 1) {
                            System.out.println("콜라의 재고가 부족합니다. 다른 상품을 구입해주세요.");
                            continue;
                        }
                        else {
                            System.out.println("콜라를 구매합니다.");
                            machineMoney -= menu[0][0];
                            menu[0][1]--;
                        }
                        break;
                    case 2:
                        if(machineMoney < menu[1][0]) {
                            System.out.println("돈이 부족합니다. 돈을 더 넣어주세요.");
                            System.out.print("> ");
                            inputMoney = scanner.nextInt();
                            machineMoney += inputMoney;
                            continue;
                        }
                        else if(menu[1][1] < 1) {
                            System.out.println("사이다의 재고가 부족합니다. 다른 상품을 구입해주세요.");
                            continue;
                        }
                        else {
                            System.out.println("사이다를 구매합니다.");
                            machineMoney -= menu[1][0];
                            menu[1][1]--;
                        }
                        break;
                    case 3:
                        if(machineMoney < menu[2][0]) {
                            System.out.println("돈이 부족합니다. 돈을 더 넣어주세요.");
                            System.out.print("> ");
                            inputMoney = scanner.nextInt();
                            machineMoney += inputMoney;
                            continue;
                        }
                        else if(menu[2][1] < 1) {
                            System.out.println("커피의 재고가 부족합니다. 다른 상품을 구입해주세요.");
                            continue;
                        }
                        else {
                            System.out.println("커피를 구매합니다.");
                            machineMoney -= menu[2][0];
                            menu[2][1]--;
                        }
                        break;
                    case 4:
                        if(machineMoney < menu[3][0]) {
                            System.out.println("돈이 부족합니다. 돈을 더 넣어주세요.");
                            System.out.print("> ");
                            inputMoney = scanner.nextInt();
                            machineMoney += inputMoney;
                            continue;
                        }
                        else if(menu[3][1] < 1) {
                            System.out.println("환타의 재고가 부족합니다. 다른 상품을 구입해주세요.");
                            continue;
                        }
                        else {
                            System.out.println("환타를 구매합니다.");
                            machineMoney -= menu[3][0];
                            menu[3][1]--;
                        }
                        break;
                    case 5:
                        if(machineMoney < menu[4][0]) {
                            System.out.println("돈이 부족합니다. 돈을 더 넣어주세요.");
                            System.out.print("> ");
                            inputMoney = scanner.nextInt();
                            machineMoney += inputMoney;
                            continue;
                        }
                        else if(menu[4][1] < 1) {
                            System.out.println("토레타의 재고가 부족합니다. 다른 상품을 구입해주세요.");
                            continue;
                        }
                        else {
                            System.out.println("토레타를 구매합니다.");
                            machineMoney -= menu[4][0];
                            menu[4][1]--;
                        }
                }
            }
            System.out.println("더 구매하시겠습니까? (Y/n)");
            System.out.print("> ");
            again = scanner.next();
        } while (again.equals("Y") || again.equals("y"));
        scanner.close();
    }
}
