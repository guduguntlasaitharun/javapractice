class Employee{
    private int eId;
    private String eName;
    public void seteId(int id){
        this.eId=id;
    }
    public int geteId(){
        return eId;
    }public void seteName(String name){
        this.eName=name;
    }
    public String geteName(){
        return eName;
    }

}
public class Test1{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.seteId(101);
        e1.seteName("Sai");
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());

    }
}