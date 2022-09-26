public class Main{
    public static void main(String[] args) {
        MyInterface object1=new MyClass();
        object1.methodA();

        OneMethodInterface myObject=new ClassA();
        myObject.oneMethod();
        myObject=new ClassB();
        myObject.oneMethod();

        MyAbstractClass object2=new MyConcreteClass();
        object2.increment();
        object2.doSomethingWithNumber();
        //obje1.sayHello();

        TwoMethodAbstractClass myObject1=new ConcreteClassA();
        myObject1.oneMethod();
        myObject1.twoMethod();

        myObject1=new ConcreteClassB();
        myObject1.oneMethod();
        myObject1.twoMethod();


    }
}