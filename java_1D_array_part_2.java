import java.util.*;

public class Solution {
   
    public static boolean canWin(int leap, int[] game,int n,int x,boolean f,boolean[] vis) {
           if(x>n-1)
           {
               return true;
           }
           if(vis[x]==false && game[x]==0)
           {
               vis[x]=true;
               if((x+1)>=(n) || ((x+1)<n && game[x+1]==0 && vis[x+1]==false))
               {
                   f=f||canWin(leap, game,n,x+1,f,vis);
                   //x=x-1;
               }
               if((x+leap)>=(n) || ((x+leap)<n && game[x+leap]==0 && vis[x+leap]==false))
               {
                   f=f||canWin(leap, game,n,x+leap,f,vis);
                   //x=x-leap;
               }
               if((x-1)>0 && game[x-1]==0 && vis[x-1]==false)
               {
                   f=f||canWin(leap, game,n,x-1,f,vis);
                   
               }
           }
        return f;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            boolean[] vis=new boolean[n]; 
            System.out.println( (canWin(leap, game,n,0,false,vis)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
