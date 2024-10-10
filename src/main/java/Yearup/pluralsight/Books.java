package Yearup.pluralsight;

public class Books
{
    private int id;
    private String isbn;
    private String title;
    private static boolean isCheckedOut;
    private String checkedOutTo;

    public Books(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isCheckedOut()
    {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut)
    {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo)
    {
        this.checkedOutTo = checkedOutTo;
    }
    @Override
    public String toString()
    {
        return "ID: " + id +
                ", ISBN: " + isbn +
                ", Title: " + title +
                ", Checked Out: " + isCheckedOut +
                (isCheckedOut ? ", Checked Out To: " + checkedOutTo : "");
    }

    public void checkOut(String name)
    {
        if(!isCheckedOut)
        {
            this.checkedOutTo = name;
            this.isCheckedOut = true;
            System.out.println("Successfully checked out to:" + name);
        }
        else
        {
            System.out.println("This book is already checked out!");
        }
    }

    public void checkIn()
    {
        if(isCheckedOut)
        {
            this.checkedOutTo = "";
            this.isCheckedOut = false;
            System.out.println("Book successfully checked in!");
        }
        else
        {
            System.out.println("This book is already checked in!");
        }
    }
}
