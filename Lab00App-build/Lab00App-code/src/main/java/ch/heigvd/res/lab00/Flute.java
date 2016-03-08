/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Norah
 */
public class Flute  implements IInstrument {
      @Override
    public String play() {
        return "trilili"; 
    }
    
   public int getSoundVolume(){
        return volume;
    }
   public String getColor(){
       return color;
   }
   private String color;
   private int volume = 0;
}
