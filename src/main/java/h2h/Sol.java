package h2h;

class logic {
    static int jumpingOnClouds(int[] c) {
        int jump = 0;
        int i =0;
        while(i < c.length -1) {
           if (i+2 < c.length && c[i+2] != 1 && c[i+2] == 0) {
               i = i+2;
               jump = jump + 1;
           } else if (i+1 < c.length && c[i+1] != 1 && c[i+1] == 0) {
               i = i+1;
               jump = jump +1;
           }            
        }
        return jump;
    }
}

public class Sol {
	public static void main(String args[]) {
		int ar[] = new int[] {0,0,1,0,0,1,0};
		int dis = 0;
		dis = logic.jumpingOnClouds(ar);
		System.out.println(dis);
	}
}
