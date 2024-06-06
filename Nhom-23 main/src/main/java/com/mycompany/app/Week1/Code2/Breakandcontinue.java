package com.mycompany.app.Week1.Code2;

public class Breakandcontinue{
  public static void main(String[] args){
    int a = 10;
    for(int i = 0 ; i <10 ; i++){
      a--;
      if(a==5){
        break;}
    if(a>5){
      System.out.println(i);
      continue;
    }
  }
}
}