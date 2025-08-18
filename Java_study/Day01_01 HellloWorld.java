/* hello world */
// [패키지 선언]
// ken이라는 패키지에 속한다는 선언
package ken;

//[클래스 선언]
// Main이라는 클래스 정의 (다른 곳에서 접근 가능)
public class main {

    //[main 메서드 선언]
    // 프로그램의 시작점 - JVM이 여기서부터 실행을 시작함
    // public은 외부에서 접근 가능
    // static은 객체 생성 없이 바로 실행 가능  
    // void는 반환값 없음
    // String[] args는 프로그램 실행시 전달받는 명령어 인수들
    public static void main(String[] args) {

        //[출력문 실행]
        // 콘솔에 "Hello world!" 출력 
        // println = print line은 출력 후 줄바꿈
        System.out.println("Hello world!");
    }
}
