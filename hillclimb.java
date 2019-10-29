package com.company;

public class hillclimb {
    public static void main(String args[]){
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String keytext="GYBNQKURP";
        String message="ACT";
        int[][]keymat=new int [3][3];
        int [][] messagemat=new int[3][1];
        int n=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                keymat[i][j]=(keytext.charAt(n))%65;
                System.out.print(keymat[i][j]+" ");
                n++;
            }
            System.out.println("");
        }
        n=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++){
                messagemat[i][j]=(message.charAt(n))%65;
                System.out.print(messagemat[i][j]+" ");
                n++;
            }
            System.out.println(" ");
        }
        n=0;
        int [][]encryptarr=new int[3][1];
      for(int i=0;i<3;i++){
          n=0;
          for(int j=0;j<3;j++){
              n=n+keymat[i][j]*messagemat[j][0];

          }
          encryptarr[i][0]=n%26;

      }
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++){
                System.out.println(encryptarr[i][j]+"->"+alpha.charAt(encryptarr[i][j]));
            }}
    }
}
