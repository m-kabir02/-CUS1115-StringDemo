public class StringDemo1
{
    public static void main(String[] args)
    {
        String s1=new String("OOP in Java");
        System.out.println("s1 is :"+s1);

        String s2=" is not difficult. ";
        System.out.println("s2 is : "+s2);

        String s3=s1+s2;
        System.out.println(s3);

        String greeting1 ="Hi";
        System.out.println("The length of "+greeting1+" is "+greeting1.length());

        String greeting2=new String("Hello");
        System.out.println("The length of "+greeting2+" is "+greeting2.length());

        String empty=new String();//null string. not zero.empty
        System.out.println("The length of empty String is "+empty.length());

        String greetingUpper=greeting2.toUpperCase();//hello in all caps
        System.out.println();//gives an extra line in console
        System.out.println(greeting2+" converted to upper case is "+greetingUpper);

        String greetingLower= greeting1.toLowerCase();//hi is all lower case
        System.out.println(greeting1+ " converted to lower case is "+greetingLower);

        String invertedName="Lincoln, Abraham";
        int comma=invertedName.indexOf(',');
        System.out.println("\nThe index of the , in "+invertedName+" is "+comma);

        String lastName=invertedName.substring(0,comma);//substring looks for values from 0-comma.
        System.out.println("Dear Mr. "+lastName);

        System.out.println(s1.charAt(8));
        //this will print and display only the eight character of the string s1. which is v. *** IMPORTANT


    }
}