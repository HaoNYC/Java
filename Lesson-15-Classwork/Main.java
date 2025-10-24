class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  double approxPI(int term) {
    double sum = 0.0;
    for (int i = 0; i < term; i++) {
      double denominator = 2 * i + 1;
      if (i % 2 == 0) {
        sum += 1.0 / denominator;
      } else {
        sum -= 1.0 / denominator;
      }
    }
    return 4 * sum;
  }
  void init(){
    int term = 5;
    double piApprox = approxPI(term);
    print("Approximation of PI with " + term + " terms: " + piApprox);

  }

  
  
  
}