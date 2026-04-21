package com.batalla;

import com.batalla.batalla.Batalla;
import com.batalla.criaturas.*;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Smaug", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 15);

        Batalla.simularBatalla(dragon, mago);
    }
}
