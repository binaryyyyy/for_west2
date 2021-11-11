import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class MyCatCafe implements CatCafe{
    int counter = 0;
    double money = 10086;
    ArrayList<Cat> cats = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();


    public int getSize (){
        return cats.size();
    }

    @Override
    public void buyCat (String name,int age, boolean gender, double price) throws  InsufficientBalanceException{
        Cat aCat = new Cat(name, age, gender, price) {
            @Override
            public String toString() {
                return "这只猫的名字是"+name+"，年龄是"+age+"，性别为"+gender+"，价格是"+price;
            }
        };
        if(price >=money)
            throw new InsufficientBalanceException();
        else{
            System.out.println("成功购买了一只猫!");
            cats.add(aCat);
        }
    }
    @Override
    public void entertain(Customer customer) throws RuntimeException{
        int size = cats.size();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(new Date());
        if (size == 0)
            throw new RuntimeException();
        else {
            for (int i = 1; i <= customer.sum; i++){
                if(customer.time.compareTo(today) == 0){
                    money += 15;
                    Random r = new Random();
                    int random = r.nextInt(cats.size());
                    System.out.println("被rua到的猫的信息："+cats.get(random));
                    counter++;
                }
            }
        }
    }

    @Override
    public void shut(){
        System.out.println("——————————关门咯——————————");
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(new Date());
        for (int i = 1;i < customers.size(); i ++){
            if (customers.get(i).time.compareTo(today) == 0){
                System.out.println(customers.get(i));
            }
        }
        double income = counter * 15;
        System.out.println("今天赚了"+income+"块钱！");
    }

}


//自定义异常类

class InsufficientBalanceException extends RuntimeException{
}
class CatNotFoundException extends RuntimeException{
}

