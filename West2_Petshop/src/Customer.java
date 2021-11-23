import java.util.Date;

public class Customer {
    String name;
    int sum;
    String time;
    public Customer(String name, int sum, String time){
        this.name = name;
        this.sum = sum;
        this.time = time;
    }
    @Override
    public String toString(){
        return "顾客名字叫做"+name+"，TA想要rua猫的次数为"+sum+"，TA到店的时间为"+time;
    }
}
