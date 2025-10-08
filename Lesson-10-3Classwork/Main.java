class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(String message) {
        System.out.println(message);
	}

  double groupSavings (int num){
    if (num>= 1 && num <= 8){
      return 11 * num;
    }else if (num>=9 && num<= 16){
      return 10.50 * num;
    }else{
      return 8.50 * num;
    }
  }

  double groceryDiscount (double amount, int num){
    if (amount>=100 && amount<=200 || num>=3){
      return amount-10;
    }else if (amount>=200 && num >= 4){
      return amount-25;
    }else{
      return amount;
    }

  }

  void init(){
    print("total cost: " +groupSavings(10));
    print("total bill: " +groceryDiscount(100, 4));
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */

  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */


}