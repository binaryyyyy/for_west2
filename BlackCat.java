public class BlackCat extends Cat{
    public BlackCat(String name, int age,boolean gender,double price){
        super(name,age,gender,350);
    }
    public String toString(){
        return "这只猫的名字是"+name+"，年龄是"+age+"，性别为"+gender+"，价格是"+price;
    }
}
