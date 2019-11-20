package hrmsDemo;

import java.util.Scanner;

public class RoleFactory {

   public static EmpRole getRole(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Role");
        String role = sc.nextLine();

        if(role.equalsIgnoreCase("HR")){
            return new HRBL();
        }
        else if(role.equalsIgnoreCase("Reviewer")){
            return new ReviewerBL();
        }
        else{
            return  new EmpRoleImpl();
        }

    }
}
