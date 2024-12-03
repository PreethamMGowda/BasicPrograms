package Programming.BehaviorParameterization;

public class Book {

   private String name;
   private int pageCount;
   private String author;

   Book(String name){
       this.name = name;
       this.author = name;
   }
   Book(int pageCount){
       this.pageCount = pageCount;
   }


   public String getName(){
       return name;
   }
   public int getPageCount(){
       return pageCount;
   }
   public String getAuthor(){
       return author;
   }

   private void setName(String name){
       this.name = name;
   }
   private void setPageCount(int pageCount){
       this.pageCount = pageCount;
   }
   private void setAuthor(String author){
       this.author = author;
   }
}
