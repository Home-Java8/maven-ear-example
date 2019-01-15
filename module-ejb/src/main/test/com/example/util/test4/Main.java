package com.example.util.test4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see https://habr.com/post/253266/
 */

public class Main {

    public static void main(String[] args) {
        Map<Integer, GoodsItem> mapItems = new HashMap<Integer, GoodsItem>();
        mapItems.put(1, new GoodsItem("Samsung", 51200.6f));
        mapItems.put(2, new GoodsItem("Lg", 5400.6f));
        mapItems.put(3, new GoodsItem("Alcatel", 4500.6f));

        String jsonStr = new Gson().toJson(mapItems);
        System.out.println(jsonStr);

        // //////////////////////////////////////

        List<String> listItems = new ArrayList<>();
        listItems.add("one");
        listItems.add("two");
        listItems.add("three");

        jsonStr = new Gson().toJson(listItems);
        System.out.println(jsonStr);

        List<String> listItemsDes = new Gson().fromJson(jsonStr, ArrayList.class);
        System.out.println(listItemsDes.toString());
    }

}
