package movieDetails;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static List<WorkType> workList =new ArrayList<>();
    public static Set<Actor> actorList = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        WorkType workType=null;
        do {
            System.out.println(
                    "\n*** Main Menu *** \n"+
                    "1. Add Work \n" +
                    "2. Add Actor \n" +
                    "3. Show Movies List \n" +
                    "4. findActor \n" +
                    "5. Check Details \n");
                n= sc.nextInt();
            switch (n){
                case 1:
                    workList.add(addWork());
                    break;
                case  2:
                    actorList.add(addActor());
                    break;
                case 3:
                    System.out.println("//////////////////////////////////////////////////////////////////////\n");
                    System.out.println(workList);
                    System.out.println("//////////////////////////////////////////////////////////////////////\n\n");
                    break;
                case 4:
                    findActorDetails();
                    break;
                case 5:
                    System.out.println("//////////////////////////////////////////////////////////////////////");
                    System.out.println(workList);
                    System.out.println("//////////////////////////////////////////////////////////////////////");
                    System.out.println(actorList);
                break;
            }
        }while (n>=1 && n<=5);

    }


    public static WorkType addWork(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. for Movie :");
        System.out.println("2. for Song");
        int n = sc.nextInt();
        WorkType workType = null;
        switch (n){
            case 1:
                workType =addMovie();
                break;
            case 2:
                 workType= addSong();
                break;
            default:
                System.out.println("Wrong Option");
                break;
        }
        return  workType;
    }



    public static Song addSong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Song Name :");
        String songName = sc.nextLine();
        System.out.println("Enter the Singer Name");
        String singerName = sc.nextLine();
        actorList.add(new Actor(singerName,"Anonymous"));
        System.out.println("Enter the Song Details");
        String songDetails = sc.nextLine();
        Song song = new Song(songName, singerName, songDetails);
        return song;
    }


    public static Movie addMovie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Name :");
        String name = sc.nextLine();
        System.out.println("Enter the Movie Details");
        String details = sc.nextLine();
        System.out.println("Enter the Actor Name");
        String actorName = sc.nextLine();
        actorList.add(new Actor(actorName,"Anonymous"));
        System.out.println("Enter the Movie rating");
        long rating = sc.nextLong();
        System.out.println("Enter the year of Movie Released");
        int year = sc.nextInt();
        Movie movie = new Movie(name,details,actorName,rating,year);
        return movie;
    }

    public static Actor addActor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Actor Name :");
        String name = sc.nextLine();
        System.out.println("Enter the Actor Details");
        String details = sc.nextLine();
        Actor actor = new Actor(name,details);
        return actor;
    }

    public static List<WorkType> findMovieList(String actorName){
        List<WorkType> workTypes = new ArrayList<>();
        workTypes = workList.stream().filter(mname -> mname.getActorName().equalsIgnoreCase(actorName)).collect(Collectors.toList());
        return workTypes;
    }

   public static void findActorDetails(){
       Scanner sc = new Scanner(System.in);
       Map<Actor,List<WorkType>> actorDetails = new HashMap<>();

       System.out.println("Enter Actor Name :");
       String name = sc.nextLine();
        Actor actor= actorList.stream().filter(aname -> aname.getName().equalsIgnoreCase(name)).findAny().orElse(null);
        if(actor!= null){
            actorDetails.put(actor,findMovieList(actor.getName()));
        }
        else {
            System.out.println("No actor Found");
        }
       System.out.println(actorDetails);
    }
}
