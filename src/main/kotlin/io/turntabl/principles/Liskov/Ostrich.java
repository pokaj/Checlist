package io.turntabl.principles.Liskov;

public class Ostrich extends Bird{

    @Override
    public String fly() {
        return super.fly();
    }
    /* todo: This is a violation of the LSP Principle.
        An Ostrich is ab bird, but does not have all the qualities of its
        parent (flying).
     */

}
