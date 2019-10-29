package com.company;

public class VigenèreCipher {
    public static void main(String args[]){
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String plaintext="GEEKSFORGEEKS";
        String key="AYUSH";
        String keyword="";
        char[][]matrix=new char[26][26];
        int n=0;
        int count=0;
        while(count<plaintext.length()){
            keyword=keyword+key.charAt(n);
            if(n==key.length()-1){
                n=-1;
            }
            n++;
            count++;

        }
        System.out.println(keyword);
       int itr=0;
        int m=0;
        for(int i=0;i<26;i++){

            for(int j=0,k=i;j<26&&k<26;j++,k++){
                matrix[i][j]=alpha.charAt(k);

            }
        }

        for(int i=1;i<26;i++){

            for(int j=26-i,k=i-1;j<=25&&k<i;j--,k++){

                matrix[i][j]=alpha.charAt(k);

            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println("");
        }

    }
}
