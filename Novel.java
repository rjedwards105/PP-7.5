public class Novel extends Material
{
    private int numChapters;
    private boolean isFiction;


    public Novel(String name, String author, String publisher, int numPages, int numChapters, boolean isFiction)
    {
        super(name, author, publisher, numPages);
        this.numChapters = numChapters;
        this.isFiction = isFiction;
    }



    public int getNumChapters()
    {
        return numChapters;
    }

    public boolean getIsFiction()
    {
        return isFiction;
    }

    public String toString()
    {
        String output = super.toString();
        output += "Number of Chapters: " + numChapters + "\n";
        if (isFiction)
        {
            output += "Fiction\n";
        }
        else
        {
            output += "Nonfiction\n";
        }
        return output;
    }
}
