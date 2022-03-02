package javaDesignPattern;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

interface Product{
    public void show();
}
class ConcreteProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品1");
    }
}
class ConcreteProduct2 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品2");
    }
}
class ConcreteProduct3 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品3333");
    }
}
interface AbstractFactory{
    public Product newProduct();
}
//具体工厂1：实现了厂品的生成方法
class ConcreteFactory1 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
//具体工厂2：实现了厂品的生成方法
class ConcreteFactory2 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
//具体工厂3：实现了厂品的生成方法
class ConcreteFactory3 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂3生成-->具体产品333...");
        return new ConcreteProduct3();
    }
}