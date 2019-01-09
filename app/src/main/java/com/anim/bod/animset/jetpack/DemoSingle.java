package com.anim.bod.animset.jetpack;

public class DemoSingle {

    private static class HOLDER {
        private static final DemoSingle DEMO_SINGLE = new DemoSingle();
    }

    private DemoSingle() {

    }

    public static DemoSingle getInstance() {
        return HOLDER.DEMO_SINGLE;
    }

    private Demo demo;

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    //防止浅拷贝操作造成数据被意外的修改
    public Demo getDemo() throws CloneNotSupportedException {
        return demo.clone();
    }

}
