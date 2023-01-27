import java.util.*;
public class CRUD extends Employee{
    public CRUD(int empNo, String empName, int salary) {
        super(empNo, empName, salary);
    }

    public static void main(String[] args) {

        List<Employee> C = new ArrayList<Employee>();
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        int Choice;
        int eno;
        String eName;
        int eSalary;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("0.Finish");
            System.out.print("Enter num of your choice:");
            Choice = input.nextInt();

            switch (Choice){
                case 1:
                    System.out.print("EmpNo: ");
                    eno = input.nextInt();
                    System.out.print("EmpName: ");
                    eName = inputS.nextLine();
                    System.out.print("Salary: ");
                    eSalary = input.nextInt();

                    C.add(new CRUD(eno, eName, eSalary));
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    Iterator<Employee> i = C.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter EmpNo: ");
                    eno = input.nextInt();
                    System.out.println("-------------------------------");
                    i = C.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmpNo() == eno){
                            System.out.println("Employee found!");
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Recond not found with EmpNo: " + eno);
                    }
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    found = false;
                    System.out.print("Enter EmpNo: ");
                    eno = input.nextInt();
                    System.out.println("-------------------------------");
                    i = C.iterator();
                    while (i.hasNext()){
                        Employee e = i.next();
                        if(e.getEmpNo() == eno){
                            System.out.println("Employee found!");
                            System.out.println(e);
                            i.remove();
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Recond not found with EmpNo: " + eno);
                    }else
                        System.out.println("Record Deleted Successfully!");
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    found = false;
                    System.out.print("Enter EmpNo: ");
                    eno = input.nextInt();
                    System.out.println("-------------------------------");
                    ListIterator<Employee>li = C.listIterator();
                    while (li.hasNext()){
                        Employee e = li.next();
                        if(e.getEmpNo() == eno){
                            System.out.println("Employee found!");
                            System.out.println(e);
                            System.out.print("Enter EmpName: ");
                            eName = inputS.nextLine();
                            System.out.print("Enter Salary: ");
                            eSalary = input.nextInt();
                            li.set(new Employee(eno,eName,eSalary));
                            found = true;
                        }
                    }
                    if(!found) {
                        System.out.println("Recond not found with EmpNo: " + eno);
                    }else
                        System.out.println("Record updated Successfully!");
                    System.out.println("-------------------------------");
                    break;

            }
        }while (Choice != 0);
    }
}
