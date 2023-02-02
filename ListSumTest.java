public class ListSumTest {
  public static void main(String[] args) {
    // define array's contents
    int[] list = {10, 11, 12, 13, 14};

    // prints the output of 'SumList' method
    System.out.println(SumList(list));
  }

  // Creates method named 'SumList' that takes an array of int
  private static int SumList(int[] list) {
    // sum tracks total value of list
    int sum = 0;
    // loops through list
    for(int i = 0; i < list.length; i++){
      // adds each value of list to sum
      sum += list[i];
    }

    // returns sum
    return sum;
  }
}