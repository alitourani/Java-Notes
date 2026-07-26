public class Main {
  public static void main(String[] args) {
    // First log
    System.out.println("Let's check some JAVA codes!");
    
    // Variables
    int number = 5;
    double dnum = 4.55978;
    float fnum = (float) dnum;
    
    char ch = 'A';
    String str1 = new String("Sample String!");
    String str2 = "This String is Much More Common!";
    String str3 = str1 + " " + str2 + " " + dnum;
    System.out.println(str3);
    
    boolean b1 = false;
    boolean toBe = b1 || !b1;
    if (toBe || (number == 4)) {
        System.out.println(toBe);
    }
    
    // Compact conditions
    int check = number == 4 ? 0 : 1;
    if (check == 0)
        System.out.println("Number is 4!");
    else
        System.out.println("Number is not 4!");
    
    // Equal conditions
    String strA = new String("StrA");
    String strB = new String("StrA");
    String strC = strA;
    // strA and strB are not the same object!
    System.out.println("strA == strB? " + (strA == strB));
    // strA and strC are the same object!
    System.out.println("strA == strC? " + (strA == strC));
    // Check the equality of the strings
    System.out.println("strA.equals(strB)? " + strA.equals(strB));
    
    // Arrays
    int[] arr = new int[10];
    System.out.println(arr.length);
    arr[0] = 1;
    arr[2] = arr[0] + 1;
    
    int[] arr2 = {1, 2, 3, 4, 5};
    for (int i=0; i < arr2.length; i++) {
        System.out.print(arr2[i] + " ");
    }
    System.out.println();
    
    // Loops
    int loopnum = 5;
    while (loopnum != 0)
        loopnum -= 1;
    
    for (int elem : arr2) {
        System.out.print(elem);
    }
  }
}
