  public class Fibo {
  public static void main(String[] args) {
    int i = 0;
    int a[] = new int[10];
    a[0] = 1;
    a[1] = 1;
    for (i = 2; i < 10; i++) {
      a[i] = a[i - 1] + a[i - 2];
    };
  }
}
