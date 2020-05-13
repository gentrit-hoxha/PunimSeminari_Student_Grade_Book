/**
 * Klasa input merret me hyrjen e te dhenave 
 * @author Gentrit.Hoxha
 * @return  
 */
 
import javax.swing.JOptionPane;
public class Input{

   
   /**getNr sherben per te marre nje vlere numer
   * @param  String b
   * @return  vleren numerike 
   */
   public int getNr(String b) {   
      int i=0;
      String s = JOptionPane.showInputDialog(b);
      if(s == null){getNr(b);}
      else{
          s = s.trim();
          i = Integer.parseInt(s);}
  
       return i;
   }

      /**getString sherben per te marre input nje String
      * @param String b
      * @return nje vlere String ku shkronja e pare eshte nje shkronje e madhe (UpperCase)
      * ndersa pjesa tjeter e shkronjave te fjalen jane te vogla (lowerCase)
       */
        public String getString(String b){   
        String s = JOptionPane.showInputDialog(b);
      if  (s == null){getString(b);}
      else {s = s.trim().toUpperCase();}
      return s.charAt(0)+s.substring(1,s.length()).toLowerCase();
   }
   
     /**getChar sherben per te marre nje input nje Karakter
     * @param String b
     
     * @return karakterin ne poziten e pare me shkronje te madhe 
     */
     
   public char getChar(String b) {
      String s = JOptionPane.showInputDialog(b);
      if(s==null){getString(b);}
      else{s = s.trim().toUpperCase();}
      return s.charAt(0);
   }
}