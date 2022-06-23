package examples.day8;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to spanish dictionary
        Map<String, String> englSpanDictionary = new HashMap<>();

        // Shopping list
        Map<String, Boolean> shoppingList = new HashMap<>();

        // Adding things to the dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miércoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sábado");
        englSpanDictionary.put("Sunday", "Domingo");

        // Retrieve things from dictionary
        System.out.println("Print the value of Monday: " + englSpanDictionary.get("Monday"));
        System.out.println("Print the value of Tuesday: " + englSpanDictionary.get("Tuesday"));
        System.out.println("Print the value of Wednesday: " + englSpanDictionary.get("Wednesday"));
        System.out.println("Print the value of Thursday: " + englSpanDictionary.get("Thursday"));
        System.out.println("Print the value of Friday: " + englSpanDictionary.get("Friday"));
        System.out.println("Print the value of Saturday: " + englSpanDictionary.get("Saturday"));
        System.out.println("Print the value of Sunday: " + englSpanDictionary.get("Sunday"));

        System.out.println("Print all the keys: " + englSpanDictionary.keySet());
        System.out.println("Print all the values: " + englSpanDictionary.values());
        System.out.println("Print the size of the dictionary: " + englSpanDictionary.size());

        // Adding things to shopping list
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", true);
        shoppingList.put("Oreaos", true);
        shoppingList.put("Eggs", false);
        shoppingList.put("Sugar", false);

        // Retrieve items
        System.out.println("Want Ham? " + shoppingList.get("Ham"));
        System.out.println("Want Oreos? " + shoppingList.get("Oreos"));

        System.out.println("All my list: " + shoppingList.toString());
        System.out.println("IS my list empty? " + shoppingList.isEmpty());

        // Remove things
        System.out.println("No more eggs. " + shoppingList.remove("Eggs"));

        // Replace values for a key
        shoppingList.replace("Bread", false);

        // Clean dictionary
        shoppingList.clear();
        System.out.println("All my list: " + shoppingList.toString());
        System.out.println("IS my list empty? " + shoppingList.isEmpty());

    }
}
