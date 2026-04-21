package org.example.solidprinciple.LSP.LSPRules.SignatureRule;

/**
 * Signature rule states that the method signature (name and parameters) in the child class must match the method signature in the parent class.
 * This ensures that the child class can be used interchangeably with the parent class without any issues.
 */

class Parent{
    public void display(String s){
        System.out.println("Parent display method with parameter: " + s);
    }
}

class Child extends Parent{
    @Override
    public void display(String s){
        System.out.println("Child display method with parameter: " + s);
    }
}

class Client {
    private Parent p;

    public Client(Parent p) {
        this.p = p;
    }

    public void printMsg() {
        p.display("Hello");
    }
}


public class MethodArgumentRule {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child  = new Child();

        Client client = new Client(parent);
        Client client2 = new Client(child);//substituting child class object in place of parent class object

        client.printMsg();
        client2.printMsg();
    }


}
