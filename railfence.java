package com.company;

public class railfence {
    public static void main(String args[]) {
        String str = "GEEKSFORGEEKS";
        int no = 3;
        int n=0;
        char[][] mat = new char[3][str.length()];
        int i=0;int col=0;
        int j=0;
        int count=0;
        while (n < str.length()) {
            for (i = 0+count, col = col; i < no && col < str.length(); i++, col++) {
                mat[i][col] = str.charAt(col);
            }

            for (j = no-2,col=col; j >= 0 && col < str.length(); j--, col++) {
                mat[j][col] = str.charAt(col);
            }
        count=1;
        n++;
        }
        for(i=0;i<no;i++){
            for(j=0;j<str.length();j++){
                if(mat[i][j]>=65&&mat[i][j]<=91) {
                    System.out.print(mat[i][j]+" ");
               }
                }
            //System.out.println("");
        }
    }
}