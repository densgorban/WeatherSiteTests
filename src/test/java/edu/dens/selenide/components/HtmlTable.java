package edu.dens.selenide.components;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HtmlTable {

    private By root;

    public HtmlTable(By root) {
        this.root = root;
        $(root).should(Condition.exist);
    }


}
