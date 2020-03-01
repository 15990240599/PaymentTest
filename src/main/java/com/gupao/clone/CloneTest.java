package com.gupao.clone;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CloneTest {

    @Test
    public void test(){
        CloneExample cloneExample = new CloneExample();
        cloneExample.setId(1);
        cloneExample.setName("1");
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        cloneExample.setList(list);

        CloneExample clone = cloneExample.deepClone();
        clone.getList().add("333");

        System.out.println("原型對象" + cloneExample);
        System.out.println("原型對象" + clone);
        System.out.println(cloneExample == clone);

        System.out.println("原型對象" + cloneExample.getList());
        System.out.println("原型對象" + clone.getList());
        System.out.println(cloneExample.getList() == clone.getList());
    }
}
