/**
 * FILE NAME: CheckingAccount.java
 * WHAT: Defines a checking account that inherits all methods from its parent class Account. 
 * It also adds to Account's toString and implements Account's withdraw methods.
 * WHO: Julia McDonald (jmcdona6)
 * WHEN: September 24, 2017
 */
public class CheckingAccount extends Account{
  //additional instance variables
  private double minBalance;
  private double overdraft;
  
  /**
   * Constructs a checking account object using the account constructor and adding a
   * minimum balance and overdraft fee amount.
   * @param deposit - initial deposit amount
   */
  public CheckingAccount( double deposit ){
    super( deposit );
    //these are pre-set because a customer cannot choose his/her minimum balance or
    //overdraft fee
    minBalance = 100;
    overdraft = 50;
  }
  
  /**
   * Withdraws a given amount of money from a checking account. If the account is 
   * withdrawn below the minimum balance, an overdraft fee is charged to the account.
   * @param amount - money to be withdrawn
   */
  public void withdraw( double amount ){
    balance -= amount;
    if( balance < minBalance ){
      balance -= overdraft;
    }
  }
  
  /**
   * Uses the toString from Account to create a String describing the checking account.
   * It includes account number, balance, and minimum balance.
   * @return a String describing the checking account
   */
  public String toString(){
   return super.toString() + "\nMinimum Balance: " + minBalance; 
  }
}