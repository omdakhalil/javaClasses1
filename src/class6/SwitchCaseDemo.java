package class6;


public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country="USA";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){

            case "usa":
                System.out.println("Burgers");
                break;
            case "Itlay":
                System.out.println("Pasta");
                break;
            case "afghanishtan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong conutry");
        }
    }
}
