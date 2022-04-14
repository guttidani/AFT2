/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aft2;

import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author jani
 */
public class Steps {
  private static String[][] table = new String[3][3];
  private static int LastPlayer=-1;
  public static String StepCheck(int x, int y, int jatekos){
      //ellenorzi es betolti az x et vagy o at

      //if(jatekos!=1 || jatekos!=2){
      //    return "1 vagy 2 jatekos lehet";
      //}
      
      if(table[x][y] == null){
          if(jatekos==1){
              LastPlayer =jatekos;
              table[x][y]="x";
              System.out.println("x");
              return "x";
          }
          else {
              LastPlayer =jatekos;
              table[x][y]="o";
              System.out.println("o");
              return "o";
          }
          
      }
      else{
          System.out.println("!!!");
          return "Folgalt a hely";
      }
      
     
  }
   public static String[][] GetTableArray(){
       //visszaadja a tablazatot
          return table;
    }
    public static int GetLastPlayer(){
        //Visszaadja a utolsó jatekost
          return LastPlayer;
    }
    public static void ResetGame(){
        //ResetGame settings
        table = new String[3][3];
        LastPlayer = -1;
    }
    public static int StartPlayer(){
        //Ki kezd
        Random random =new Random();
        int r = random.nextInt(1, 3);
        System.out.println(r);
        return (int) r;
    }
}
