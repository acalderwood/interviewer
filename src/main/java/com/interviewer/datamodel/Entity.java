package com.interviewer.datamodel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alastair on 8/24/2015.
 */
public class Entity {

    private String name;
    private Map<String, Attribute> attributeMap = new HashMap<>();

    public Entity(String name) {
        this.name = name;
    }

    public void setAttribute(Attribute attr) {
        attributeMap.put(attr.getName(), attr);
    }
}
