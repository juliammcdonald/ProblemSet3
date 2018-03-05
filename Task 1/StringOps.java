/**
 * FILE NAME: StringOps.java
 * WHAT: Determines whether 2 words are anagrams using recursion
 * WHO: Julia McDonald (jmcdona6)
 * WHEN: September 24, 2017
 */
public class StringOps{
  /**
   * Removes a character ch from a string S
   * @param S - the original string
   * @param ch - the character to be removed
   */
  public static String removeChar( String S, char ch ){
    for( int i = 0; i < S.length(); i++ ){
      if( S.charAt( i ) == ch )
        return S.substring( 0, i ) + S.substring( i + 1, S.length() );
    }
    return S;
  }
  
  /**
   * Determines whether two input Strings word1 and word2 are anagrams, 
   * and prints a message indicating the outcome.
   * @param word1 - first input String
   * @param word2 - second input String
   */
  public static void testAnagrams( String word1, String word2 ){
    if( word1.equals( word2 ) || word1.length() != word2.length() )
      System.out.println( word1 + " and " + word2 + " are not anagrams.");
    else{
      String are = isAnagram( word1, word2 ) ? " are" : " are not";
      System.out.println( word1 + " and " + word2 + are + " anagrams." );
    }
  }
  
  /**
   * This private helper method recursively determines whether two words are
   * anagrams.
   * @param word1 - first input String
   * @param word2 - second input String
   * @return boolean whether the Strings are anagrams
   */
  private static boolean isAnagram( String word1, String word2 ){
    if( word1.length() == 0 )
      return true;
    for( int i = 0; i < word1.length(); i++ ){
      for( int j = 0; j < word2.length(); j++ ){
        //finds same letter, removes it, and runs the method again
        if( word1.charAt( i ) == word2.charAt( j ) ){
          word1 = removeChar( word1, word1.charAt( i ));
          word2 = removeChar( word2, word2.charAt( j ));
          return isAnagram( word1, word2 );
        }
      }
    }
    return false;
  }
  
  /**
   * Main method to test the methods defined in this file.
   */
  public static void main( String[] args ){
    testAnagrams( "hello", "olehl" ); //anagrams
    testAnagrams( "hello", "hello" ); //not anagrams
    testAnagrams( "hello", "ehllo" ); //anagrams
    testAnagrams( "helloo", "hello" ); //not anagrams
    testAnagrams( "listen", "silent" ); //anagrams
    testAnagrams( "woman", "owman" ); //anagrams
  }
}