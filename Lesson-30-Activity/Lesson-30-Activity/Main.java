class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car("Toyota", "Red", "Corolla", 2020, 15000);
    Car car2 = new Car("Honda", "Blue", "Civic", 2018, 9000);

    print("Car 1: " + car1.brand + " " + car1.model + " $" + car1.value);
    print("Car 2: " + car2.brand + " " + car2.model + " $" + car2.value);
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}