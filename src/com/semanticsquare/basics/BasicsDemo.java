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
    static void threeDimensionalArrays(){
        System.out.println("\nInside threeDimensionalArray...");
        int[][][] unitsSold = new int[][][]{
                {
                    //New York
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,850,0,0}
                },
                {
                    // San Franciso
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                },
                {
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}
                }
        };
        System.out.println("unitSold[0][3][1]: "+unitsSold[0][3][1]);
    }
    static double sum(double x, double y){
        return x + y;
    }
    static double avg(double x, double y){
        double sum = sum(x,y);
        return sum / 2;
    }

    static boolean search(int[] list, int key){
        return true;
    }
    static void go(int i){
        System.out.println(i);
    }
    static void go(short s){
        System.out.println(s);
    }
    static void go(int[] array){
        System.out.println("Array[0]: "+ array[0]);
        System.out.println("Array[1]: "+ array[1]);
        array[1] = 22;
    }

    // varargs
    static void varargsOverload(boolean b, int i, int j, int k){
        System.out.println("\nInside varargsOverload without varargs....");
    }

    static void varargsOverload(boolean b, int... list){
        System.out.println("\nInside varargsOverload with varargs....");
        System.out.println("list.length: "+list.length);
    }
    static void preAndPost(){
        System.out.println("\nInside preAndPost...");
        int x = 5;
        x++;
        x--;
        ++x;
        --x;
        int y = x;
        System.out.println("x: "+x+", y: "+y);
        int ind = 0;
        int[] array = new int[3];
        array[ind] = 10;
        array[++ind] = 20;
        array[++ind] = 30;
        System.out.println("ind: "+ind);
    }
    static void compoundArithmeticAssignment(){
        int x = 100;
        System.out.println("x += 5: "+(x += 5));
        System.out.println("x -= 5: "+(x -= 5));
        System.out.println("x *= 5: "+(x *= 5));
        System.out.println("x /= 5: "+(x /= 5));
        System.out.println("x %= 5: "+(x %= 5));
    }
    static void isOddOrEven(int num){
        System.out.println(num % 2);
    }
    static void chartypePromotion(){
        System.out.println("\nInside chartypePromotion...");
        char char1 = 50; // will be assigned corresponding UTF16 value 2
        System.out.println("char1: "+char1);
        System.out.println("(73 - char1): "+ (73 - char1)); // char1 gets promoted to int
        System.out.println("(char1 - '3'): "+ (char1 - '3')); // char1 and '3' gets promoted to int
        System.out.println("'a' - 'b': "+('a'-'b'));
        /*
        ~ Operation precendence rule
        ~ Operand promotion rule
        ~ same-type operation rule
        ~ mixed-type operation rule
         */
    }
    static void comparisionOperators(){
        int age = 20;
        if (age > 21) {
            System.out.println("Graduate student");
        }
        System.out.println("age > 21: "+ (age > 21));
        System.out.println("age >= 21: "+ (age >= 21));
        System.out.println("age < 21: "+ (age < 21));
        System.out.println("age <= 21: "+ (age <= 21));
        System.out.println("age == 21: "+ (age == 21));
        System.out.println("age != 21: "+ (age != 21));

        boolean isIngternational = true;
       // System.out.println("isInternational <= true: "+ (isIngternational <= true)); // throws error
        System.out.println("isInternational == true: "+ (isIngternational == true));
        System.out.println("isInternational != true: "+ (isIngternational != true));

        Student s1 = new Student(1000, "Rajat");
        Student s2 = new Student(1000, "Rajat");
        System.out.println("s1 == s2: "+ (s1 == s2));
        System.out.println("s1 != s2: "+ (s1 != s2));

        update(null, "John");
    }
    static boolean update(Student s, String name){
        if(s == null){
            return false;
        }
        s.name = name;
        return true;
    }

  public static void main(String[] args) {
        /*
        print();
        primitives();
        typeCasting();
        count = 25; 
        arrays();
        threeDimensionalArrays();
        double d = sum(3.0, 2.0);
        float e = (float) sum(4.0, 6.0);
        System.out.println(d);
        System.out.println(e);
        double f = avg(5.0, 7.0);
        System.out.println(f);
        int[] list ={1,2};
        search(list,2);
         */
        int[] array = {1,2};
        go(array);
        System.out.println("Array[1]: "+ array[1]);
        go(1000);
        byte b = 22;
        go(b);

        varargsOverload(true, 1,2,3);
        varargsOverload(true,1, 2, 3, 4, 5, 6, 7, 8);
        varargsOverload(true);
        preAndPost();
        compoundArithmeticAssignment();
        isOddOrEven(50);
        chartypePromotion();
        comparisionOperators();

  }       
}