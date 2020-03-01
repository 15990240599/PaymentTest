package com.gupao.clone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;
@Data
public class CloneExample {
    private int id;
    private String name;
    private List<String> list;


    public CloneExample deepClone() {
        JSON json = (JSON) JSONObject.toJSON(this);
        CloneExample cloneExample = JSONObject.toJavaObject(json,CloneExample.class);
        return cloneExample;
    }
}
