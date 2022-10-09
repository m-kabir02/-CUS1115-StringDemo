
public class StringDemo {
    public static void main(String[] args)
    {

        //declaration statements
        int x;
        double salary;

        //assignment statements
        x=7;
        salary=12345.67;

        //combined declaration and assignment with Strings
        String title="Dr.";
        String first="Cay";
        String last="Horstmann";

        //output statements using the concatenation +
        //Create an output statement using the variable x above and + to say My favorite number is 7.
        System.out.println("My favorite number is "+x);// this will print 7 where the x is in the code.
        //create a line of code to display the double salary above
        System.out.println("Salary is $"+salary);//will print salary value 12345.67 after the $ symbol.
        System.out.println("Hello "+title+" "+last+". We are using your book.");
        System.out.println("Your first name is "+first);
    }

}
/*
* My favorite number is 7
Salary is $12345.67
Hello Dr. Horstmann. We are using your book.
Your first name is Cay
*/