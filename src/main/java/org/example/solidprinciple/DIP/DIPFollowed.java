package org.example.solidprinciple.DIP;

interface PersistanceStorage{
    void saveData(String data);
}

class MongoDbRepository implements PersistanceStorage{
    @Override
    public void saveData(String data) {
        System.out.println("Data saved to MongoDB: " + data);
    }
}

class SQLDBRepository implements PersistanceStorage{
    @Override
    public void saveData(String data) {
        System.out.println("Data saved to SQL Database: " + data);
    }
}

class CassandraDBRepository implements PersistanceStorage{
    @Override
    public void saveData(String data) {
        System.out.println("Data saved to Cassandra Database: " + data);
    }
}

class Application{
    private PersistanceStorage storage;

    public Application(PersistanceStorage storage) {
        this.storage = storage;
    }

    public void saveData(String data){
        storage.saveData(data);
    }
}

public class DIPFollowed {

    public static void main(String[] args) {
        PersistanceStorage mongoStorage = new MongoDbRepository();
        Application appWithMongo = new Application(mongoStorage);
        appWithMongo.saveData("Hello MongoDB");

        PersistanceStorage sqlStorage = new SQLDBRepository();
        Application appWithSQL = new Application(sqlStorage);
        appWithSQL.saveData("Hello SQL Database");

        //Nothing changes if we add other DB like cassandra, we just need to implement the PersistanceStorage interface and we can use it without changing the existing code, this is the beauty of Dependency Inversion Principle (DIP)
        PersistanceStorage cassandraStorage = new CassandraDBRepository();
        Application appWithCassandra = new Application(cassandraStorage);
        appWithCassandra.saveData("Hello Cassandra Database");
    }
}
