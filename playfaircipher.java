package com.company;
import java.util.Scanner;
public class playfaircipher {
    public static void decrypt(String ans){
        String keytext = "playfairexample";//sc.next();playfairexample
        String plaintext = ans;//"bmodzbxdnabekudmuixmmouvif";//"hidethegoldinthetreestump";//sc.next();//hidethegoldinthetreestump
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char[][] matrix = new char[5][5];//5x5 matrix
        String matrixstring = "";
        String combinedtext = keytext + alpha;
        for (int i = 0; i < combinedtext.length(); i++) {
            if (!matrixstring.contains("" + combinedtext.charAt(i))) {
                matrixstring=matrixstring+combinedtext.charAt(i);
            }

        }
        System.out.println(matrixstring);
        System.out.println(matrixstring.length());
        int n=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                //we can neglect either i or j based on our convinience
                if(matrixstring.charAt(n)!='j'){
                    matrix[i][j]=matrixstring.charAt(n);


                }
                else{
                    j--;
                }
                n++;
            }
        }


        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                //we can neglect either i or j based on our convinience

                System.out.print(matrix[i][j]+" ");



            }
            System.out.println(" ");
        }
       // String ans="";
        String temp="";
        String temp2="";
        for(int i=0;i<plaintext.length()-1;){
            temp="";
            temp2="";
            if(plaintext.charAt(i)!=plaintext.charAt(i+1)) {
                temp = temp + plaintext.charAt(i) + plaintext.charAt(i + 1);
                // System.out.println(temp);
                int row1 = -1;
                int col1 = -1;
                int row2=-1;
                int col2=-1;
               // int count=0;

                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (matrix[j][k] ==temp.charAt(0)){
                            row1=j;
                            col1=k;
                        }if(matrix[j][k]==temp.charAt(1)){
                            row2=j;
                            col2=k;
                        }
                        if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                            break;
                        }
                    }

                    if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                        break;
                    }
                }
                if(row1==row2){
                    if(col1==0){
                        col1=4;
                        col2=col2-1;
                    }else if(col2==0){
                        col2=4;
                        col1=col1-1;
                    }else{
                        col1=col1-1;
                        col2=col2-1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row1][col2];
                }else if(col1==col2){
                    if(row1==0){
                        row1=4;
                        row2=row2-1;
                    }else if(row2==0){
                        row2=4;
                        row1=row1-1;
                    }else{
                        row1=row1-1;
                        row2=row2-1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row2][col1];
                }else{
                    temp2=temp2+matrix[row1][col2]+matrix[row2][col1];
                }

                System.out.println(temp+"->"+temp2);
                i=i+2;
            }else{
                temp=temp+plaintext.charAt(i)+'x';
                // System.out.println(temp);

                int row1 = -1;
                int col1 = -1;
                int row2=-1;
                int col2=-1;
                //int count=0;

                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (matrix[j][k] ==temp.charAt(0)){
                            row1=j;
                            col1=k;
                        }if(matrix[j][k]==temp.charAt(1)){
                            row2=j;
                            col2=k;
                        }
                        if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                            break;
                        }
                    }

                    if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                        break;
                    }
                }
                if(row1==row2){
                    if(col1==0){
                        col1=4;
                        col2=col2-1;
                    }else if(col2==0){
                        col2=4;
                        col1=col1-1;
                    }else{
                        col1=col1-1;
                        col2=col2-1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row1][col2];
                }else if(col1==col2){
                    if(row1==0){
                        row1=4;
                        row2=row2-1;
                    }else if(row2==0){
                        row2=4;
                        row1=row1-1;
                    }else{
                        row1=row1-1;
                        row2=row2-1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row2][col1];
                }else{
                    temp2=temp2+matrix[row1][col2]+matrix[row2][col1];
                }

                System.out.println(temp+"->"+temp2);




                i=i+1;
            }
        }


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String keytext = "playfairexample";//sc.next();playfairexample
        String plaintext = "hidethegoldinthetreestump";//"bmodzbxdnabekudmuixmmouvif";//"hidethegoldinthetreestump";//sc.next();//hidethegoldinthetreestump
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String ans="";
        char[][] matrix = new char[5][5];//5x5 matrix
        String matrixstring = "";
        String combinedtext = keytext + alpha;
        for (int i = 0; i < combinedtext.length(); i++) {
            if (!matrixstring.contains("" + combinedtext.charAt(i))) {
                matrixstring=matrixstring+combinedtext.charAt(i);
            }

        }
        System.out.println(matrixstring);
        System.out.println(matrixstring.length());
        int n=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                    //we can neglect either i or j based on our convinience
                    if(matrixstring.charAt(n)!='j'){
                        matrix[i][j]=matrixstring.charAt(n);


                }
                    else{
                        j--;
                    }
                n++;
            }
        }


        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                    //we can neglect either i or j based on our convinience

                System.out.print(matrix[i][j]+" ");



            }
            System.out.println(" ");
        }
       // String ans="";
        String temp="";
        String temp2="";
        for(int i=0;i<plaintext.length()-1;){
            temp="";
            temp2="";
            if(plaintext.charAt(i)!=plaintext.charAt(i+1)) {
                temp = temp + plaintext.charAt(i) + plaintext.charAt(i + 1);
               // System.out.println(temp);
                int row1 = -1;
                int col1 = -1;
                int row2=-1;
                int col2=-1;
             //   int count=0;

                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (matrix[j][k] ==temp.charAt(0)){
                            row1=j;
                            col1=k;
                        }if(matrix[j][k]==temp.charAt(1)){
                            row2=j;
                            col2=k;
                        }
                        if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                            break;
                        }
                    }

                    if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                        break;
                    }
                }
                if(row1==row2){
                    if(col1==4){
                        col1=0;
                        col2=col2+1;
                    }else if(col2==4){
                        col2=0;
                        col1=col1+1;
                    }else{
                        col1=col1+1;
                        col2=col2+1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row1][col2];
                }else if(col1==col2){
                    if(row1==4){
                        row1=0;
                        row2=row2+1;
                    }else if(row2==4){
                        row2=0;
                        row1=row1+1;
                    }else{
                        row1=row1+1;
                        row2=row2+1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row2][col1];
                }else{
                    temp2=temp2+matrix[row1][col2]+matrix[row2][col1];
                }

                System.out.println(temp+"->"+temp2);
                ans=ans+temp2;
                i=i+2;
            }else{
                temp=temp+plaintext.charAt(i)+'x';
               // System.out.println(temp);

                int row1 = -1;
                int col1 = -1;
                int row2=-1;
                int col2=-1;
               // int count=0;

                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5; k++) {
                        if (matrix[j][k] ==temp.charAt(0)){
                            row1=j;
                            col1=k;
                        }if(matrix[j][k]==temp.charAt(1)){
                            row2=j;
                            col2=k;
                        }
                        if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                            break;
                        }
                    }

                    if(row1>-1&&col1>-1&&row2>-1&&col2>-1){
                        break;
                    }
                }
                if(row1==row2){
                    if(col1==4){
                        col1=0;
                        col2=col2+1;
                    }else if(col2==4){
                        col2=0;
                        col1=col1+1;
                    }else{
                        col1=col1+1;
                        col2=col2+1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row1][col2];
                }else if(col1==col2){
                    if(row1==4){
                        row1=0;
                        row2=row2+1;
                    }else if(row2==4){
                        row2=0;
                        row1=row1+1;
                    }else{
                        row1=row1+1;
                        row2=row2+1;
                    }
                    temp2=temp2+matrix[row1][col1]+matrix[row2][col1];
                }else{
                    temp2=temp2+matrix[row1][col2]+matrix[row2][col1];
                }

                System.out.println(temp+"->"+temp2);

               ans=ans+temp2;


                i=i+1;
            }
        }
       decrypt(ans);
    }
}
