package com.bukkue;

public class MinusCalculator {

    // 빼기 메소드 : 목표에서 먹은 양을 뺀 값 (초과하면 음수)
    public int minus(int goal, int eaten) {
        return goal - eaten;
    }

    // 판정 메소드 : 빼기 결과에 따라 문장을 돌려줌
    public String judge(int goal, int eaten) {
        int result = minus(goal, eaten);

        if (result < 0) {
            return (-result) + " kcal 초과했습니다.";
        } else if (result == 0) {
            return "목표를 정확히 채웠습니다.";
        } else {
            return result + " kcal 더 먹을 수 있습니다.";
        }
    }
}