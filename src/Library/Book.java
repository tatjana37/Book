
package Library;

public class Book {
String title;
public Book (String title) {
this.title = title;
}
public static void main(String[] args) {
Author[]authorArray = {new Author(),
new Author(),
new Author(),
};
System.out.println(authorArray[0].getAuthors()[0]);
System.out.println(authorArray[0].getAuthors()[1]);
String test []={"Flober", "Albert Dreiser","Anne Golon", "Serge Golon" };
authorArray[1].setAuthors(test);
System.out.println(authorArray[1].getAuthors()[0]);
System.out.println(authorArray[1].getAuthors()[1]);
System.out.println(authorArray[1].getAuthors()[2]);
System.out.println(authorArray[1].getAuthors()[3]);
Book book = new Book("Завет умершей");
String [] books = new String[5];
books[0] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[0];
book.title = "Триумфальная арка";
books[1] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[1];
book.title = "Госпожа Бовари";
books[2] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[0];
book.title = "Гений";
books[3] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[1];
book.title = "Анжелика маркиза Ангелов";
books[4] = "Title book: " + book.title + " authors: " + authorArray[1].getAuthors()[2] + ", " +authorArray[1].getAuthors()[3];
for(String x: books){
System.out.println(x);
}
}
public String toString(){
return title;
}
}

