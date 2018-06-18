package edu.dens.selenide.components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class HtmlTable {

    private By root;

    public HtmlTable(By root) {
        this.root = root;
        $(root).should(exist, visible); //Page load pattern -> helps Page Element to only instantiate after element load
    }

    public Map<String, String> getRows(){
        HashMap<String, String> result = new HashMap<>();
        $(root).$$("tr").stream().forEach(element -> {
            String name = element.$("th").text();
            String value = element.$("td").text();
            result.put(name, value);
        });
        return result;
    }
}
