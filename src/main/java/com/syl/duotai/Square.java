package com.syl.duotai;

public class Square extends  Shape {
    @Override
    public void draw () {
        System.out.println("我是子类,我知道画什么,我画的是矩形(Square)");
    }
}
