package com.example.designpattern.structural.composite;

/**
 * @Author: suxun
 * @Date: 2018/12/3 22:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux", 11);
        CatalogComponent windowsCourse = new Course("windows", 11);
        CatalogComponent javaCourseCatalog = new CourseCatalog("java目录",2);
        CatalogComponent mmallCourse1 = new Course("java电商P1", 55);
        CatalogComponent mmallCourse2 = new Course("java电商P2", 66);
        CatalogComponent ddallCourse2 = new Course("dd", 77);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(ddallCourse2);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("imooc",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
