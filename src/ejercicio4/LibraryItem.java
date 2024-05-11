package ejercicio4;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isLoaned; // true si esta prestado, false si esta disponible

    public LibraryItem(String title, int itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public void showDetails()
    {
        System.out.println(title);
        System.out.println(itemId);
        System.out.println(isLoaned);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }
}
