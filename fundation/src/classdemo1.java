
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class classdemo1 {
    public int number;
    public String name;
    public String school;

    public static void main(String[] args) {
        classdemo1 c1 = new classdemo1(); // classdemo1是一个类，new c1 是一个实例。
        c1.number = 1;
        c1.name = "111";
        c1.school = "no.1";
        System.out.println(c1.school);
        City xm = new City();

        double la = 123.123;
        String [] belongs = new String[]{"fujian","China"};
        xm.setName("xiamen");
        xm.setBelong(belongs);
        xm.setLatitude(la);
        xm.setLongitude(19.123);
        System.out.println(xm.getName());
        System.out.println(xm.getBelongs()[1]);
        belongs[1]="CHINA";
        System.out.println(xm.getBelongs()[1]);
        System.out.println("location: " + xm.getLatitude() + ", " + xm.getLongitude());
//        la = 201.11;
//        System.out.println(xm.getLatitude());
        //枚举 javabean的属性
        BeanInfo info = null;
        try {
            info = Introspector.getBeanInfo(City.class);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        assert info != null;
        for (PropertyDescriptor pd : info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(" "+pd.getReadMethod());
            System.out.println(" "+pd.getWriteMethod());
        }
    }
}

class City {
    private String name;
    private String [] belongs;
    private double latitude;
    private double longitude;

    //方法封装
    public String getName() {
        return name;
    }
    //类型...为可变参数
    public void setBelong(String ...belongs){
        this.belongs = belongs;
    }

    public String[] getBelongs() {
        return belongs;
    }


    public void setName(String name) {
        if (name == null||name.isEmpty()){
            throw new IllegalArgumentException("Invalid Name!!");
        }
        this.name = name.trim();
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}