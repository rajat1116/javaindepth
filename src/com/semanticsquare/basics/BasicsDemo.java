class BasicsDemo {
    static void typeCasting(){
        System.out.println("\n\nInside Type Casting...");
        // Explicit casting
        long y = 42;
        //int x = y;
        int x = (int) y;

        // Information loss due to out-of-range assignment
        byte narrowByte = (byte)123456;
        System.out.println("narrowByte: "+narrowByte);

        // Truncated
        int iTruncated = (int)0.99;
        System.out.println("iTruncated: "+ iTruncated);

        // Implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: "+iInt);

        // byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: "+cChar);
    }
    static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }
  static void primitives(){
      // Primitive Type
      /*
      Number - Integer ( byte, short, int, long) - Singed Two's complement, Floating ( float, double), Character (char);
      Boolean - True, False
       */

      // Int
      System.out.println("\n\nInside Primitives ");
      int intHex = 0x0041; System.out.println("Hex: "+ intHex);
      int intBin = 0b010101; System.out.println("Bin: "+ intBin);
      int intUnderscore = 1_23_456; System.out.println("UnderScore: "+ intUnderscore);

      // Char
      char charA = 'A'; System.out.println("charA: "+ charA);
      char charInt = 65; System.out.println("charInt: "+charInt);
      char charUnicode1 = '\u0041'; System.out.println("charUniCode1: "+charUnicode1);
      char charHex = 0x41; System.out.println("charUniCode2: "+ charHex);
      char charBinary = 0b01000001; System.out.println("charBinary: "+charBinary);

      // Boolean
      boolean isInsured = true;
      double coverageByInsurance = 0.8;
      double billAmount = 1000.0;
      double amountPaidByInsurance = 0.0;
      double amountPaidByPatient = billAmount;
      if(isInsured){
          amountPaidByInsurance = billAmount * coverageByInsurance;
          amountPaidByPatient = billAmount - amountPaidByInsurance;
      }
      System.out.println("amountPaidByInsurance: "+amountPaidByInsurance);
      System.out.println("amountPaidByPatient: "+amountPaidByPatient);

      // Type Casting
      /*
      Only numeric to numeric casting is possible
      cannot cast to boolean or vice versa
       */

  }
  static int count = 25;
  //count=25;

    static void arrays(){
        System.out.println("\n\nInside arrays...");
        int[] myArray = new int[] {9,11,2,5,4,4,6};
        System.out.print("myArray.length: "+ myArray.length);
    }

  public static void main(String[] args) {
      print();
      primitives();
      typeCasting();
      count = 25;
      arrays();
  }       
}