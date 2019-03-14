package org.goodrain.restdemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RbdServiceList {
    @JsonProperty("list")
    private ArrayList<RbdService> list = new ArrayList<>();

    public ArrayList<RbdService> getList() {
        return list;
    }

    public void setList(ArrayList<RbdService> list) {
        this.list = list;
    }
}
