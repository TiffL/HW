public class StringStuff {

    /* nonStart: Given 2 strings, return their concatenation,
       except omit the first char of each. The strings will be
       at least length 1. */

    public String nonStart(String a, String b) {
	String ShortA = a.substring(1);
	String ShortB = b.substring(1);
	return ShortA + ShortB;
    }

    /* makeAbba: Given two strings, a and b, return the result of
       putting them together in the order abba */

    public String makeAbba(String a, String b) {
	return a + b + b + a ;
    }
    
    /* diff21: Given an int n, return the absolute difference between
       n and 21, except return double the absolute difference if n is
       over 21. */

    public int diff21(int n) {
	if (n > 21) {
	    return 2*(n - 21);
	}
	else {
	    return 21 - n;
	}
    }

}
