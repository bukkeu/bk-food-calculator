# 음료 식단 계산기 (부끄뿌끄)

혼자 밥 해 먹는 사람을 위한 계산기입니다. 하루 칼로리를 관리하고, 재료를 n인분으로 환산하고, 배달비를 나눕니다.

## 팀원과 담당 기능

| 메뉴 | 기능                 | 담당          | 클래스             | 메소드 이름   | Issue | PR  |
|------|----------------------|---------------|--------------------|---------------|-------|-----|
| 1    | 오늘 마신 음료 칼로리 합계 | 김예린 (팀장) | PlusCalculator     | sumDrinkCalorie | #1    |   #7, #10 |
| 2    | 남은 칼로리          | 신아림        | MinusCalculator    | minus, judge | #2    | #11  |
| 3    | n인분 칼로리 표      | 서수영        | MultiplyCalculator | ser3, serving | #3    | #6, #9, #12, #14  |
| 4    | 배달 더치페이        | 이재성        | DivideCalculator   | DivideCalculator | #4    | #5, #8, #13  |

## 실행 화면


| 클래스 | PlusCalculator | MinusCalculator | MultiplyCalculator | DivideCalculator | End |
| ------ | -------------- | --------------- | ------------------ | ---------------- | --- |
| **실행 화면** | <img width="220" alt="PlusCalculator 실행 화면" src="https://github.com/user-attachments/assets/f9a538ec-3361-4cd2-b72e-cb9edc956485" /> | <img width="220" alt="MinusCalculator 실행 화면" src="https://github.com/user-attachments/assets/175c0cdb-769f-461c-a0b6-56e12679d260" /> | <img width="220" alt="MultiplyCalculator 실행 화면" src="https://github.com/user-attachments/assets/411287a8-3d52-4df8-afb6-a5ea6fd9a8e4" /> | <img width="220" alt="DivideCalculator 실행 화면" src="https://github.com/user-attachments/assets/d2786b13-da78-4c58-9633-02ac17b1aef0" /> | <img width="240" alt="종료 화면" src="https://github.com/user-attachments/assets/05f2ca61-a630-4622-9225-915786079e90" /> |

## 충돌 해결 기록

- PR #5 : main 브랜치에서 pull 받은 후에 작성한 내용을 밑에 추가함.
- PR #6 : 클래스를 Application에서 분리하고, main 브랜치에서 pull 받은 후에 작성한 내용을 밑에 추가함.
- PR #8
- PR #9

## 협업하며 배운 점

- 한 번에 같은 파일을 수정해서 같이 pr을 하면 충돌이 발생하므로, 한 명씩 merge 후에 파일 수정하는 법을 배웠고, 오류가 발생한 pr 상태에서 그대로 같은 브랜치에 push 하면 갱신되는 것을 배웠습니다.
- 이해가 되지 않아도 팀원들과 소통을 자주 해야 된다는 것을 다시 한번 깨달음
-  변수명, 메소드명을 겹치지 않도록 해야한다는 것을 배웠다.
