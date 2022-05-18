package lab.darf.javaui.components;

import java.awt.Component;
import java.util.ArrayList;

import java.awt.Color;

public class UIScene {

    private ArrayList<Component> components = new ArrayList<>();
    private Color color;

    public UIScene() {
        super();
    }

    public void onLoad(){}
    public void onUnload(){}

    public UIScene components(UIElement ...component) {
        for(UIElement c : component) {
            components.add((Component) c);
        }
        return this;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public UIScene color(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }
}
