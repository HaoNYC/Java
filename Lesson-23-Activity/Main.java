class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] prices = {10.5, 20.0, 5.75};
    print("Total with tax: " + total(prices));
    int[] nums = {3, 7, 11, 15, 20};
    print("Is 11 in array? " + isin(nums, 11));
    int[] myLotto = {3, 7, 11, 15, 20, 25};
    int[] drawnLotto = {7, 10, 11, 15, 30, 40};
    print("Matched: " + checkLotto(myLotto, drawnLotto));
    int[] arr = {12, 45, 7, 89, 23};
    print("Biggest number: " + biggest(arr));
  }

  double total(double[] prices){
    double sum = 0;
    for(int i=0; i<prices.length; i++){
      sum += prices[i];
    }
    double taxRate = 0.08525;
    return sum + sum*taxRate;
  }

  boolean isin(int[] arr, int num){
    for(int i=0; i<arr.length; i++){
      if(arr[i] == num) 
        return true;
    }
    return false;
  }

  int checkLotto(int[] picks, int[] drawn){
    int count = 0;
    for(int i=0; i<picks.length; i++){
      if(isin(drawn, picks[i])) count++;
    }
    return count;
  }

  int biggest(int[] arr){
    int max = arr[0];
    for(int i=1; i<arr.length; i++){
      if(arr[i] > max) 
        max = arr[i];
    }
    return max;
  }

  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}