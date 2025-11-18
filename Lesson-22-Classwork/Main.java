class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Alex", "Kerry", "Harry"};
    double[] tempC = {-4.5, 0, 20, 37, 100};
    double[] tempF = convert(tempC);
    for(int i=0;i<tempF.length;i++){
      print(tempF[i]);
    }
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
  double[] convert(double[] c){
    double[] t = new double[c.length];
    for(int i=0; i < c.length; i++){ 
      t[i] = celsiusToFarhenheit(c[i]);
    }
    return t;
  }
}