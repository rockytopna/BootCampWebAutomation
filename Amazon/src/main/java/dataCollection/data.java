package dataCollection;

import java.util.ArrayList;
import java.util.List;

public class data {

    public static List<String> insertDataIntoList(){
        List<String> list = getItemValue();

        return list;
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("babyfood");
        itemsList.add("amazonkindle");
        itemsList.add("firestick");
        itemsList.add("shoes");
        itemsList.add("phone accessories");
        itemsList.add("wireless mouse");
        return itemsList;
    }

}
