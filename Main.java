public class Main {
  public static void main(String[] args) {
    ArrayUtils arrayUtils = new ArrayUtils();
    int[] intputArray = new int[] {3};
    //int[] result1 = arrayUtils.removeEvenIntegers(intputArray);
    // int[] result2 = arrayUtils.reverseAnArray(intputArray);
    // int[] result3 = arrayUtils.reverseAnArrayV1(intputArray);
    int result4 = arrayUtils.secondMaxValue(intputArray);
    System.out.println(result4);
    //arrayUtils.printElement(result4);
    //arrayUtils.printArray(result3);

  }
}