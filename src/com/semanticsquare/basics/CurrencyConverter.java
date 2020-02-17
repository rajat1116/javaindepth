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

    double[] exchangeRates;
    void setExchangeRates(double[] rates){
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newVal){
        exchangeRates[arrayIndex] = newVal;
    }

    double getExchangeRates(int arrayIndex){
       return exchangeRates[arrayIndex];
    }

    double computeTransferAmount(int arrayIndex, double amount){
        return amount * getExchangeRates(arrayIndex);
    }



    void printCurrencies(){
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: "+ exchangeRates[2]);
        System.out.println("chilean_peso: "+ exchangeRates[3]);
        System.out.println("mexican_peso:" + exchangeRates[4]);
        System.out.println("_yen: "+ exchangeRates[5]);
        System.out.println("$australian: " + exchangeRates[6]);
        System.out.println("dollar: " + exchangeRates[7]);
    }

    public static void main(String[] args){
        CurrencyConverter cc= new CurrencyConverter();
        double[] rates = {63.0,3.0,3.0,595.5,18.0,107.0,2.0,0.0,63.0};
        cc.setExchangeRates(rates);
        cc.printCurrencies();

        rates = new double[]{64.0,3.0,3.0,595.5,18.0,107.0,2.0,0.0,63.0};
        cc.setExchangeRates(rates);
        cc.printCurrencies();
        cc.updateExchangeRates(0, 67.0);

    }
}
