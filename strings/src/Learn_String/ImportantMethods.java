package Learn_String;

public class ImportantMethods {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ImportantMethods i = new ImportantMethods();
//    i.upperAndLower();
//    i.trim_Method();
//    i.StartandEnds_with();
//    i.CharAt();
//    i.Length();
//    i.Intern();//pending
//    i.ValueOf();//pending
//    i.Replace();//pending
    
  }

  private void Replace() {
    // TODO Auto-generated method stub
    
  }

  private void Intern() {
    // TODO Auto-generated method stub
    
  }

  private void ValueOf() {
    // TODO Auto-generated method stub
    
  }

  private void Length() {
    // TODO Auto-generated method stub
    String s="Sachin";
    System.out.println(s.length());
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
    }
    
  }

  private void CharAt() {
    // The String class charAt() method returns a character at specified index.
    String s="Sachin";    
    System.out.println(s.charAt(0));//S    
    System.out.println(s.charAt(3));//h 
    System.out.println(s.charAt(7));
    
  }

  private void StartandEnds_with() {
    // TODO it checks start and end letters
    String s="Sachin";    
     System.out.println(s.startsWith("SA"));//true    
     System.out.println(s.endsWith("n"));//true    
  }

  private void trim_Method() {
    // TODO it remove white spaces before and after the String.
    String s="  Sachin Tendulkar  ";    
    System.out.println(s);//  Sachin      
    System.out.println(s.trim());//Sachin   
  }

  private void upperAndLower() {
    // TODO its change to upper or lower case.
    String s="Sachin";    
    System.out.println(s.toUpperCase());//SACHIN    
    System.out.println(s.toLowerCase());//sachin    
    System.out.println(s);//Sachin(no change in original)    
  }

}