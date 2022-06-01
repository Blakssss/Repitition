package Compare;

public class øvelse {
  int[] numbers = {1,2,3,4};
  double result;
  double number = 0;

  void  run(){
    for (int i = 0; i < numbers.length; i++){
      number = number + numbers[i];
      result = number / numbers.length;
    }
    System.out.println(result);
  }
  public static void main(String[] args) {
    øvelse øvelse = new øvelse();
    øvelse.run();
  }
}
