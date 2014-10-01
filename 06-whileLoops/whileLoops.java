public class whileLoops{
    
    // frontTimes: 2 minutes
    public String frontTimes(String str, int n){
	String front3 = "";
	if (str.length() >= 3){
	    front3 = str.substring(0,3);
	}
	else{
	    front3 = str;
	}

	String retstr = "";
	int i = 0;
	while (i < n){
	    retstr = retstr + front3;
	    i = i + 1;
	}
	return retstr;
    }

    // StringBits: 4 minutes
    public String stringBits(String str) {
	if (str.length() == 0){
	    return "";
	}
	else{
	    String retstr = "";
	    int i = 0;
	    while (i < str.length()){
		retstr = retstr + str.substring(i,i+1);
		i = i + 2;
	    }
	    return retstr;
	}
    }

    // stringYak: 20 minutes
    public String stringYak(String str) {

	if (str.length()<3 || str.indexOf("y")== -1 || str.indexOf("k")== -1){
	    return str;
	}

	else{
	    
	    int i = 0;
	    String retstr = "";
	    while (i < str.length()){
		if (i+2 < str.length() &&
		    str.substring(i,i+1).equals("y") &&
		    str.substring(i+2,i+3).equals("k")){
		    i = i + 2;
		}
		else {
		    retstr = retstr + str.substring(i,i+1);
		}
		i = i + 1;
	    }
	    return retstr;
	}
    }

    // stringMatch: 3 minutes
    public int stringMatch(String a, String b) {

        if (a.length() == 0 || b.length() == 0){
	    return 0;
	}

	else {
	    int retint = 0;
	    int i = 0;
	    while (i < a.length()-1 && i < b.length()-1){
		if (a.substring(i,i+2).equals(b.substring(i,i+2))){
		    retint = retint + 1;
		}
		i = i + 1;
	    } 
	    return retint;
	}
    }

}
