package ken;

// Scanner 클래스를 사용하기 위해 java.util 패키지에서 가져오기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /* input & output */
        
        // [출력]
        // 콘솔에 문자열 출력하기
        System.out.println("Hello, I am ken!");

        // 정수형 변수 선언하고 값 42 할당
        int life = 42;
        // 변수 life의 값을 콘솔에 출력
        System.out.println(life);

        // 정수형 변수 grade에 80 할당
        int grade = 80;
        // 문자열과 변수를 합쳐서(연결해서) 출력
        System.out.println("Your grade is " + grade);

        // [입력]
        // Scanner scanner;  // 스캐너 타입의 변수만 선언 (빈 상자만 만든 상태)
        // Scanner scanner = new Scanner();  // 실제 스캐너 객체를 만들어서 넣기
        // System.in // 키보드 (표준 입력 장치)
        Scanner scanner = new Scanner(System.in);
        // 사용자가 키보드로 입력한 정수를 읽어서 number 변수에 저장
        int number = scanner.nextInt();
        // 사용자가 입력한 숫자를 포함한 메시지 출력
        // 무조건 숫자를 입력을 해야 함
        System.out.println("You just typed " + number);

        // String input = scanner.next();  // 단어 하나만 읽음 (스페이스 만나면 멈춤)
        String input = scanner.nextLine();
        System.out.println("You now just typed (string): " + input);

    }
}
