public class reverseArray {
  public static void reverse(Object[] array) {
    for (int i = 0; i < array.length / 2; ++i) {
      Object t = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = t;
    }
  }
}
