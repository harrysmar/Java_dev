package ken;

public class Main {
    public static void main(String[] args) {

        /* basic syntax */
        // 왼쪽은 항상 변수, 오른쪽은 값
        int points;
        points = 100;
        int x = -69;
        100 = points; // 왼쪽이 값, 오른쪽이 변수이므로 오류가 남

        // 왼쪽이 받는 쪽 (변하는 쪽), 오른쪽이 주는 쪽 (값을 제공하는 쪽)이라고 생각
        x = points;    // x에 points값을 넣음
        points = x;    // points에 x값을 넣음

        // 문장의 끝에는 항상 세미콜론을 써야 함
        int y = 42    // 세미콜론을 쓰지 않으면 오류가 남
        
        // 숫자와 문자가 붙어있어서 뭔지 모름
        int y2 = 42points;
        // 변수명으로 보자니 숫자로 시작
        // 숫자로 보자니 뒤에 문자가 붙음
    }
}
