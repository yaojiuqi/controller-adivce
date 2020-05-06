package com.yjq.controlleradvice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalData {
    @ModelAttribute(value = "info")
    public Map<String, Object> mydata(){
        Map<String, Object> map = new HashMap<>();
        map.put("name","yaojiuqi");
        map.put("address", "com.yjq");
        return map;
    }
    @InitBinder("b")
    public void initB(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }
    @InitBinder("a")
    public void initA(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }
}
