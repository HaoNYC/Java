class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    allowance();
    GCF(5, 10);
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  int allowance(){
    double target = 5.00;
    double penny = 0.01;
    int days = 1;
    while(penny < target){
      penny *= 2;
      days++;
    }
    return days;
  }

  int GCF(int a, int b){
    while(b != 0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

}