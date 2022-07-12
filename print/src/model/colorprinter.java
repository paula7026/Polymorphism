package model;

public class colorprinter extends printer {
//    override 覆盖 重写：在子类中如果创建了一个与父类中相同名称、相同返回值类型、相同参数列表的方法，只是方法体中的实现不同，以实现不同于父类的功能，
                    //    这种方式被称为方法重写（override），又称为方法覆盖。
                    //    当父类中的方法无法满足子类需求或子类具有特有功能的时候，需要方法重写。
                    //    方法的外观（名称，参数，返回值）保持不变
//    overload 重载：  同一个类中包含了两个或两个以上方法名相同的方法，但形参列表不同
                    //    实现两个或多个具有相同名称但采用不同参数数的方法
                    //实现两个或多个具有相同名称但采用不同类型的参数的方法
//    http://c.biancheng.net/view/1000.html
    @Override
    public void print(){
        System.out.println("color");
    }

}
