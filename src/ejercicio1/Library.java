package ejercicio1;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> users;

    public Library()
    {
        libraryItems = new ArrayList<>();
        users = new ArrayList<>();
    }
    public void addItem(LibraryItem item)
    {
        libraryItems.add(item);
    }
    public void showAllItems()
    {
        for(LibraryItem item : libraryItems)
        {
            item.showDetails();
            System.out.println("======================================");
        }
    }
    public void addUser(LibraryUser user)
    {
        users.add(user);
    }
    public void loanItem(int itemId, int userId)
    {
        // not true -> false
        // not false -> true
        // verificar si existe
        LibraryItem itemFound = existByIdItem(itemId);
        // en caso exista verificar el estado
        if(itemFound == null)
        {
            // significa que el item buscado no se encontro
            System.out.println();
            System.out.println("El item con id: " + itemId + " no se encontro");
            System.out.println();
            return;
        }
        if(itemFound.isLoaned())
        {
            System.out.println();
            System.out.println("El item: " + itemFound.getTitle() + " ya esta prestado");
            System.out.println();
            return;
        }
        // Verificar el usuario
        LibraryUser userFound = existByIdUser(userId);
        if(userFound == null)
        {
            System.out.println();
            System.out.println("El usuario con id: " + userId + " no se encontro");
            System.out.println();
            return;
        }
        // hacer el prestamo
        itemFound.setLoaned(true);
        userFound.getLoanedItems().add(itemFound);
        System.out.println();
        System.out.println("Se presto el item: " + itemFound.getTitle() + " al usuario: " + userFound.getUsername());
        System.out.println();
    }
    public void returnItem(int itemId, int userId)
    {
        // implementacion
    }
    private LibraryItem existByIdItem(int itemId)
    {
        for(LibraryItem item : libraryItems)
        {
            if(item.getItemId() == itemId)
            {
                return item;
            }
        }
        return null;
    }
    private LibraryUser existByIdUser(int userId)
    {
        for(LibraryUser user : users)
        {
            if(user.getUserId() == userId)
            {
                return user;
            }
        }
        return null;
    }
}
