public class Shapes {
    
    //box - from class
    public String box(int r, int c) {
	String s = "";
	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}
	return s;
    }

    //Tri1 - Done in class: 3 minutes
    public String tri1(int h){
	String retstr = "";
	int i = 1;

	while (i <= h){
	    int a = 0;
	    while (a < i){
		retstr = retstr + "*";
		a = a + 1;
	    }
	    retstr = retstr + "\n";
	    i = i + 1;
	}
	return retstr;
    }

    //tri2: 6 minutes
    public String tri2(int h){
        String retstr = "";
	int r = 1;

	while (r <= h){
	    int x = h-r;
	    int c = 0;

	    while (c < x){
		retstr = retstr + " ";
		c = c + 1;
	    }
	    while (c < h){
		retstr = retstr + "*";
		c = c + 1;
	    }
	    retstr = retstr + "\n";
	    r = r + 1;
	}
	return retstr;
    }
}
