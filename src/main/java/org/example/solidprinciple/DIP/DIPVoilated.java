package org.example.solidprinciple.DIP;

class MongoDbStorage{
    public void saveData(String data){
        System.out.println("Data saved to MongoDB: " + data);
    }
}

class SQLDBStorage{
    public void saveData(String data){
        System.out.println("Data saved to SQL Database: " + data);
    }
}

class Client{// Client is directly dependent on concrete implementations of MongoDB and SQLDB storage, which violates the Dependency Inversion Principle (DIP). The Client class should depend on abstractions (interfaces) rather than concrete classes.
    private MongoDbStorage mongoDbStorage;
    private SQLDBStorage sqlDbStorage;

    public Client() {
        this.mongoDbStorage = new MongoDbStorage();
        this.sqlDbStorage = new SQLDBStorage();
    }

    public void saveDataToMongo(String data){
        mongoDbStorage.saveData(data);
    }

    public void saveDataToSQL(String data){
        sqlDbStorage.saveData(data);
    }
}

public class DIPVoilated {
    public static void main(String[] args) {
        Client client = new Client();
        client.saveDataToMongo("Hello MongoDB");
        client.saveDataToSQL("Hello SQL Database");
    }
}
