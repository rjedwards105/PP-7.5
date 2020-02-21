public class Journal extends Material
{
    private String journalTitle;
    private double version;
    private int volume;
    private int issue;
    private boolean isScientific;


    public Journal(String name, String author, String publisher, int numPages, String journalTitle, double version, int volume, int issue, boolean isScientific)
    {
        super(name, author, publisher, numPages);
        this.journalTitle = journalTitle;
        this.version = version;
        this.volume = volume;
        this.issue = issue;
        this.isScientific = isScientific;
    }



    public String getJournalTitle()
    {
        return journalTitle;
    }
    public double getVersion()
    {
        return version;
    }
    public int getVolume()
    {
        return volume;
    }
    public int getIssue()
    {
        return issue;
    }
    public boolean getIsScientific()
    {
        return isScientific;
    }

    public String toString()
    {
        String output = super.toString();
        output += "Journal Title: " + journalTitle + "\n";
        output += "Version: " + version + "\n";
        output += "Volume #" + volume + ", Issue no. " + issue + "\n";
        if (isScientific)
        {
            output += "Scientific" + "\n";
        }
        else
        {
            output += "Non-Scientific" + "\n";
        }
        return output;
    }
}
