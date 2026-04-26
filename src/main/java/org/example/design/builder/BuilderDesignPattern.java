package org.example.design.builder;

class ObjectClass{
    private String name;
    private int age;
    private String address;

    private ObjectClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    static class Builder{
        private String name;
        private int age;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public ObjectClass build(){
            return new ObjectClass(name, age, address);
        }
    }
}
public class BuilderDesignPattern {

    public static void main(String[] args) {
        ObjectClass object = new ObjectClass.Builder()
                .setName("John Doe")
                .setAge(30)
                .setAddress("123 Main St")
                .build();

        System.out.println(object);
    }
}
