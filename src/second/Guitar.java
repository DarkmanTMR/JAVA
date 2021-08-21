package second;

public class Guitar implements Instrument{
   private int strNumb;

   public Guitar() {
   }

   public Guitar(int strNumb) {
      this.strNumb = strNumb;
   }

   public int getStringsNumber() {
      return strNumb;
   }

   public void setStringsNumber(int stringsNumber) {
      this.strNumb = stringsNumber;
   }

   @Override
   public String toString() {
      return "Guitar{" +
              "stringsNumber=" + strNumb +
              '}';
   }
   public void play(){
      System.out.println("now playing guitar with " + getStringsNumber() + " strings");
   }
}
