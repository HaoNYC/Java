class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Alex", "Kerry", "Harry"};
    double[] celsiusTemps = {0, 20, 37, 100};
    double[] fahrenheitTemps = convert(celsiusTemps);
    print(fahrenheitTemps);
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
  double[] convert(double[] celsiusTemps){
    double[] t = new double[celsiusTemps.length];
    for(int x=0; x < celsiusTemps.length; x++){ 
      t[x] = celsiusToFarhenheit(celsiusTemps[x]);
    }
    return t;
  }
}