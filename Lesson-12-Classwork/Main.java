class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  boolean collegeCredit(String courseCode) {
    String sixthChar = courseCode.substring(5, 6);
    return sixthChar.equals("E") || courseCode.equals("M");
  }
  
  String getCounsoler(String officialClass) {
    String key1 = officialClass.substring(1, 2);
    String key2 = officialClass.substring(2, 3);
    if (key1.equals("B") || key2.equals("B")) {
      return "Berrouet";
    } else if (key1.equals("C") || key2.equals("C")) {
      return "Chu";
    } else if (key1.equals("D") || key2.equals("D")) {
      return "Dinn";
    } else if (key1.equals("E") || key2.equals("E")) {
      return "Eyzengart";
    } else if (key1.equals("F") || key2.equals("F")) {
      return "Flores";
    } else if (key1.equals("G") || key2.equals("G")) {
      return "Gibson";
    } else if (key1.equals("L") || key2.equals("L")) {
      return "Shim Lee";
    } else if (key1.equals("M") || key2.equals("M")) {
      return "Meltzer";
    } else if (key1.equals("P") || key2.equals("P")) {
      return "Paccione";
    } else if (key1.equals("S") || key2.equals("S")) {
      return "Fiore";
    } else if (key1.equals("T") || key2.equals("T")) {
      return "Tsai";
    } else{
      return "Zayes";
    }
  }
  String imageType(String fileName) {
    int dotIndex = fileName.indexOf(".");
    String extension = fileName.substring(dotIndex + 1);
    if (extension.equalsIgnoreCase("JPEG") || extension.equalsIgnoreCase("JPG")){
      return "Joint Photographic Experts Group";
    } else if (extension.equalsIgnoreCase("PNG")){
      return "Portable Network Graphics";
    } else if (extension.equalsIgnoreCase("GIF")){
      return "Graphics Interchange Format";
    } else {
      return "Portalble Document Format";
    } 
  }
  void init(){
    print(collegeCredit("MATH1E")); 
    print(getCounsoler("1B2"));
    print(imageType("photo.jpg"));
    
  }

 
}