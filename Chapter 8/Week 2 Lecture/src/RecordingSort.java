import java.util.*;

public class RecordingSort {
    public static void main(String[] args) {
        String title;
        String artist;
        int seconds;
        Scanner sc = new Scanner(System.in);
        Recording[] recordings = new Recording[5];

        for(int x=0;x<5;x++)
        {
            System.out.println("Enter the title of the song");
            title = sc.next();

            System.out.println("Enter the artist name");
            artist = sc.next();

            System.out.println("Enter the seconds in the  song");
            seconds =sc.nextInt();

            Recording r = new Recording(title,artist,seconds);

            recordings[x]=r;
        }

        System.out.println("How would you like to sort the list of songs 1)Title 2)Artist 3)Seconds in Song");
        int answer = sc.nextInt();

        for(int i =0;i<recordings.length-1;i++)
        {
            for(int j =0;j<recordings.length-1;j++)
            {
                int c= j+1;
                if (answer == 1)
                {
                    if(recordings[j].getTitle().compareTo(recordings[c].getTitle())>0) {
                        Recording temporary = recordings[j];
                        recordings[j] = recordings[c];
                        recordings[c] = temporary;
                    }
                }
                else if (answer == 2) {
                    if(recordings[j].getArtist().compareTo(recordings[c].getArtist())>0) {
                        Recording temporary = recordings[j];
                        recordings[j] = recordings[c];
                        recordings[c] = temporary;
                    }

                }
                else if (answer == 3) {
                    if(recordings[j].getSeconds()>recordings[c].getSeconds()) {
                        Recording temporary = recordings[j];
                        recordings[j] = recordings[c];
                        recordings[c] = temporary;
                    }

                }
            }
        }


        System.out.println(Arrays.toString(recordings));


    }
}
