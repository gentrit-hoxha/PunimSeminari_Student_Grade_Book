/**
 * Klasa CONTROLLER integron se bashku klaset e tjera 
 * 
 * @author Gentrit.Hoxha
 *
 */
public class Controller{

   private Input   i =   new   Input();
   private Output  o =   new   Output();
   private Maker   c =   new   Maker();
   public Controller() {
   
      this.comm();
   	
   }
   
   public void comm() {
      o.showtitle("Aplikacioni Per Student");
      char s = i.getChar(" Q-Quit \n R- Regjistrimi i Studenteve\n L-Lista \n N-Notimi Studenteve \n S-Shiko Notat \n A-Nota Mesatare \n D-Fshij Studentin");
      if(s=='Q') {
         System.exit(0); 
      }
      
      else if(s=='R'){ c.RegisterStudent();
      }
      
      else if(s=='D'){ c.deleteStudent();
      }
      
      else if(s=='L') {
         o.show("Id: Emri dhe Mbiemri");
         o.show1(c.Lista());
      }
      
      else if(s=='N'){
         o.show("ID Emri Mbiemri Lenda Nota");	
         o.show1(c.studentAction());}
      
      else if(s=='S'){
         o.show("ID Emri Mbiemri");	
         o.show1(c.seeGrades());}
      
      else if(s=='A'){
         o.show("ID :Emri ,Mbiemri , Nota Mesatare");	
         o.show1(c.Average());}
    else if (s!='R'||s!='A'||s!='S'||s!='N'||s!='L'||s!='D'||s!='Q'){
    System.exit(0);
    }
    
      else {
         this.comm();}
   	
      this.comm();
   	
   }
              public static void main(String[] args){
            new Controller();
            }
}