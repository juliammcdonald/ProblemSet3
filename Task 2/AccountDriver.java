/**
 * FILE NAME: AccountDriver.java
 * WHAT: Driver class for Account parent class and CheckingAccount & SavingsAccount child classes.
 * WHO: Julia McDonald (jmcdona6)
 * WHEN: September 24, 2017
 */
public class AccountDriver {
  /**
   * This is the driver class of Account, CheckingAccount, and SavingsAccount.
   * It contains testing for these classes.
   */
  public static void main( String[] args ){
    //checking account testing
    System.out.println( "Checking Account Testing:" );
    
    CheckingAccount myCheck = new CheckingAccount( 500 );
    System.out.println( myCheck );
    
    myCheck.deposit( 150 );
    System.out.println( myCheck );
    
    myCheck.withdraw( 100 );
    System.out.println( myCheck );
    
    myCheck.withdraw( 600 );
    System.out.println( myCheck );
    
    //savings account testing
    System.out.println( "Savings Account Testing:" );
    
    SavingsAccount mySave = new SavingsAccount( 1000 );
    System.out.println( mySave );
    
    mySave.deposit( 250 );
    System.out.println( mySave );
    
    mySave.withdraw( 50 );
    System.out.println( mySave );
    
    mySave.accrueInterest();
    System.out.println( mySave );
    
    mySave.accrueInterest();
    System.out.println( mySave );
    
    mySave.accrueInterest();
    System.out.println( mySave );
  }
}