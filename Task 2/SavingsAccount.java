/**
 * FILE NAME: SavingsAccount.java
 * WHAT: Creates savings account objects that inherit all methods from the Account class,
 * as well as implementing the withdraw method. It also adds an interest rate and can 
 * accrue interest over time.
 * WHO: Julia McDonald (jmcdona6)
 * WHEN: September 24, 2017
 */
public class SavingsAccount extends Account{
  //additional instance variable
  private double interest;
  
  /**
   * Creates a savings account object that inherits properties from the Account constructor
   * and sets an interest rate.
   */
  public SavingsAccount( double deposit ){
    super( deposit );
    //interest rate is set because customer cannot choose his/her own interest rate
    interest = 0.02;
  }
  
  /**
   * Adds the amount of interest accrued in one month to the balance.
   */
  public void accrueInterest(){
    balance += balance * (interest/12.0);
  }
  
  /**
   * Withdraws a given amount of money from a savings account
   * @param amount - money to be withdrawn
   */
  public void withdraw( double amount ){
    balance -= amount;
  }
  
  /**
   * Uses the toString from Account to create a String describing the savings account.
   * It includes account number, balance, and interest rate.
   * @return a String describing the checking account
   */
  public String toString(){
    return super.toString() + "\nInterest Rate: " + interest * 100 + "%";
  }
}