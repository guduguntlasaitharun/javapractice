class Employee{
    private int Eid;
    public void seteId(int id){
       this.Eid=id;
    }public int geteId(){
        return Eid;
    }

}
public class Test{
    public static void main(String[] args){
        Employee a1=new Employee();
        
        a1.seteId(101);
        
        System.out.println(a1.geteId());
        
    }
}
