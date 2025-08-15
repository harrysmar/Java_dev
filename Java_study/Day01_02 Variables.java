package ken;

/* comment */
// 한 줄 주석은 이렇게 씁니다
/*
* 여러 줄 주석은
* 이렇게 씁니다
*/

public class Main {
   public static void main(String[] args) {
     
       /* variables */
       // 정수형 변수
       int points;      // 변수 선언
       points = 100;    // 값 할당  
       int x = -69;     // 선언과 동시에 초기화
       // 선언과 동시에 초기화는 변수를 만들면서 바로 값을 넣는 것을 말함

       // 실수형 변수
       float pi = 3.14159265f;    // float는 끝에 f 필요
       double e = 2.718281828;    // double이 더 정밀함
       // float는 소수점 7자리까지 표현
       // double은 소수점 15자리까지 표현

       // 논리형 변수
       boolean likedVideo = true;     // 참/거짓 값
       boolean subscribed = false;

       // 문자형 변수
       char grade = 'A';         // 단일 문자 (작은따옴표)
       String name = "Ken";      // 문자열 (큰따옴표)
       // char은 '(작은따옴표) String은 "(큰따옴표)를 써야 함

   }
}
