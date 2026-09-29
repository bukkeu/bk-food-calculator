package com.bukkue;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("4. 배달비 나눠 내기");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 4:
                    System.out.print("음식값 : ");
                    int price = sc.nextInt();
                    System.out.print("인원 수 : ");
                    int people = sc.nextInt();
                    System.out.print("배달비 : ");
                    int deliveryFee = sc.nextInt();

                    if (people == 0) {
                        System.out.println("인원은 0명일 수 없습니다.");
                        break;
                    }

                    int perPerson = divide(price, people, deliveryFee);
                    System.out.println("1인당 " + perPerson + "원");
                    break;
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }

    public static int divide(int price, int people, int deliveryFee) {
        return (price + deliveryFee) / people;
    }

}