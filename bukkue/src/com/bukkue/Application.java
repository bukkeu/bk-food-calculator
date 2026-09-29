package com.bukkue;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu;

        do {
            System.out.println("===== 카페 메뉴 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("1. 오늘 마신 음료 칼로리 합계");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 1: {
                    // 클래스명 변수명 = new 클래스명();
                    PlusCalculator plus = new PlusCalculator();
                    // 변수명.메소드명(); <- 입력, 계산, 출력은 전부 PlusCalculator 가 한다
                    plus.drinkCalorieMenu(sc);
                    break;
                }
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}

/* ============= Application 클래스 외부 ============= */
// (3) 각자 자기 클래스 추가 (public 없이 class 로 시작)

// ===== 메뉴 1 : 팀장 =====
class PlusCalculator {

    // 메뉴 1 화면 : 입력받고, 계산 메소드를 부르고, 결과를 출력한다
    // void : 반환값이 없을 때 사용한다. (출력만 하고 끝)
    public void drinkCalorieMenu(Scanner sc) {

        System.out.print("오전 음료 칼로리 : ");
        int morning = sc.nextInt();

        System.out.print("점심 후 음료 칼로리 : ");
        int lunch = sc.nextInt();

        System.out.print("오후 음료 칼로리 : ");
        int afternoon = sc.nextInt();

        // 같은 클래스 안의 메소드는 이름만으로 호출할 수 있다 (Application02 의 methodA -> methodB)
        int total = sumDrinkCalorie(morning, lunch, afternoon);

        System.out.println("오늘 마신 음료는 총 " + total + " kcal 입니다.");
    }

    // 세 칼로리를 더한 결과를 돌려준다 (Application01 의 sumTwoNumber 에 매개변수 하나 추가)
    public int sumDrinkCalorie(int morning, int lunch, int afternoon) {
        return morning + lunch + afternoon;
    }
}