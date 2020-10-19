package com.AnandaRezakurniawan.Polimorfisme;

public class DemoOvverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Mati Listrik");
        subClass.getValue("Mati Lampu");
    }
}
