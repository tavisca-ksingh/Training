package movieDetails;

import java.util.ArrayList;
import java.util.List;

public class WorkFinder {
    List<WorkType> workTypes =  new ArrayList<>();

    public void addWork(WorkType work){
        workTypes.add(work);
    }


    public List<WorkType> getWorkTypes() {
        return workTypes;
    }

}
