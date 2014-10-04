public class StringsAndShapes{

    public String frame(int r, int c){
        String retstr = "";
        for (int i = 0; i < r; i++){
            retstr += "*";
            for (int x = 0; x < c-2; x++){
                if (i == 0 || i == r-1){
                    retstr = retstr + "*";
                }
                else{
                    retstr = retstr + " ";
                }
	    }
	    retstr += "*\n";
	}
	return retstr;
    }

    public String stringSplosion(String str) {
	String retstr = "";
	for (int i = 0; i <= str.length(); i++){
	    retstr = retstr + str.substring(0,i);
	}
	return retstr;
    }

    public String stringX(String str) {
	String retstr = "";
	for (int i = 0; i < str.length(); i++){
	    if (i==0 || i == str.length()-1
		|| !(str.substring(i,i+1)).equals("x")){
		retstr = retstr + str.substring(i,i+1);
	    }
	}
	return retstr;
    }
}

