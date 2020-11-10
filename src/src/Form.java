package src;

public class Form {
    int formID;
    String managerName;
    String department;
    //int id, String manager, String dept

    public void setFormID(int id) {
        formID = id;
    }

    public int getFormID() {
        return formID;
    }

    public void setManagerName(String manager) {
        managerName = manager;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setDepartment(String dept) {
        department = dept;
    }

    public String getDepartment() {
        return department;
    }

    public void print(String managerReport) {
        System.out.println(managerReport);
    }
}
