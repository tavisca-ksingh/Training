package movieDetails;

public class Movie implements WorkType {

    private String name;
    private String details;
    private  String actorName;
    private long rating;
    private long yearReleased;

    public Movie(String name, String details, String actorName, long rating, long yearReleased) {
        this.name = name;
        this.details = details;
        this.actorName = actorName;
        this.rating = rating;
        this.yearReleased = yearReleased;
    }

    public Movie() {
    }


    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(long yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", actorName='" + actorName + '\'' +
                ", rating=" + rating +
                ", yearReleased=" + yearReleased +
                "}\n";
    }
}
