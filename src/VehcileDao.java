import org.bson.Document;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class VehcileDao {
	public void getConnection() {
		try {
			MongoClient mongo = new MongoClient("localhost", 27017);
			MongoDatabase database = mongo.getDatabase("car");
			MongoCollection collection = database.getCollection("carCollection");
			System.out.println("Connected to the database successfully");
			Car bmw = new Car("maruti", 4, 2, "petrol", 13);
			Gson gson = new Gson();
			String json = gson.toJson(bmw);
			System.out.println(json);
			Document myDoc = Document.parse(json);
			collection.insertOne(myDoc);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
