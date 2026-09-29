package com.bukkue;

import java.util.Scanner;

public class Application03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("3. n인분 칼로리 표");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 3: {
                    System.out.print("1인분 칼로리 : ");
                    int calorie = sc.nextInt();
                    System.out.print("몇 인분까지 : ");
                    int maxServing = sc.nextInt();

                    MultiplyCalculator multiplyCalc = new MultiplyCalculator();
                    multiplyCalc.printCalorieTable(calorie, maxServing);
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
