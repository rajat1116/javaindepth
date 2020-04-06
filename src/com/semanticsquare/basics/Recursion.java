public class Recursion {
    static int factorialNR(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        int factorial = n;
        while (n >= 2) {
            factorial = factorial * (n - 1);
            n--;
        }
        return factorial;
    }

    static int factorial(int n){
        if ( n == 0){
            return 1;
        }
        return n*factorial(n -1);
    }
    public static int binarySearch(int a[], int l, int h, int key){
        if(l == h){
            if( key == a[l] ){
                return l;
            } else {
                return -1;
            }
        }
        int mid = (l + h)/2;
        if ( key == a[mid]){
            return mid;
        }else if (key > a[mid]){
            return binarySearch(a, mid+1, h, key);
        }else {
            return binarySearch(a, l, mid-1, key);
        }

    }
    public static void main(String[] args){
        System.out.println(factorialNR(4));
        System.out.println(factorial(4));
        int[] a = {11, 19, 24, 34, 55, 65, 71, 83, 91};
       int index = binarySearch(a, 0, 8, 65);
       System.out.println("Index: "+ index);
    }

}
