package prep.it.singwai.class6;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONReaderExample {


    public static void main(String[] arg) {
        AppleProduct iPhone7 = new AppleProduct("iPhone 7", 2016, 649.99, "Phone", 32, 4.7);
        AppleProduct iPhone7P = new AppleProduct("iPhone 7 Plus", 2016, 769.99, "Phone", 32, 5.5);
        AppleProduct iMac = new AppleProduct("iMac", 2015, 1099.99, "Desktop", 128, 27);
        AppleProduct macbookPro = new AppleProduct("MacBook Pro", 2014, 1899.99, "Desktop", 128, 13);

        AppleProduct[] allProducts = {iPhone7, iPhone7P, iMac, macbookPro};
        JSONArray allProductJSONArray = new JSONArray();

        for (int i = 0; i < allProducts.length; i++) {
            JSONObject jsonObject = AppleToJsonConverter(allProducts[i]);
            allProductJSONArray.put(jsonObject);
        }

        FileWriter.write("appleProduct", allProductJSONArray.toString(2));
    }

    public static JSONObject AppleToJsonConverter(AppleProduct appleProduct) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", appleProduct.name);
        jsonObject.put("yr", appleProduct.releaseYear);
        jsonObject.put("price", appleProduct.price);
        jsonObject.put("category", appleProduct.category);
        jsonObject.put("storage", appleProduct.storage);
        jsonObject.put("screenSize", appleProduct.screenSize);

        return jsonObject;
    }

    public static void printProduct(AppleProduct appleProduct) {
        System.out.println("Product Name: " + appleProduct.name);
        System.out.println("Product Category: " + appleProduct.category);
        System.out.println("Product Release Yr: " + appleProduct.releaseYear);
        System.out.println("Product Price: " + appleProduct.price);
        System.out.println("Product Storage: " + appleProduct.storage);
        System.out.println("Product Screen size: " + appleProduct.screenSize);
        System.out.println("=======================\n\n");
    }
}
