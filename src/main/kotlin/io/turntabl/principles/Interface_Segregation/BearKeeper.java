package io.turntabl.principles.Interface_Segregation;

public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();

    /* todo: Taking care of a bear can be a very dangerous
                due to their carnivorous behavior. As such, we would
                like for some responsibilities to be assigned to a more
                courageous person.
     */
}
