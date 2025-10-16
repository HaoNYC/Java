class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String getUsername(String email) {
    int at = email.indexOf("@");
    if (at == -1) return email; 
    return email.substring(0, at);
  }

  String splitReverse(String input) {
    int mid = input.length() / 2;
    return input.substring(mid) + input.substring(0, mid);
  }

  String createUsername(String firstName, String lastName, String osis) {
    String firstInitial = firstName.substring(0, 1);
    String lastFour = osis.substring(osis.length() - 4);
    return firstInitial + lastName + lastFour;
  }

  void init(){
    print(getUsername("joexyz@gmail.com"));
    print(splitReverse("Happy Days"));
    print(createUsername("John", "Doe", "123456789"));

  }

  
  
}