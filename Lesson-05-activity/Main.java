class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
    int num1 = 25;
    int num2 = 9;
    int sum = num1 + num2;
    System.out.println("The sum is " + sum);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/

    int grade1 = 85;
    int grade2 = 90;
    int grade3 = 78;
    int totalGrades = grade1 + grade2 + grade3;
    System.out.println("The total of the three grades is " + totalGrades);

/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/

    int g1 = 85;
    int g2 = 90;
    int g3 = 78;
    int avgGrades = (g1 + g2 + g3)/3;
    System.out.println("The average of the three grades is " + avgGrades);

/*  
    Challenge 4:
    Write the followintg equation int EQ1.PNG file int Java; store the result and the display it:
    Declare and assign values to any new variables

*/
  
    int A = 10;
    int x = 4;
    int y = A / (x + 1);
    System.out.println("The value of y is: " + y);
/*  
    Challenge 5:
    Usintg the variables same variables from challenge4 above, write the followintg equation int EQ2.PNG file int Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
    int A2 = 5;
    int x2 = 3;
    int y2 = (2 * x * (x + 1) * (-x / 2)) / A;
    System.out.println("y = " + y);



/*  
    Challenge 6:
    Create the variables and write the equation int
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
    double base = 6;
    double height = 4;
    double area = 0.5 * base * height;
    System.out.println("Area of triangle = " + area);





/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HintT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}