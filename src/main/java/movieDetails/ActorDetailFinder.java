package movieDetails;

import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActorDetailFinder {

    Map<Actor,List<WorkType>> actorDetails = new HashMap<>();

    public Map<Actor, List<WorkType>> getActorDetails() {
        return actorDetails;
    }

    public void setActorDetails(Map<Actor, List<WorkType>> actorDetails) {
        this.actorDetails = actorDetails;
    }
}
