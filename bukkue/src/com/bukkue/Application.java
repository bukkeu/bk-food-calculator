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
            System.out.println("2. 목표 칼로리까지 남은 양 확인"); 
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 1: {
                    System.out.print("오전 음료 칼로리 : ");
                    int morning = sc.nextInt();
                    System.out.print("점심 후 음료 칼로리 : ");
                    int lunch = sc.nextInt();
                    System.out.print("오후 음료 칼로리 : ");
                    int afternoon = sc.nextInt();

                    PlusCalculator plus = new PlusCalculator();

                    int total = plus.sumDrinkCalorie(morning, lunch, afternoon);

                    System.out.println("오늘 마신 음료는 총 " + total + " kcal 입니다.");
                    break;
                }
                case 2: {  
                    System.out.print("목표 칼로리 : ");
                    int goal = sc.nextInt();
                    System.out.print("먹은 칼로리 : ");
                    int eaten = sc.nextInt();

                    MinusCalculator minus = new MinusCalculator();

                    String message = minus.judge(goal, eaten);

                    System.out.println(message);
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
