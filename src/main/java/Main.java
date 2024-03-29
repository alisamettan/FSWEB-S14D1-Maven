import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());


        System.out.println("--------------------------------------");


        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("--------------------------------------");

        JuniorDeveloper ahmet=new JuniorDeveloper(1,"Ahmet",0);
        JuniorDeveloper ayse=new JuniorDeveloper(2,"Ayşe",0);

        System.out.println("Çalışmaya başlamadan önce: " + ahmet.toString());
        System.out.println("Çalışmaya başlamadan önce: "+ayse.toString());

        ahmet.work();
        ayse.work();

        System.out.println("Çalışmaya başladıktan sonra: "+ahmet.toString());
        System.out.println("Çalışmaya başladıktan sonra: "+ayse.toString());

        MidDeveloper mehmet=new MidDeveloper(1,"Mehmet",0);
        System.out.println("Çalışmaya başlamadan önce: "+mehmet.toString());
        mehmet.work();
        System.out.println("Çalışmaya başladıktan sonra: "+mehmet.toString());

        SeniorDeveloper seniorDeveloper=new SeniorDeveloper(1,"veli",0);

        System.out.println("Çalışmaya başlamadan önce: "+seniorDeveloper.toString());
        seniorDeveloper.work();
        System.out.println("Çalışmaya başladıktan sonra: "+seniorDeveloper.toString());

        System.out.println("--------------------------------------");

        HRManager hrManager=new HRManager(1,"Kerem",0,new JuniorDeveloper[5],new MidDeveloper[2],new SeniorDeveloper[1]);
        System.out.println("Çalışmaya başlamadan önce: "+hrManager.toString());

        hrManager.work();
        System.out.println("Çalışmaya başladıktan sonra: "+hrManager.toString());
        hrManager.addEmployee(0,ahmet);
        hrManager.addEmployee(1,ayse);
        hrManager.addEmployee(0,mehmet);
        hrManager.addEmployee(0,seniorDeveloper);




    }
}