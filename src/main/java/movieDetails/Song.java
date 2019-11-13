package movieDetails;

public class Song implements WorkType {
    private  String songName;
    private String actorName;
    private String songDetails;

    public Song(){
    }

    public Song(String songName, String singerName, String songDetails) {
        this.songName = songName;
        actorName = singerName;
        this.songDetails = songDetails;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setSongDetails(String songDetails) {
        this.songDetails = songDetails;
    }

    @Override
    public String getName() {
        return songName;
    }

    @Override
    public String getDetails() {
        return songDetails;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", SingerName='" + actorName + '\'' +
                ", songDetails='" + songDetails + '\'' +
                "}\n";
    }
}
