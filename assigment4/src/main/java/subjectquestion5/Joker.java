package subjectquestion5;

public class Joker {
	String s1;
	String s2;
   public Joker(){
	   
   }
   public Joker(String str1 ,String str2){
	   this.s1 = str1;
	   this.s2 = str2;
   }
   
   
   
   //Overloading
   public String DanceDiwaneJoker(String str1 , String str2) {
	   return "Joker no "+str1+" Performing "+str2;
   }
   public int  DanceDiwaneJoker(int age) {
	   return age;
   }
   
   public static void main(String args[]) {
	   Joker j1 = new Joker();
	   Joker j2 = new Joker();
	   Joker j3 = new Joker();
	   Joker j4 = new Joker(); 
	   Joker j5 = new Joker();
	   Joker j6 = new Joker();
	   Joker j7 = new Joker();
	   Joker j8 = new Joker();
	   
	   Joker j11 = new Joker("Joker1","Salsa");
	   Joker j12 = new Joker("joker2","BharatNatyam");
	   Joker j13 = new Joker("Joker3","Dance1");
	   Joker j14 = new Joker("Joker4","Kathak");
	   Joker j15 = new Joker("Joker5","Kuchipudi");
	   Joker j16 = new Joker("Joker6","HipHop");
	   Joker j17 = new Joker("Joker7","Break Dance");
	   Joker j18 = new Joker("Joker8","Bhagda");
	   
		   
	   
		  
	   
	   System.out.println("Ages of joker: ");
	   System.out.println(j1.DanceDiwaneJoker(20));
	   System.out.println(j2.DanceDiwaneJoker(60));
	   System.out.println(j3.DanceDiwaneJoker(61));
	   System.out.println(j4.DanceDiwaneJoker(34));
	   System.out.println(j5.DanceDiwaneJoker(50));
	   System.out.println(j6.DanceDiwaneJoker(45));
	   System.out.println(j7.DanceDiwaneJoker(30));
	   System.out.println(j8.DanceDiwaneJoker(31));
   
	  
   }
}
