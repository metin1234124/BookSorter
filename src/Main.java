import java.sql.Connection;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Fareler ve insanlar",111,"John Steinbeck",2012));
        books.add(new Book("Hayat imkansiz",368,"Matt Haig",2024));
        books.add(new Book("Icimizdeki seytan",267,"Sabahattin Ali",1940));
        books.add(new Book("Seker Portakali",200,"Jose Mauro De Vasconcelos",1968));
        books.add(new Book("Toprak Ana",136,"Cengiz Aytmatov",1963));
        System.out.println();


        System.out.println("Isme gore siralama islemi");
        System.out.println();
       for (Book name:books){
           System.out.println("Kitap adi: "+name.getName());
       }
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Sayfaya gore siralama islemi");
        System.out.println();

       TreeSet<Book> books1=new TreeSet<>(new orderByNumberOfPages());
        books1.add(new Book("Fareler ve insanlar",111,"John Steinbeck",2012));
        books1.add(new Book("Hayat imkansiz",368,"Matt Haig",2024));
        books1.add(new Book("Içimizdeki şeytan",267,"Sabahattin Ali",1940));
        books1.add(new Book("Şeker Portakalı",200,"Jose Mauro De Vasconcelos",1968));
        books1.add(new Book("Toprak Ana",136,"Cengiz Aytmatov",1963));


        for (Book numberOfPages:books1){
           System.out.println("Sayfa sayisi: "+numberOfPages.getNumberOfPages());
       }
    }
}
