class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] prices = {10,15,22,54,32,34,65,87,45,100,23,99,95,87,56,83};
    print(total(prices));
  }
  String total(double[]  prices){
    double sum = 0;
    for(int i=0;i<prices.length;i++){
      sum += prices[i] *1.08525;
    }
    return "sum is " + sum;
  }

  boolean 

  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}