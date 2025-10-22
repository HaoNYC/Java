class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String creditCardType(String number){
    if (number.substring(0,1).equals("4")){
      return "Visa";
    } else if (number.substring(0,2).equals("34") || number.substring(0,2).equals("37")){
      return "America Express";
    } else if (number.substring(0,2).equals("36")){
      return "Diner Club";
    } else if (number.substring(0,2).equals("51") || number.substring(0,2).equals("55")){
      return "Mastercard";
    } else {
      return "Discovery";
    }
  }
  String pigLatin(String word){
    return word.substring(word.length()/2) + word.substring(0,word.length()/2) + "ay";
  }
  String nycLocate(String zipcode){
    if (zipcode.substring(0,3).equals("100") || zipcode.substring(0,3).equals("101") || zipcode.substring(0,3).equals("102")){
      return "Manhattan";
    } else if (zipcode.substring(0,3).equals("103")){
      return "Staten Island";
    } else if (zipcode.substring(0,3).equals("104")){
      return "Bronx";
    } else if (zipcode.substring(0,3).equals("112")){
      return "Brooklyn";
    } else{
      return "Queens";
    }
  }
  String getMonth(String date){
    if (date.substring(0,2).equals("07")){
      return "July";
    }else if(date.substring(0,2).equals("08")) {
      return "August";
    }else if(date.substring(0,2).equals("09")){
      return "September";
    }else{
      return "Unfind";
    }
  }  

  boolean validatePswd(String password){
    if (password.length() < 5 || password.length() > 8) {
      return false;
    }else{
      return true;
    }
  }
    
  
  void init(){
    print(creditCardType("114544"));
    print(pigLatin("pig"));
    print(nycLocate("11355"));
    print(getMonth("07/11/2025"));
    print(validatePswd("12bhs23453"));
  }

  
  
}