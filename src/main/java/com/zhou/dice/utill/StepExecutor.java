package com.zhou.dice.utill;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;

@Component
public class StepExecutor implements Callable<JSONObject> {
    @Value("classpath:static/ca.json")
    private Resource areaRes;


    public JSONObject startStreamTask(){
        System.out.println("==========================");
        try {
            System.out.println("read");
            File file = areaRes.getFile();
            String jsonData = this.jsonRead(file);
            JSONObject jsonObject = JSONObject.parseObject(jsonData);

            return jsonObject;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private String jsonRead(File file){
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }
        } catch (Exception e) {

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return buffer.toString();
    }

    @Override
    public JSONObject call() throws Exception {

        return startStreamTask();
    }
}