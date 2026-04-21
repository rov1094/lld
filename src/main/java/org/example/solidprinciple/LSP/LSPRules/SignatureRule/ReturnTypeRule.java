package org.example.solidprinciple.LSP.LSPRules.SignatureRule;

// Return Type Rule : 
// Subtype overridden method return type should be either identical 
// or narrower than the Parent1 method's return type.
// This is also called return type covariance.
// Java supports this out of the box.

class Animal {
    // some common Animal methods
}

class Dog extends Animal {
    // Additional Dog methods specific to Dogs.
}

class Parent1 {
    public Animal getAnimal() {
        System.out.println("Parent1 : Returning Animal instance");
        return new Animal();
    }
}

class Child1 extends Parent1 {
    @Override
    public Dog getAnimal() {// here return type is narrower(child) than the Parent1 method's return type (Animal)
        System.out.println("Child1 : Returning Dog instance");
        return new Dog();
    }
}

class Client1 {
    private Parent1 p;

    public Client1(Parent1 p) {
        this.p = p;
    }

    public void takeAnimal() {
        p.getAnimal();
    }
}

public class ReturnTypeRule {
    public static void main(String[] args) {
        Parent1 Parent1 = new Parent1();
        Child1 Child1   = new Child1();

        Client1 Client1 = new Client1(Child1);
        Client1 Client2 = new Client1(Parent1);
        Client1.takeAnimal();
        Client2.takeAnimal();
    }
}