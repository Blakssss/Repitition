package Compare;

import java.util.ArrayList;
import java.util.Collections;

public class Comparing implements Comparable<Comparing> {
  private int topSpeed;

  Comparing(int topSpeed){
    this.topSpeed=topSpeed;
  }

  @Override
  public int compareTo(Comparing car) {
    if(this.topSpeed > car.topSpeed)
      return 1;
    else if(this.topSpeed < car.topSpeed){
      return -1;
    } else
    return 0;
  }

  public static void main(String[] args) {
    ArrayList<Comparing> example = new ArrayList<>();
    example.add(new Comparing(10));
    example.add(new Comparing(3));
    Collections.sort(example);
    for(Comparing comparing: example){
      System.out.println(comparing.topSpeed);
    }
  }
}
