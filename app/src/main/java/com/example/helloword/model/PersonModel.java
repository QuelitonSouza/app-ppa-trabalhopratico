package com.example.helloword.model;

public class PersonModel {
    private final String [] personsGroup = {"Queliton Souza Pires", "Everton", "Rogério", "Dimer", "Augusto", "Douglas"};
    public String personPrincipal = "Queliton Souza Pires";
    public String personRandom() { return personsGroup[randomIndex()];}
    private int randomIndex() { return (int)(Math.random() * personsGroup.length);}
}
