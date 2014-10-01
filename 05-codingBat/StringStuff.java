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

    //nearHundred
    public boolean nearHundred(int n) {
	if ((Math.abs(n-100) <= 10) || (Math.abs(n-200) <= 10)){
	    return true;
	}
	else {
	    return false;
	}
    }

    //mixStart
    public boolean mixStart(String str) {
	if (str.length() >= 3 && (str.substring(1,3)).equals("ix")){
	    return true;
	}
	else {
	    return false;
	}
    }
    
    //teaParty
    public int teaParty(int tea, int candy) {
	if (tea < 5 || candy < 5){
	    return 0;
	}
	else if (tea >= 2*candy || candy >= 2*tea){
	    return 2;
	}
	else{
	    return 1;
	}
    }

    //lastDigit
    public boolean lastDigit(int a, int b, int c) {
	return a % 10 == b % 10 || a %10 == c % 10 || b % 10 == c % 10;
    }

}
