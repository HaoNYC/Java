class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(swapLetter("the seen", "e", "%"));
    print(encryption2("abcdefghi")); 
    print(encryption2("abcdefgh"));
    print(encryption3("abcdef"));
    print(encryption3("abcde"));

    
  }
  String swapLetter(String original, String letterToFind, String replacement){
    String bld = ""; 
    String target = letterToFind.substring(0, 1);
    for (int i = 0; i < original.length(); i++) {
      String currentChar = original.substring(i, i + 1); 
      if (currentChar.equals(target)) { 
          bld = bld + replacement;
      } else {
          bld = bld + currentChar;
      }
    }
    return bld;
  }

  String encryption2(String s) {
    int length = s.length();
    int mid = length / 2; 

    String firstHalf = s.substring(0, mid);
    String secondHalf = s.substring(mid);

    String result = "";
    int shorterLength = Math.min(firstHalf.length(), secondHalf.length());

    for (int i = 0; i < shorterLength; i++) {
        String charFromFirst = firstHalf.substring(i, i + 1);
        String charFromSecond = secondHalf.substring(i, i + 1);

        result = result + charFromFirst;
        result = result + charFromSecond;
    }
    
    if (secondHalf.length() > firstHalf.length()) {
        result = result + secondHalf.substring(secondHalf.length() - 1, secondHalf.length());
    }
    
    return result;
    }
    String encryption3(String s) {
      String result = "";
      int right = s.length() - 1;

      for (int i = 0; i <= right; i++) {
          result = result + s.substring(i, i + 1);
          if (i < right) {
              result = result + s.substring(right, right + 1);
              right--;
          }
      }

      return result;
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}