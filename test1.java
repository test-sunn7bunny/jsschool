import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dean
 */
public class test1 {
    
    public static void main(String[] args){
        result1(7);
    }
    
    public static void result1 (int n){
        int i = 0;
        int j = 0;
        int a = 1;
        int [][] res = new int[n][n];
        int cc = 1; //cycle counter
        int cd = 1; //cycle direction
        
        while (a <= power(n,2)) {
            
            //cycle status cs = 1:
            if (cd == 1) {
                j = cc - 1;
                for (i = cc - 1; i <= n - cc; i++) {
                    res[j][i] = a;
                    a++;

                }
                cd = 2;
            }
            
            //cycle status cs = 2:
            if (cd == 2) {
                i = n - cc;
                for (j = cc; j <= n - cc; j++) {
                    res[j][i] = a;
                    a++;

                }
                cd = 3;
            }
            
            //cycle status cs = 3:
            if (cd == 3) {
                j = n - cc;
                for (i = n - cc - 1; i >= cc - 1; i--) {
                    res[j][i] = a;
                    a++;

                }
                cd = 4;
            }
            
            //cycle status cs = 4:
            if (cd == 4) {
                i = cc - 1;
                for (j = n - cc - 1; j >= cc; j--) {
                    res[j][i] = a;
                    a++;

                }
                cd = 1;
            }
            cc++;
        }
        
        for (int k = 0 ; k < n ; k++){
            for (int l = 0 ; l < n ; l++){
                System.out.print (res[k][l] + "\t");
            }
            System.out.println();
        }
    }
} 
