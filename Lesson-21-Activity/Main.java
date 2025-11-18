class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print(allowance());
    addTwoNumbers();
    print(GCF(12, 18));
    menu();
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  String allowance(){
    double money = 0.01; 
    int days = 1;
    while(money < 5.0){
      money *= 2;
      days++;
    }
    return "Days:" + days;
  }

  void addTwoNumbers(){
    int num1 = (int)(Math.random() * 10) + 1;
    int num2 = (int)(Math.random() * 10) + 1;
    int sum = num1 + num2;
    print("What is " + num1 + " + " + num2 + " ?");
    int guess = Input.readInt();
    while(guess != sum){
      print("Incorrect, try again!");
      guess = Input.readInt();
    }
    print("Correct!");
  }

  int GCF(int a, int b){
    while(b != 0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  void menu(){
    int choice = 0;
    while(choice != 4){
      print("Welcome Looney Tune's System");
      print("Select from the following choices:");
      print("1 - Allowance");
      print("2 - Addition game");
      print("3 - Calculate the GCF of two integers");
      print("4 - Exit Looney Tune System");
      choice = Input.readInt();

      if(choice == 1){
        print(allowance());
      }else if(choice == 2){
        addTwoNumbers();
      }else if(choice == 3){
        print("Enter first integer:");
        int a = Input.readInt();
        print("Enter second integer:");
        int b = Input.readInt();
        print("GCF is " + GCF(a,b));
      }else{
        print("Goodbye!");
      }
    }
  }

}