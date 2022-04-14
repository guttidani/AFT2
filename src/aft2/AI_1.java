/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aft2;

/**
 *
 * @author jani
 */
public class AI_1 {
    public static void Play(){
        String[][] table = Steps.GetTableArray();
        
        for (int r = 0; r < 3; r++) { // row
            for (int c = 0; c < 3; c++) { // colum
            if(table[r][c] == "")
                Steps.StepCheck(r, c, 0); // set check
            }
        }
    }
}
