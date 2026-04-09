// Static variable sharing is a concept in object-oriented programming where multiple instances of a class share the same static variable. This means that if one instance changes the value of the static variable, it will affect all other instances that share that variable. Static variables are typically used to store data that is common to all instances of a class, such as a counter or a configuration setting.
// in place initialize the value, it can share all places the same valu 

public class Employee {
    int eid;
    String ename;
    static String company = "ABC Corporation";

    Employee(int eid, String ename, String company) {
        {
            this.eid = eid;
            this.ename = ename;
            this.company = company;
        }
    }

    void Display() {
        System.out.println(eid + " " + ename + " " + company);
    }

    public static void main(String[] args) {

        Employee sr = new Employee(100, "good", "ABC Corporation");
        Employee sr1 = new Employee(101, "bad", "ABC Corporation");
        Employee sr2 = new Employee(102, "best", "ABC Corporation");
        sr.Display();
        sr1.Display();
        sr2.Display();
    }
}