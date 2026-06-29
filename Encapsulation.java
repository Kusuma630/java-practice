//Encapsulation
class Employee{
    //by default java use default access modifier

    //1. Getter and Setter
    // Getter & setter are public method inside class
    // that we to access private data members
    //Getter : to get the value of data member
    //Setter : to set the value of data member

    // Syntax:
    //Getter
    // data_type getDataMemberName()
    // {
    //     return this.dataMember;
    // }

    //Setter
    // void setDataMember(data_type dataMember)
    // {
    //     this.dataMember = dataMember;
    // }

    private int id;
    private String name;
    private String dept;
    private int age;

    //Setter
    void setId(int id)
    {
        this.id = id;
    }
    //Getter
    int getId()
    {
        return this.id;
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return this.name;
    }

    void setDept(String dept)
    {
        this.dept = dept;
    }

    String getDept()
    {
        return this.dept;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    int getAge()
    {
        return this.age;
    }

    public Employee()
    {

    }

    //2. Constructor
    public Employee(int id, String name, String dept, int age)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Dept : "+dept);
    }

}

class Encapsulation{
    public static void main(String[] args) {
        //Getter And setter
        Employee emp1 = new Employee();
        emp1.setId(20);
        emp1.setName("Kusuma");
        emp1.setAge(21);
        emp1.setDept("Sales");

        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
        System.out.println(emp1.getDept());
        System.out.println(emp1.getAge());
        // emp1.display();

        Employee emp2 = new Employee(22, "Raj","Marketing",25);
        emp2.display();
    }
}