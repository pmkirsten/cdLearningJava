package com.campusdual.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileCreator {

    private static void createFile() {
        JsonArray componentsArray = new JsonArray();
        componentsArray.add(createItem("Graphic card", 2));
        componentsArray.add(createItem("CPU", 1));
        componentsArray.add(createItem("Fan", 3));
        componentsArray.add(createItem("Motherboard", 1));
        componentsArray.add(createItem("RAM", 2));
        componentsArray.add(createItem("SSD", 2));
        componentsArray.add(createItem("Power supply", 1));
        componentsArray.add(createItem("Computer case", 1));
        JsonObject computer = new JsonObject();
        computer.add("components", componentsArray);

        try(FileWriter fw = new FileWriter("src/main/resources/computerList.json")){
            // Without format
            // fw.write(computer.toString());
            // ===============
            // with format
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(computer);
            fw.write(json);
            // ===============
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static JsonObject createItem(String item, int quantity) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("name", item);
        jsonObj.addProperty("quantity", quantity);
        return jsonObj;
    }

    static void main() {
        createFile();
    }
}
