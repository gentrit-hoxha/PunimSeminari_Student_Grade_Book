/**
 * Klasa OUTPUT ben te mundur qe te vizatohet nje dritare ku paraqiten te dhenat 
 * 
 * @author Gentrit.Hoxha
 *
 */


import javax.swing.*;
import java.awt.*;
public class Output extends JPanel
{ 
   private int width = 800;
   private int height= 600;	  
   private String s="";
   private String s1="";
   private String title="";
	//**Kontruktori merret me vizatimin e kornizes*/
   public Output() {
      JFrame my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      my_frame.setTitle("Student GradeBook Aplication");
      my_frame.setSize(width, height);
      my_frame.setVisible(true);
   }
	 
     /**Metoda drawString sherben per ndarjen e fjalive kur perdoret \n  */
   private void drawString(Graphics g, String text, int x, int y) {
      int lineHeight = g.getFontMetrics().getHeight();
      for (String line : text.split("\n"))
      g.drawString(line, x, y += lineHeight);
      this.repaint();
      
      }
	/**Metoda paintComponent e cila merret me vizatimin e pamjes ne pane*/  
   public void paintComponent(Graphics g){ 
   
      super.paintComponent(g);
      g.setColor(Color.white); 
      g.fillRect(0, 0, width, height); 
       
      ImageIcon i = new ImageIcon("stud1.png");
      i.paintIcon(this, g,10, 0);
      g.setColor(Color.black);
      g.setFont(new Font("Centhury Gothic",Font.BOLD,25));
      g.drawString(title, 100,20);
      int text_margin = 240;
      int text_baseline = 160;
     
      g.setFont(new Font("Aharoni",Font.BOLD,24));
      g.drawString(s, text_margin, text_baseline);
      
      g.setFont(new Font("Calibri",Font.BOLD,18));
      drawString(g,s1, text_margin, text_baseline+10);
  
     
      this.repaint();
}

   /**Metoda show merret me paraqitjen e nje teksti ku na nevojitet
   @param String message
   */
   public void show(String message)
   {  s = message;
      this.repaint();
    
   }
   
   /** Metoda show1 merret me paraqitjen e nje teksti 
       @param   String message */
   public void show1(String message)
   {  s1 = message;
      this.repaint();
    
   }
   
   /** Metoda showtitle merret me paraqitjen e nje titulli ne ndonje pjese te caktuar
       @param   String message */
   public void showtitle(String message)
   {  title = message;
      this.repaint();
    
   }
	 

        
}










