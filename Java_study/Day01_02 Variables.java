package ken;

/* comment */
// 한 줄 주석은 이렇게 답니다
/*
* 여러 줄 주석은
* 이렇게 답니다
*/

public class Main {
    public static void main(String[] args) {
     
        /* variables */
        // [정수형 변수]
        // 정수형 변수 points 선언 (메모리 공간 확보)
        int points;
        // points 변수에 100이라는 값 할당
        points = 100;
        // 정수형 변수 선언과 동시에 -69로 초기화 (선언+할당 한번에)
        int x = -69;
        
        // [실수형 변수]
        // float 타입으로 파이값 저장 (float는 끝에 f 필요, 소수점 7자리까지 표현)
        float pi = 3.14159265f;
        // double 타입으로 자연상수 저장 (double이 더 정밀함, 소수점 15자리까지 표현)
        double e = 2.718281828;
        
        // [논리형 변수]
        // 참/거짓 값을 가지는 boolean 변수
        boolean likedVideo = true;   
        boolean subscribed = false;
        
        // [문자형 변수]
        // 단일 문자 저장 (char은 작은따옴표 사용)
        char grade = 'A';
        // 문자열 저장 (String은 큰따옴표 사용)
        String name = "Ken";
    }
}
