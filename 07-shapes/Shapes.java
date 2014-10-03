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
    
    //tri3: 20 minutes
    public String tri3(int h){
	int nOfStars = 1;
	int maxStars = h*2-1;
	String retstr = "";

	for (int r = 0; r < h; r++){
	    for (int s = 0; s < (maxStars - nOfStars)/2; s++){
		retstr = retstr + " ";
	    }
	    for (int stars = 0; stars < nOfStars; stars++){
		retstr = retstr + "*";
	    }
	    retstr = retstr + "\n";
	    nOfStars = nOfStars + 2;
	}
	return retstr;
    }

    //diamond: 25 minutes
    public String diamond(int h){
    	int nOfStars = 0;
    	String retstr = "";

	int middlerow = 0;
	if (h%2 == 1){
	    middlerow = h/2+1;
	    nOfStars = h;
	}
	else{
	    middlerow = h/2;
	    nOfStars = h-1;
	} 

    	for (int r = middlerow; r > 0; r--){
	    String row = "";
    	    for (int s = 0; s < (h - nOfStars)/2; s++){
    		row = row + " ";
    	    }
    	    for (int stars = 0; stars < nOfStars; stars++){
    		row = row + "*";
    	    }
	    if (r == h/2+1){
		retstr = row + "\n";
	    }
	    else{
		retstr = row + "\n" + retstr + row + "\n";
	    }
    	    nOfStars = nOfStars - 2;
    	}
    	return retstr;
    }

    //tri4: 3 minutes -> flipped tri2
    public String tri4(int h){
        String retstr = "";

	for (int r=h; r>0; r=r-1){
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
	}
	return retstr;
    }
    
}
