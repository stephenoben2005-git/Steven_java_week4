public class javaoperators {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 7;
        //Arithmetic
        //+,-,/,%
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println((double)num1 /(double)num2);
        System.out.println(num1 % num2);
        num1++;
        System.out.println(num1);

        num2--;
        System.out.println(num2);


        //Assignment
        //=, +=, -=,*=, /=, %=
        num1 += 10;
        System.out.println(num1);

        //Comparison
        //==,!=,>,<,>=,<=
        System.out.println(num1 != num2);

        //Logical
        //AND => &&, OR => ||, NOT => !
        System.out.println(num1 > 5 && num2 < 10);
        System.out.println(num1 > 20 || num2 > 5);
        System.out.println(!(num1 == num2));


    }
}
