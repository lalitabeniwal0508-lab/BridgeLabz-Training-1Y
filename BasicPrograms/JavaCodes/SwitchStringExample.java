public class SwitchStringExample {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Apples are red or green.");
                break;
            case "Banana":
                System.out.println("Bananas are yellow.");
                break;
            case "Orange":
                System.out.println("Oranges are orange.");
                break;
            case "Mango":
                System.out.println("Mangoes are sweet and tropical.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
    }
}