package class4;

public class IfDemo_1 {
    public static void main(String[] args) {
        int money = 15000;

        if (money > 1000) {
            System.out.println("lets buy an iphone");
        }
        if (money > 2000) {
            System.out.println("lets also buy a Macbook");
        }
        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy mother's day");
        }
        String name = "Sardar";
        // equal method is only used for non-primitives
        if (name.equals("Sardar")) {
            System.out.println("I love football");
        }

    }
}
