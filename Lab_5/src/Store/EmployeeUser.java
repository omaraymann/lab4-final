public class EmployeeUser implements Record {
    private String employeeId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public EmployeeUser(String employeeId, String name, String email, String address, String phoneNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String lineRepresentation() {
        return this.employeeId + "," + this.name + "," + this.email + "," + this.address + "," + this.phoneNumber;
    }

    public String getSearchKey() {
        return this.employeeId;
    }

    public String toString() {
        return "EmployeeUser{employeeId='" + this.employeeId + "', name='" + this.name + "', email='" + this.email + "', address='" + this.address + "', phoneNumber='" + this.phoneNumber + "'}";
    }
}
