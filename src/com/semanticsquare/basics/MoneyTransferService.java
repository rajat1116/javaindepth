public class MoneyTransferService {
    double[] exchangeRates = {63.0,3.0,3.0,595.5,18.0,107.0,2.0,0.0,63.0};
    void setExchangeRates(double[] rates){
        exchangeRates = rates;
    }

    void updateExchangeRates(int countryIndex, double newVal){
        exchangeRates[countryIndex] = newVal;
    }

    double getExchangeRates(int countryIndex){
        return exchangeRates[countryIndex];
    }

    double computeTransferAmount(int countryIndex, double amount){
        return amount * getExchangeRates(countryIndex) * computeTransferFee(0, countryIndex);
    }
    double computeTransferFee(int countryIndex, int fee){
        return getExchangeRates(countryIndex) * fee;
    }
    public static void main(String[] args){
        MoneyTransferService transferService = new MoneyTransferService();

        double transferAmount = transferService.computeTransferAmount(0, 1000);

        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);

        System.out.println("Transfer Fee: " + transferFee);

    }
}