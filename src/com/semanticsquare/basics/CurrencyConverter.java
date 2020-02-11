public class CurrencyConverter {

    /*
    int rupee = 63;
    int dirham = 3; // UAE
    int real = 3;  // brazilian
    int chilean_peso = 595;
    int mexican_peso = 18;
    int _yen = 107;
    int $australian = 2;  // australian dollar
    int dollar;
    int Rupee = 63;
     */

    int[] exchangeRates = new int[] {63,3,3,595,18,107,2,0,63};



    void printCurrencies(){
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: "+ exchangeRates[2]);
        System.out.println("chilean_peso: "+ exchangeRates[3]);
        System.out.println("mexican_peso:" + exchangeRates[4]);
        System.out.println("_yen: "+ exchangeRates[5]);
        System.out.println("dollar: " + exchangeRates[7]);
        System.out.println("Rupee: "+ exchangeRates[8]);
        System.out.println("$australian: " + exchangeRates[6]);
    }

    public static void main(String[] args){
        CurrencyConverter cc= new CurrencyConverter();
        cc.printCurrencies();


    }
}
