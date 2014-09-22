/* MixStart:
Return true if the given string begins with "mix", except the
'm' can be anything, so "pix", "9ix" .. all count. 
 */ 

public boolean mixStart(String str) {
    if (str.length() >= 3 && (str.substring(1,3)).equals("ix")){
	return true;
    }
    else {
	return false;
    }
}

/* MakeOutWord:
Given an "out" string length 4, such as "<<>>", and a word, return
a new string where the word is in the middle of the out string, 
*/

public String makeOutWord(String out, String word) {
    int middle = out.length() / 2;
    String part1 = out.substring(0, middle);
    String part2 = out.substring(middle);
    return part1 + word + part2;
}

/* FirstHalf:
Given a string of even length, return the first half.
*/

public String firstHalf(String str) {
    int middle = str.length() / 2;
    return str.substring(0, middle);
}
