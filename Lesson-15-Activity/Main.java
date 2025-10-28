class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(spaces(10) + "DONE");
    print(harmonic(5));
    print(fib(6));
  }

  String spaces(int N) {
    String space = "";
      for (int i = 0; i < N; i++) {
          space = space + " ";
      }
      return space;
  }
  double harmonic(int N) {
    double sum = 0.0;
    for (int i = 1; i <= N; i++) {
        sum += 1.0 / i;
    }
    return sum;
  }
  int fib(int N) {
    int t1 = 0;
    int t2 = 1;
    System.out.println("First " + N + " Fibonacci numbers:");
    for (int i = 1; i <= N; ++i) {
        System.out.print(t1 + ", ");
        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
    }
    return t1 ;
  }
  
}