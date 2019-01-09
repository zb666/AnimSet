package com.anim.bod.animset.jetpack;

public class Demo extends KotlinBean implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Demo clone() throws CloneNotSupportedException {
        Demo demo = null;
        try {
            demo = (Demo) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        } finally {
            return demo;
        }

    }
}
