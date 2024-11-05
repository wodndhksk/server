package hello;

public class TestMain {
    public static void main(String[] args) {
        int input = 4;

        int solution = solution(input);
        System.out.println("solution = " + "dd");
    }

    public static int solution(int input) {
        int[] arr  = new int[input+1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=4; i<=input; i++) {
            arr[i+1] = arr[i-1] + arr[i] + 1;
        }

        return arr[input];
    }
}
