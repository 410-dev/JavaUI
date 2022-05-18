package lab.darf.javaui.components;

import java.awt.Font;

public interface UINonContainerElement extends UIElement {

    public UINonContainerElement text(String text);
    public UINonContainerElement font(Font font);
    public UINonContainerElement fontSize(int size);
    public UINonContainerElement bold(boolean bold);
    public UINonContainerElement italic(boolean italic);

    public Font getFont();
    public String getText();
    
}
