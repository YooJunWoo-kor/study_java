package mywork;

public class Book {
   private String title;
   private String author;
   private int price;
   
   public void setTitle(String title){
    this.title = title;
   }

   public String getTitle(String title){
    return title;
   }

   public void setAuthor(String author) {
    this.author = author;
   }

   public String getAuthor() {
    return author;
   }

   public void setPrice(int price) {
    this.price = price;
   }

   public int getPrice() {
    return price;
   }

   public void showInfo(){
    System.out.printf("[제목 : %s, 저자 : %s, 가격 : %d원]\n", title, author, price);
   }


   
   

}
