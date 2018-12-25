package edu.doumi.jssp.test.entity;

import lombok.Data;

@Data
public class ResultMessage {
    private int code;
    private String message;
    public ResultMessage(){}
    public ResultMessage(String message){
        code = 200;
        this.message = message;
    }
}
