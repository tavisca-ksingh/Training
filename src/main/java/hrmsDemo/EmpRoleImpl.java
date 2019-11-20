package hrmsDemo;

public class EmpRoleImpl implements EmpRole {

    @Override
    public void viewProfile() {
        System.out.println("Profile \n");
    }

    @Override
    public void updateProfile() {
        System.out.println("update Profile \n");
    }

    @Override
    public void viewOtherEmployeeProfile() {
        System.out.println("update Profile");
    }


}
