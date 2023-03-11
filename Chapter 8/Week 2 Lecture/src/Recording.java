public class Recording {

    private String title;
    private String artist;
    private int seconds;


    public Recording(String title, String artist, int seconds) {
        this.title = title;
        this.artist = artist;
        this.seconds = seconds;
    }

    public Recording()
    {
        this.title = "";
        this.artist="";
        this.seconds = 0;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public int getSeconds()
    {
        return this.seconds;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }

    public String toString()
    {
        return "Title: "+ this.title + " Artist: "+ this.artist + " Seconds:"+ this.seconds;
    }


}
