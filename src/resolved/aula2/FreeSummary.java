package resolved.aula2;

public class FreeSummary {
  private String subject;
  private String name;
  private String text;

   public String getName(){
    return this.name;
  }
   public String getSubject(){
    return this.subject;
  }
   public String getText(){
    return this.text;
  }

  public void setSummary(String subject, String name, String text){
      this.name = name;
      this.subject = subject;
      this.text = text;
  }
}
