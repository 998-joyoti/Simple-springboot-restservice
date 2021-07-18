package com.example.firstapplication.SpringBootRestService.controller;

import org.springframework.stereotype.Component;

@Component
public class AddResponse {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;


}
