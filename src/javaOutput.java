public class javaOutput {


    static void main(String[] args) {

        // System class to output data
        //print, println, printf
        /*System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");*/


        String name = "John Doe";
        int age = 30;
        double salary = 1000.0;
        System.out.println("name: " +name);
        System.out.println("Age: "+age+"years old ");
        System.out.println("salary: "+salary);

        System.out.println("My name is "+name+", I am "+age+" years old and my salary is "+salary);
        //%d => Byte, Short, long, int
        //%s => String
        //%f => float or double

        System.out.printf("My name is %s "+name+", I am %d years old and my salary is %.2f", name,age,salary);
    }

}
