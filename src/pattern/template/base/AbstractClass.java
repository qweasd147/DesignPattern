package pattern.template.base;

public abstract class AbstractClass {

    void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }

    abstract void primitiveOperation1();

    void primitiveOperation2(){
        //TODO ...
    }
}
