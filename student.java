import java.util.*;


public class student {
    private String name;
    private int age ;
    private String batch;

    public String getname(){
        return name;
    }
    public void setname( String name){
        this.name=name;
    }

    public  int getage(){
        return age;

    }
    public void setage(int age){
        this.age=age;
    }
    public String getbatch(){
        return batch;
    }
    public void setbatch(String batch){
        this.batch=batch;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Batch: "+ batch);
    }
    public static void main(String [] args){

student st= new student();
st.setname("Anu");
st.setage(19);
st.setbatch("2022");
st.display();
    }

}
