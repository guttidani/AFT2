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
  private String[][] table = new String[3][3];
  private int LastPlayer=-1;
  public String StepCheck(int x, int y, int jatekos){
      //ellenorzi es betolti az x et vagy o at
      
      if(jatekos!=1 || jatekos!=2){
          return "1 vagy 2 jatekos lehet";
      }
      if(table[x][y]==""){
          if(jatekos==1){
              LastPlayer =jatekos;
              table[x][y]="x";
              return "x";
          }
          else {
              LastPlayer =jatekos;
              table[x][y]="o";
              return "o";
          }
          
      }
      else{
          return "Folgalt a hely";
      }
      
     
  }
   public String[][] GetTableArray(){
       //visszaadja a tablazatot
          return table;
    }
    public int GetLastPlayer(){
        //Visszaadja a utolsó jatekost
          return LastPlayer;
    }
    public void ResetGame(){
        //ResetGame settings
        table = new String[3][3];
        LastPlayer = -1;
    }
    public int StartPlayer(){
        //Ki kezd
        Random random =new Random();
        int r = random.nextInt(1, 3);
        System.out.println(r);
        return (int) r;
    }
}
