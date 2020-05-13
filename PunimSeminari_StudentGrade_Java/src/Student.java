
/**
 * Klasa Student sherben per ti kthyer te dhenat e studenteve po ashtu dhe regjistron lendet dhe notat per student
 * 
 * @author Gentrit.Hoxha
 *
 */
public class Student {
 
 private int      id;	
 private String   name; 
 private String   surname;
 public  String[] lendet = { "Diskrete","Elementare ","Programim","Hyrje","Anglisht" };
 public int[] notat={0,0,0,0,0};
 public Student() {}
 
 /**Kjo metode ka per detyre te krijoje nje objekt per secilin Student*/
 public Student(int id,String name,String surname){
	  this.id = id;
     this.name=name;
     this.surname=surname;
 }
   /**Metode e cila e kthen ID*/
   public int getId(){
	      return id;
      }
  /**Metode e cila e kthen Emrin*/
   public String getName() {
      return name;
      }
 
  /**Metode e cila e kthen mbiemrin*/
   public String getSurname(){
	  return surname;
     }
 
 /** Kjo metode e cila e kthen emrin e plote */ 
   public String getFullName(){
	   return id + ":  "+name+" "+surname;
     }
 
  /** Metode e cila e vendos noten ne indeks te caktuar per secilen lende */
    public void setNota(int i,int nota){
         notat[i] = nota;}
 
 /** Metode e cila kthen noten*/
     public int getNota(int i){
       return notat[i];}
}
