package ken;

public class Main {
    public static void main(String[] args) {

        /* basic syntax */

        // [변수 대입 규칙]
        // 변수 선언을 위한 정수형 타입 지정
        int points;
        // 선언된 변수에 100이라는 값을 대입
        points = 100;
        // 변수 선언과 동시에 음수값으로 초기화
        int x = -69;
        // 잘못된 대입 예시 - 문자 값은 왼쪽에 올 수 없음
        100 = points; // 왼쪽이 값, 오른쪽이 변수이므로 오류가 남
        
        // [등호의 방향성]
        // points 변수의 값을 x 변수에 복사하여 저장
        x = points;    // x에 points값을 넣음
        // x 변수의 값을 points 변수에 복사하여 저장  
        points = x;    // points에 x값을 넣음
        
        // [세미콜론 규칙]
        // 세미콜론이 누락된 잘못된 문법 예시
        int y = 42    // 문장 끝 세미콜론 누락으로 컴파일 에러 발생
        
        // [변수명 규칙]   
        // 잘못된 변수명 사용 예시 - 컴파일러가 변수명을 읽을 수 없음
        int y2 = 42points; // 변수명으로 보자니 숫자로 시작, 숫자로 보자니 뒤에 문자가 붙음
        
    }
}
