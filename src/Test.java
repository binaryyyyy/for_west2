import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Cat orangeCat = new OrangeCat("orange", 3, false, 200, true);
        Cat blackCat = new BlackCat("black", 3, true, 350);
        Cat ragdoll = new RagdollCat("ragdoll", 3, true, 300, true);
        MyCatCafe a = new MyCatCafe();
        a.cats.add(orangeCat);
        a.cats.add(blackCat);
        a.cats.add(ragdoll);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Customer customer_today = new Customer("customer_today", 3,df.format(new Date()));
        Customer customer_past = new Customer("customer_past",10086,df.format(new Date( - 2 * 24 * 60 * 60 * 1000)));
        a.customers.add(customer_past);
        a.customers.add(customer_today);

        //买猫
        try {
            System.out.println("——————————开始买猫(゜ω゜)！！——————————");
            a.buyCat("new_cat", 4, false, 9999999);
        }
        catch (InsufficientBalanceException e){
            e.printStackTrace();
            System.out.println("哥......咱家没钱了");
        }


        System.out.println("——————————接客！——————————");
        for (int i = 1;i < a.customers.size(); i ++){
            a.entertain(a.customers.get(i));
        }

        //歇业
        a.shut();
    }



}
