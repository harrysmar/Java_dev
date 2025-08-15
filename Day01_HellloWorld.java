// ken이라는 패키지에 속한다는 선언
package ken;

// Main이라는 클래스 정의 (public = 다른 곳에서 접근 가능)
// 프로그램의 시작점 - JVM이 여기서부터 실행을 시작함
// Main메서드가 없으면 실행이 안됨
public class Main {
    // public: 외부에서 접근 가능
    // static: 객체 생성 없이 바로 실행 가능  
    // void: 반환값 없음
    // String[] args: 프로그램 실행시 전달받는 명령어 인수들
    public static void main(String[] args) {
        // 콘솔에 "Hello world!" 출력 (println = print line, 줄바꿈 포함)
        System.out.println("Hello world!");
    }
}
