public class Employee {
    private int EmpNo;
    private String EmpName;
    private int Salary;

    public Employee(int empNo, String empName, int salary) {
        EmpNo = empNo;
        EmpName = empName;
        Salary = salary;
    }

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int empNo) {
        EmpNo = empNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String toString(){
        return EmpNo + " " + EmpName + " " + Salary;
    }
}
