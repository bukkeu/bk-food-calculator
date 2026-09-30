package com.bukkue;

public class MultiplyCalculator {

    public int ser3 (int cal, int ser) {
        return (cal*ser);
    }
    // 곱하기 메소드-완료
    // 표출력 메소드 : 1부터 최대 인수 까지 반복 1씩 증가해야함
    //

    public void serving (int calo, int maxSer) {
        for (int i = 1; i <= maxSer; i++){
            // calo : 칼로리 , 20
            // maxSer : 최대인분 , 5
            // 출력 결과 : ex) 1인분 : 20 * 1 kacl
            System.out.println(i+"인분 : " + ser3(calo,i) + "kcal");
        }
    }

}
