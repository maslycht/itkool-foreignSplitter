package ee.itkool;

public interface ForeignSplitter<T> {
    /**
     * Sets the username.
     *
     * @param username the username.
     */
    void setUsername(String username);

    /**
     * Greets the user.
     */
    void greetUser();

    /**
     * Asks the user for the amount of money in the foreign currency.
     */
    void retrieveForeignAmount();

    /**
     * Asks the user for the amount of money in the local currency.
     */
    void retrieveLocalAmount();

    /**
     * Calculates the exchange rate.
     */
    void calculateExchangeRate();

    /**
     * Gets the exchange rate.
     *
     * @return the exchange rate.
     */
    T getExchangeRate();

    default void processPartialAmount() {
        T amountToConvert = getAmountToConvert();
        T convertedAmount = convert(amountToConvert);
        showConvertedAmount(convertedAmount);
    }

    /**
     * Asks the user for the amount of money in the foreign currency to be converted in local currency.
     *
     * @return the amount of money in the local currency.
     */
    T getAmountToConvert();

    /**
     * Converts the amount of money in the foreign currency to the local currency.
     *
     * @param amountToConvert the amount of money in the foreign currency to be converted in local currency.
     * @return the amount of money in the local currency.
     */
    T convert(T amountToConvert);

    /**
     * Shows the amount of money in the local currency.
     *
     * @param amount the amount of money in the local currency.
     */
    void showConvertedAmount(T amount);

    /**
     * Checks if the amount of money in the foreign currency that has been accounted for is less than the total
     * amount of money in the foreign currency.
     *
     * @return true if the amount of money in the foreign currency that has been accounted for is less than the total
     * amount of money in the foreign currency.
     */
    boolean totalAccountedForLessThanTotal();
}
