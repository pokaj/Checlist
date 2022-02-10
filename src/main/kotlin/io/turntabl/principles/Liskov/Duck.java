package io.turntabl.principles.Liskov;

public class Duck extends Bird{

    @Override
    public String fly() {
        return super.fly();
    }
}