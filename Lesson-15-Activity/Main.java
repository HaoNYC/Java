class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(spaces(10) + "DONE");
    print(harmonic(5));
    double pi_6 = Math.PI / 6.0;
    print(sin(4, pi_6));
    fib(8);
    mTable(); 
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
  int fact(int N){
    if (N < 0) return 0;
    int result = 1;
    for (int i = 2; i <= N; i++) {
      result = result * i;
    }
    return result;
  }
  double sin(int terms, double x){
    double sum = 0.0;
    for (int n = 0; n < terms; n++) {
      int exponent = 2 * n + 1;
      int denominatorFactorial = fact(exponent);
      
      double sign;
      if (n % 2 == 0) {
        sign = 1.0;
      } else {
        sign = -1.0;
      }

      double term = sign * Math.pow(x, exponent) / denominatorFactorial;
      sum = sum + term;
    }
    return sum;
  }
  int fib(int N) {
    int t1 = 0;
    int t2 = 1;
    print("First " + N + " Fibonacci numbers:");
    for (int i = 1; i <= N; ++i) {
        System.out.print(t1 + ", ");
        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
    }
    return t1 ;
  }

  void nRow(int N){
    for (int i = 1; i <= 10; i++) {
      int product = N * i;
      
      int padding;
      if (product < 10) {
        padding = 3;
      } else if (product < 100) {
        padding = 2;
      } else { 
        padding = 1;
      }
      printt(spaces(padding));
      printt(product);
    }
    print(""); 
  }

  void mTable(){
    for (int i = 1; i <= 10; i++) {
      nRow(i);
    }
  }
}