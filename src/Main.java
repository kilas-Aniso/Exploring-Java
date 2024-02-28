

public class Main {
    int m = 5;


    public static  void  main(String [] args) {

        /* The code below will print the words Hello World
to the screen, and it is amazing */

        System.out.println("Hello Mom your girll is really trying");
        System.out.println("Hello World");


        System.out.println("Adding another sentence to print!");

        int myNum = 15;
        System.out.println(myNum);

        int Num = 15;
        Num = 20;  // myNum is now 20
        System.out.println(Num);

        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z);

//        The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);


//        The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
        String greeting = "Hello World";
        System.out.println(greeting);

//        Type casting is when you assign a value of one primitive data type to another type.
//
//In Java, there are two types of casting:
//
//Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double
//
//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte

//Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

//        Narrowing Casting

        double Double = 9.78d;
        int myyInt = (int) Double; // Manual casting: double to int

        System.out.println(Double);   // Outputs 9.78
        System.out.println(myyInt);      // Outputs 9


//        If else statement

        int mytime = 20;
        if (mytime < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


//Java OOP
//    reminder on OOP
//    OOP is faster and easier to execute
//OOP provides a clear structure for the programs
//OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
//OOP makes it possible to create full reusable applications with less code and shorter development time


        Main myObj = new Main();
        System.out.println(myObj.m);

    }

}


class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.m);
    }
}
