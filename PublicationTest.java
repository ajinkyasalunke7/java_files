class Publication {
    private String title;
    private double price;
    private int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    
    public void saleCopy(int numberOfCopies) {
        this.copies = numberOfCopies;
        System.out.println(numberOfCopies + " copies of " + title + " sold.");
    }

    public double totalSale() {
        return price * copies;
    }
}

class Book extends Publication {
	 private String author;

	 // Constructor
	 public Book(String title, double price, int copies, String author) {
	     super(title, price, copies);
	     this.author = author;
	 }

	 // Getters and Setters
	 public String getAuthor() {
	     return author;
	 }

	 public void setAuthor(String author) {
	     this.author = author;
	 }

	 // Unique method
	 public void orderCopies(int numberOfCopies) {
	     setCopies(getCopies() + numberOfCopies);
	     System.out.println(numberOfCopies + " copies of " + getTitle() + " ordered.");
	 }
	}

    class Magazine extends Publication {
    private int orderQty;
    private String currentIssue;

    public Magazine(String title, double price, int copies, String currentIssue) {
        super(title, price, copies);
        this.currentIssue = currentIssue;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public String getCurrentIssue() {
        return currentIssue;
    }

    public void setCurrentIssue(String currentIssue) {
        this.currentIssue = currentIssue;
    }

    public void orderQty(int numberOfCopies) {
        setOrderQty(numberOfCopies);
        System.out.println(numberOfCopies + " copies of " + getTitle() + " (Issue: " + currentIssue + ") ordered.");
    }

    public void receiveIssue(String newIssue) {
        setCurrentIssue(newIssue);
        System.out.println("Received new issue: " + newIssue);
    }
}



public class PublicationTest {
 public static void main(String[] args) {
  
     Book book1 = new Book("Java Programming", 300.00, 200, "Ajinkya Salunke");
     Magazine magazine1 = new Magazine("MAG_1", 15.00, 100, "September 2024");
    
     System.out.println("Initial state:");
     System.out.println("Book: " + book1.getTitle() + " by " + book1.getAuthor() + ", Copies: " + book1.getCopies());
     System.out.println("Magazine: " + magazine1.getTitle() + ", Current Issue: " + magazine1.getCurrentIssue() + ", Copies: " + magazine1.getCopies());

   
     book1.orderCopies(40);
     book1.saleCopy(20);

     magazine1.orderQty(40);
     magazine1.receiveIssue("October 2024");

     System.out.println("\nFinal state:");
     System.out.println("Book: " + book1.getTitle() + " by " + book1.getAuthor() + ", Copies: " + book1.getCopies());
     System.out.println("Magazine: " + magazine1.getTitle() + ", Current Issue: " + magazine1.getCurrentIssue() + ", Copies: " + magazine1.getCopies());

  
     System.out.println("\nTotal sales:");
     System.out.println("Total sale of book: $" + (200 - book1.getCopies()) * book1.getPrice());
     System.out.println("Total sale of magazine: $" + (100 - magazine1.getCopies()) * magazine1.getPrice());
 }
}