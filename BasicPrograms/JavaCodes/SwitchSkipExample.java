public class SwitchSkipExample {
    public static void main(String[] args) {
        int number = 4;  

        switch (number) {
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            case 3:
                System.out.println("Number is Three");
                break;
            case 5:
                System.out.println("Number is Five");
                break;
            default:
                System.out.println("Number not handled in switch");
        }
    }
}