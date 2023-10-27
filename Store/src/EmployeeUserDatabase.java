public class EmployeeUserDatabase extends Database {
    public EmployeeUserDatabase(String filename) {
        super(filename);
    }
    @Override
    public EmployeeUser createRecordFrom(String line)
    {
        String [] taken=line.split(",");
        return new EmployeeUser(taken[0],taken[1],taken[2],taken[3],taken[4]);
    }
}
