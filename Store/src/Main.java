public class Main {
    public static void main(String[] args) {
        EmployeeRole e = new EmployeeRole();
        e.addProduct("5","konafa","al-sorady","masr",5,20);
        e.addProduct("6","winston","el sharkia lel do5am","russia",33,55);

        AdminRole a = new AdminRole();
        a.addEmployee("8365","omar","o2","cleopatrea","012");
        a.logout();
//
//        e.purchaseProduct("3030","1", LocalDate.of(2020,05,23));
//        e.logout();
//

    }
}


