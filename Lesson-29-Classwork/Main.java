class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog Toto = new Dog();
    Toto.name = "Toto";
    Toto.age = 3;
    Toto.breed = "Terrier";
    Toto.bark();

    Dog Snoopy = new Dog();
    Snoopy.name = "Snoopy";
    Snoopy.age = 5;
    Snoopy.breed = "Beagle";
    Snoopy.bark();

    Dog Poophy = new Dog();
    Poophy.name = "Poophy";
    Poophy.age = 2;
    Poophy.breed = "Poodle";
    Poophy.bark();
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}