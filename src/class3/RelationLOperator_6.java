package class3;

public class RelationLOperator_6 {
    public static void main(String[] args) {
        /*
        Arithmetic operator
        int +int =int
        int/int=int
        int-int=int
         */

        /*
        Relational operator
        >
        =>
        ==
        !=
        <
        =<
         */
        int number=10;
        int number2=10;
        System.out.println(number+number2);
        boolean result=20>10;
        System.out.println(result);
        /*
        == equal to
        != not equal to
        > greater than
        < less than
        >= grater or equal
        <= less or equal
         */



        System.out.println(20>10); // is 20 greater than 10 => true
        System.out.println(5>10); // is 5 greater than 10 => false
        System.out.println(5!=10); // is 5 not equal to 10 => true  ! is mean NOT
        System.out.println(5==10); // is 5 equal to 10 => false
        System.out.println(5==5); // is 5 equal  to 5 => true
        System.out.println(10>=20); // is 10 greater or equal to 20 => false
        System.out.println(10<=20); // is 10 less than or equal to 20 => true
        System.out.println(10<=10); // is 10 less than or equal to 10 => true

        boolean test = 10.1!=10.1;

    }
}
