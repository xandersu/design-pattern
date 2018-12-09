package com.example.designpattern.behavioral.template;

/**
 * @Author: suxun
 * @Date: 2018/12/9 15:12
 * @Description:
 */
public abstract class ACourse {
    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }
    }

    final void makePPT() {
        System.out.println("ppt");
    }

    final void makeVideo() {
        System.out.println("video");
    }

    void writeArticle() {
        System.out.println("手记");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    abstract void pkgCourse();
}
