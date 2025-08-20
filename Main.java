class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!
System.out.println(4 + "bananas");
System.out.println("Hello");





    //ANSWER: 



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 
    //double:
    //boolean:

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES


int Math = 1;
int people = 5;
int computers = 30;
double liters = 3.5;
double grades = 99.4;
double gallons = 5.4;
boolean SkyIsgreen = false;
boolean jaydenishere = true;
boolean josephisplayinggames = true;


    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?
    System.out.println(6+8/2);
    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
    {
for(int num = 1;num <= 100; num = num + 2)
System.out.println(num);

    }
System.out.println("hi");
  {
  //All multiples of 3 from 1 to 100
for(int num = 3;num <= 100; num = num + 3)
System.out.println(num);

  }

  System.out.println("hi");

  {
    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
for(int num = 1000;num >= 0; num = num - 10)
System.out.print(num + "-");

  }

  }
}
