 public class EmployeeUser implements Record{
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
         return employeeId;
     }
     public void setEmployeeId(String employeeId) {

         this.employeeId = employeeId;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getEmail() {
         return email;
     }
     public void setEmail(String email) {
         this.email = email;
     }
     public String getAddress() {
         return address;
     }
     public void setAddress(String address) {
         this.address = address;
     }
     public String getPhoneNumber() {
         return phoneNumber;
     }
     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }
     @Override
     public String lineRepresentation() {
         return employeeId + "," + name + "," + email + "," + address + "," + phoneNumber;
     }
     @Override
     public String getSearchKey() {
         return employeeId;
     }

     @Override
     public String toString() {
         return "EmployeeUser{" +
                 "employeeId='" + employeeId + '\'' +
                 ", name='" + name + '\'' +
                 ", email='" + email + '\'' +
                 ", address='" + address + '\'' +
                 ", phoneNumber='" + phoneNumber + '\'' +
                 '}';
     }
 }
