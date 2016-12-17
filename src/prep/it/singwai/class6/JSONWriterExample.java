package prep.it.singwai.class6;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONWriterExample {


    public static void main(String[] arg) {
        String fileContent = FileWriter.read("appleProduct");
        JSONArray jsonArray = new JSONArray(fileContent);

        AppleProduct[] allAppleProducts = new AppleProduct[jsonArray.length()];

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.optJSONObject(i);
            if (jsonObject != null) {
                String name = jsonObject.optString("name");
                double price = jsonObject.optDouble("price");
                double screenSize = jsonObject.optDouble("screenSize");
                int year = jsonObject.optInt("yr");
                int storage = jsonObject.optInt("storage");
                String category = jsonObject.optString("category");


                allAppleProducts[i] = new AppleProduct(name, year, price, category, storage, screenSize);
            }
        }

        for (int i = 0; i < allAppleProducts.length; i++) {
            JSONReaderExample.printProduct(allAppleProducts[i]);
        }


    }


}
