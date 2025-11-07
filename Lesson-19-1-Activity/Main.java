class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print(rollDice());
    print(lotto());
    print(additionTutor());
  }

  String rollDice(){
    int randomNum1 = (int)(Math.random() * 6) +1;
    int randomNum2 = (int)(Math.random() * 6) +1;
    return randomNum1 + " " + randomNum2;
  }
  String lotto(){
    String sum = "";
    for(int i=0; i<=5; i++){
      int randomNum = (int)(Math.random() * 48) +1;
      sum += randomNum + " ";
    }
    return sum;
  }
  String additionTutor(){
    print("Enter the sum of the two numbers");
    int sumIn = Input.readInt();
    int num1 = (int)(Math.random());
    int num2 = (int)(Math.random());
    int sum = num1 +num2;
    if (sum == sumIn){
      return "Correct!";
    }else{
      return "Incorrect!";
    }
  }

}