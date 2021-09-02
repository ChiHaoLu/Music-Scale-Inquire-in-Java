public class ScaleData {
	
	static String[] data = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B","無"};
    static int w=0;
	static int a,b,c,d,e,f,g;
    static int[] level= {2,2,1,2,2,2,1,2,2,1,2,2,2,1};
    static int flag1,flag2,flag3;
    static String[] Chords = {"Maj7", "min7", "7", "mM7", "m7b5", "dim7", " aug7", "augM7"," "};
    static int[] Chords_1= {0,1,1,0,2,1,5,0,1,1,0,2,1,5};
	static int chord1,chord2,chord3,chord4,chord5,chord6,chord7;
    
	public static void count(String x, String y) {
	for(int i=0;i<=12;i++) {
		if (y == data[i]) {
	    flag1 = i+1;
	    }
		else  {
			}
		}

	
    if (x == "Major Scale") {
        flag2 = 1;}
    else if (x == "minor Scale") {
        flag2 = 6;}
    else if (x == "Phrygian") {
        flag2 = 3;}
    else if (x == "Dorian") {
        flag2 = 2;}
    else if (x == "Lydian") {
        flag2 = 4;}
    else if (x == "Mixolydian") {
        flag2 = 5;}
    else if (x == "Locrian") {
        flag2 = 7;}
    else if (x == "Blues Scale") {
        flag2 = 8;}
    else if (x == "Pantatonic Scale") {
        flag2 = 9;}
	
	for(int k=1;k<=7;k++) {
		if (flag2 == k) {
	    a=flag1-1;
		b=a+level[k-1];
		c=b+level[k];
		d=c+level[k+1];
		e=d+level[k+2];
		f=e+level[k+3];
		g=f+level[k+4];
	    }
		else  {
			}}
    
	switch (flag2) {
	case 8:
		a=flag1-1;
		b=a+2+1;
		c=b+2+1;
		d=c+1;
		e=d+1;
		f=e+2+1;
		g=24;
		break;
	case 9:
		a=flag1-1;
		b=a+2;
		c=b+2;
		d=c+1+2;
		e=d+2;
		f=24;
		g=24;
		break;
	}
	}

	
	public static String show(String x, String y) {
    count(x, y);
    return data[a] + ", " + data[b] + ", " + data[c] + ", " + data[d] + ", " + data[e] + ", " + data[f] + ", " + data[g];
	}
	
	public static String show1(String x, String y) {
	    count(x, y);
	    for(int j=1;j<=7;j++) {
	    if (flag2==j) {
	    	chord1 = Chords_1[j-1];
	        chord2= Chords_1[j];
	        chord3= Chords_1[j+1];
	        chord4= Chords_1[j+2];
	        chord5= Chords_1[j+3];
	        chord6= Chords_1[j+4];
	        chord7= Chords_1[j+5];
	    }
	    else {}
	    }
	    if (flag2==8) {
	    	chord1 = 8;
	        chord2=8;
	        chord3= 8;
	        chord4=8;
	        chord5=8;
	        chord6=8;
	        chord7=8;
	    }
	    else if (flag2==9) {
	    	chord1 = 8;
	        chord2=8;
	        chord3= 8;
	        chord4=8;
	        chord5=8;
	        chord6=8;
	        chord7=8;

	    }
	    return data[a] + Chords[chord1] + ", " 
	    + data[b] + Chords[chord2] + ", " 
	    + data[c] + Chords[chord3] +", "
	    + data[d] + Chords[chord4] +", " 
	    + data[e] + Chords[chord5] + ", " 
	    + data[f] + Chords[chord6] + ", "
	    + data[g] +Chords[chord7] ;
	    
	    }
		
}


