import java.io.*;
import java.util.*;
public class BFS {
	 public static int[][] ll;
	public static int[][] aa;
	public static Queue<Integer> q
            = new LinkedList<>();
					public static  Queue<Integer> r
            = new LinkedList<>();
	public static void main(String args[]) {
	int[][] area = {{1,1,0,1,},{0,1,1,0},{0,0,1,1},{0,1,1,1},{0,0,1,1},{9,1,1,1}};
	ll = new int[6][4];
	aa = new int[6][4];
	for(int i=0;i<6;i++){
		for(int j=0;j<4;j++){
			ll[i][j] = 0;
			aa[i][j] = 0;
	}
	}
	System.out.println(minimumDistance(area,0,0));
for(int i=0;i<6;i++){
		
			System.out.println(aa[i][0]+"\t"+aa[i][1]+"\t"+aa[i][2]+"\t"+aa[i][3]);
	
	}
	}
public static int minimumDistance(int[][] area,int i,int j){
	System.out.println("on "+i+" "+j+" ----> ");
    ll[i][j] = 1;
    if (area[i][j] == 9)
         return aa[i][j];
    int counter = aa[i][j] + 1;
    if(((i+1)< 6) && ((area[i+1][j] == 1) || (area[i+1][j] == 9)) && (ll[i+1][j] == 0)){
        q.add(i+1);
        r.add(j);
        ll[i+1][j] = 1;
        aa[i+1][j] = counter;
		
}
    if((i-1 >= 0) && ((area[i-1][j] == 1) || (area[i-1][j] == 9)) && (ll[i-1][j] == 0)){
        q.add(i-1);
        r.add(j);
        ll[i-1][j] = 1;
        aa[i-1][j] = counter;
		
}
   if(j+1 < 4 && (area[i][j+1] == 1 || (area[i][j+1] == 9)) && ll[i][j+1] == 0){
        q.add(i);
        r.add(j+1);
        ll[i][j+1] = 1;
        aa[i][j+1] = counter;
		
	}
    if(j-1 >= 0 && (area[i][j-1] == 1 || (area[i][j-1] == 9))&& ll[i][j-1] == 0){
        q.add(i);
        r.add(j-1);
        ll[i][j-1] = 1;
        aa[i][j-1] =counter;
	
	}
	if(q.peek() != null)
	return minimumDistance(area,q.remove(),r.remove());
	else return aa[i][j];
}
	}
