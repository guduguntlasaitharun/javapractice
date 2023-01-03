class Employee{
    int Eid;
    String eName;

    Employee(int Eid,String eName){
        this.Eid=Eid;
        this.eName=eName;

    }
}

class Test{
    public static void main(String[] args){
        Employee e1=new Employee(101,"sai");
     
        System.out.println(e1.Eid);
        System.out.println(e1.eName);
        System.out.println(e1.Eid  + e1.eName);
    }
}