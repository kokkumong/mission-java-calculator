package calculator.view;

public class OutputView {
    public static void printResult(int result) {
        System.out.println("계산 결과: " + result);
    }

    public static void printError(String message) {
        System.err.println("오류: " + message);
    }
}
