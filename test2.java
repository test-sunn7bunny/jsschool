/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dean
 */
public class test2 {
    
    public static void main(String[] args){
        result2();
    }
    
    public static void result2 (){
        int[] a1 = { 0 , 1 , 1 , 14 };
        int[] a2 = { 1, 14 , 1 , 0 };
        int match = 0;
        int bigmatch = 0;
        int cc = 0;
        int[] duplicate = { 0 , 0 , 0 , 0 };
        
        for (int i = 0; i < 4; i++) {
            match = 0;
            for (int j = 3 ; j >= 0; j-- ) {
                if (a1[i] == a1[j]) match++;
            }
            duplicate[i] = match;
        }
        
        for (int i = 0; i < 4; i++) {
            match = 0;
            if (bigmatch != cc) {
                System.out.println("false"); 
                break;
            }
            else {
                for (int j = 0; j < 4; j++) {
                    if (a1[i] == a2 [j]) {
                    match++;}
                }
            }
                if (duplicate[i] == match) bigmatch++;
            cc++;
        }
        if (bigmatch == 4) System.out.println("true"); 
            
    }
}
