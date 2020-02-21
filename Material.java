public abstract class Material
{
    protected String name;
    protected String author;
    protected String publisher;
    protected int numPages;


    public Material(String name, String author, String publisher, int numPages)
    {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.numPages = numPages;
    }


    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getPublisher()
    {
        return publisher;
    }

    public int getNumPages()
    {
        return numPages;
    }



    public String toString()
    {
        String output = "";
        output += "Name: " + name + "\n";
        output += "Author: " + author + "\n";
        output += "Publisher: " + publisher + "\n";
        output += "Pages: " + numPages + "\n";
        return output;
    }
}
