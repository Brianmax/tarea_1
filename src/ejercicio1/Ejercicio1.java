package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creando biblioteca

        Library library1 = new Library();

        // creamos algunos libros y dvd
        Book book1 = new Book("Harry Potter", 1, false, "J.K. Rowling");
        Book book2 = new Book("El señor de los anillos", 2, false, "J.R.R. Tolkien");
        Book book3 = new Book("Cien años de soledad", 3, false, "Gabriel García Márquez");

        Dvd dvd1 = new Dvd("Titanic", 4, false, "James Cameron", 195);
        Dvd dvd2 = new Dvd("El padrino", 5, false, "Francis Ford Coppola", 175);
        Dvd dvd3 = new Dvd("El rey león", 6, false, "Roger Allers", 90);

        // agregamos a la biblioteca
        library1.addItem(book1);
        library1.addItem(book2);
        library1.addItem(book3);
        library1.addItem(dvd1);
        library1.addItem(dvd2);
        library1.addItem(dvd3);

        // crear usuarios
        LibraryUser user = new LibraryUser("user1", 1);
        LibraryUser user2 = new LibraryUser("user2", 2);
        LibraryUser user3 = new LibraryUser("user3", 3);
        LibraryUser user4 = new LibraryUser("user4", 4);
        LibraryUser user5 = new LibraryUser("user5", 5);
        LibraryUser user6 = new LibraryUser("user6", 6);

        // agregar usuarios

        library1.addUser(user);
        library1.addUser(user2);
        library1.addUser(user3);
        library1.addUser(user4);
        library1.addUser(user5);
        library1.addUser(user6);

        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("1. Mostrar todos los items");
            System.out.println("2. Prestar item");
            System.out.println("3. Devolver item");

            int option = scanner.nextInt();

            if(option == 1)
            {
                library1.showAllItems();
            }
            else if(option == 2)
            {
                System.out.println("Ingrese el id del item");
                int itemId = scanner.nextInt();
                System.out.println("Ingrese el id del usuario");
                int userId = scanner.nextInt();
                library1.loanItem(itemId, userId);
            }
            else if(option == 3)
            {
                System.out.println("Ingrese el id del item");
                int itemId = scanner.nextInt();
                System.out.println("Ingrese el id del usuario");
                int userId = scanner.nextInt();
                library1.returnItem(itemId, userId);
            }
            else
            {
                break;
            }
        }
    }
}