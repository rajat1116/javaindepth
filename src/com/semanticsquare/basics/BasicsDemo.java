class BasicsDemo {

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
      System.out.println("\n\nInside Primitives ");
      int intHex = 0x0041; System.out.println("Hex: "+ intHex);
      int intBin = 0b010101; System.out.println("Bin: "+ intBin);
      int intUnderscore = 1_23_456; System.out.println("UnderScore: "+ intUnderscore);
  }
  public static void main(String[] args) {
      print();
      primitives();


  }       
}