package com.alibaba.testable.demo;

import com.alibaba.testable.demo.model.BlackBox;
import com.alibaba.testable.demo.model.Box;
import com.alibaba.testable.demo.model.Color;

/**
 * @author flin
 */
public class DemoInherit {

    /**
     * call method overridden by sub class via parent class variable
     */
    public Box putIntoBox() {
        Box box = new BlackBox("");
        box.put("data");
        return box;
    }

    /**
     * call method overridden by sub class via sub class variable
     */
    public BlackBox putIntoBlackBox() {
        BlackBox box = new BlackBox("");
        box.put("data");
        return box;
    }

    /**
     * call method defined in parent class via parent class variable
     */
    public String getFromBox() {
        Box box = new BlackBox("data");
        return box.get();
    }

    /**
     * call method defined in parent class via sub class variable
     */
    public String getFromBlackBox() {
        BlackBox box = new BlackBox("data");
        return box.get();
    }

    /**
     * call method defined in interface via interface variable
     */
    public String getColorViaColor() {
        Color color = new BlackBox("");
        return color.getColor();
    }

    /**
     * call method defined in interface via sub class variable
     */
    public String getColorViaBox() {
        BlackBox box = new BlackBox("");
        return box.getColor();
    }
}
