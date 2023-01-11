package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        System.out.println(false||true|false|false);




        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if (boughtCho||boughtFlowers){
            System.out.println("I Am happy");
        }else {
            System.out.println("I Am Sad");
        }

        boolean wifi=false;
        boolean fiveG=false;

        if (wifi||fiveG){
            System.out.println("You are good for browsing the internet");
        }else {
            System.out.println("Either connect to wife or to 5G");
        }



    }
}
