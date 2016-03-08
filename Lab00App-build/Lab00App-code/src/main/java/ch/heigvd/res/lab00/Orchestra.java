/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Norah
 */
public class Orchestra {
 public void addInstrument(IInstrument I){
       nbreInstruments++;
       listSoundInstrumenJouer.add(I.play());
       listInstrumenJouer.add(I);
 }
  public int getNumberOfInstruments(){
      return nbreInstruments;
  }
  public  List<String> makeMusic(){
      return listSoundInstrumenJouer;
  }
 private int nbreInstruments = 0;
 private List<String> listSoundInstrumenJouer = new LinkedList(); 
 private List<IInstrument> listInstrumenJouer = new LinkedList(); 
}
