
public class AdminRole {
    private Database database = new EmployeeUserDatabase("employees.txt");

    public AdminRole() {
    }

    public void addEmployee(String employeeId, String name, String email, String address, String phoneNumber) {
        this.database.insertRecord(new EmployeeUser(employeeId, name, email, address, phoneNumber));
    }

    public EmployeeUser[] getListOfEmployees() {
        int size = this.database.returnAllRecords().size();
        EmployeeUser[] records = new EmployeeUser[size];

        for(int i = 0; i < size; ++i) {
            records[i] = (EmployeeUser)this.database.returnAllRecords().get(i);
        }

        return records;
    }

    public void removeEmployee(String key) {
        this.database.deleteRecord(key);
    }

    public void logout() {
        this.database.SaveToFile();
    }
}
