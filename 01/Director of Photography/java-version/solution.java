// Write any import statements here
import java.io.*;
import java.util.*;

class Solution {
  
  public long getArtisticPhotographCount(int N, String C, int X, int Y) {
    long art = 0;
    char[] ch = C.toCharArray();
    
    for (int i = 0; i < ch.length; i++) {
 
        if (ch[i] == 'A') {
            int Bl = 0, Pl = 0, Br = 0, Pr = 0;

            // Check Left
            for (int x1 = i - X; x1 > i - Y - 1 && x1 > 0; i--) {
                if(c[x1] == 'B') {
                    Bl += 1;
                }
                else if (c[x1] == 'P') {
                    Pl += 1;
                } 
            }

            // Check Right
            for (int x1 = i + X; x1 < i + Y + 1 && x1 < (N - 1); i++) {
                if(c[x1] == 'B') {
                    Br += 1;
                }
                else if (c[x1] == 'P') {
                    Pr += 1;
                } 
            }
        
            // Add Up Total
            art += ((Bl * Pr) + (Pl * Br));
        }
    }

    return art;
  }

  public static void main() {
      System.out.println("Hello World!");
  }
  
}
