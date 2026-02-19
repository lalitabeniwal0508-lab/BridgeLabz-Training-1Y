public class SwitchOddExample {
    public static void main(String[] args) {
        int number = 4;  

        switch (number) {
            case 1:
                System.out.println("Number is One");
                break;
            case 3:
                System.out.println("Number is Three");
                break;
            case 5:
                System.out.println("Number is Five");
                break;
            case 7:
                System.out.println("Number is Seven");
                break;
            default:
                System.out.println("Even number or not in range 0-7");
        }
    }
}