package com.company;


import java.util.Scanner;
public class caesar {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String text=sc.next();
        int shift=sc.nextInt();
        System.out.println(encrypt(text,shift));
        text=encrypt(text,shift);
        System.out.println(decrypt(text,shift));

    }
    public static String encrypt(String t,int shift){
        String ans="";
        t=t.toLowerCase();
        for(int i=0;i<t.length();i++) {
            char a = (char)(((int) t.charAt(i)+shift-97)%26+97);
            ans=ans+a;
        }


        return ans;

    }
    public static String decrypt(String t,int shift){
        String ans1="";
        t=t.toLowerCase();
        for(int i=0;i<t.length();i++) {
            char a = (char)(((int) t.charAt(i)-shift-97)%26+97);
            ans1=ans1+a;
        }
        //decrypt(ans,shift);
        return ans1;


    }


}

