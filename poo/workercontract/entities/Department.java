package poo.workercontract.entities;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String departmentName) {
        this.name = departmentName;
    }
}
