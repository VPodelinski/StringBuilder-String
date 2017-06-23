package by.VPodelinski.ATM;

/**
 * Created by viivpo2010 on 23.6.17.
 */
public interface ATMServise {
    boolean authorize(CashCard card, int pin); // Производит авторизацию и возвращает accountID при успехе или -1 при неудаче.

    void putMoney(double sum, CashCard card); // Кладет деньги на счет

    void takeMoney(double sum, CashCard card) ; // Снимает деньги со счета
}
