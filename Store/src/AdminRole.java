public class AdminRole {
    private Database database;
    public AdminRole(){
        database = new EmployeeUserDatabase( "employees.txt" );
    }
    public void addEmployee( String employeeId, String name, String email, String address, String phoneNumber){
        database.insertRecord( new EmployeeUser(employeeId,name,email,address,phoneNumber) );
    }
    public EmployeeUser[] getListOfEmployees(){
        int size = database.returnAllRecords().size();
        EmployeeUser[] records = new EmployeeUser[size];
        for(int i=0; i< size; i++)
        {
            records[i] = (EmployeeUser) database.returnAllRecords().get(i);
        }
        return records;

    }
    public void removeEmployee(String key){
        database.deleteRecord(key);
    }
    public void logout(){
        database.SaveToFile();
    }

}
