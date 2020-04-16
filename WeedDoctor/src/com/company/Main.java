package com.company;

public class Main {
    public static void main(String[] args) {
	    // initiate all deficiencies
        Factory factory = new Factory();
        factory.generateDeficiencies();

        System.out.println(factory.magnesiumDeficiency.getSolution());
    }
}


