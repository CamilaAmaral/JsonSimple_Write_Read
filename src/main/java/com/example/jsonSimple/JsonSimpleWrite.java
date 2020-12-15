package com.example.jsonSimple;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonSimpleWrite {

	public static void main(String[] args) {
		SpringApplication.run(JsonSimpleWrite.class, args);
		
		Locale.setDefault(Locale.US);
		
		JSONObject obj = new JSONObject();
		obj.put("nome", "TV");
		obj.put("preco", 2000.00);
		obj.put("marca","LG");
		
		JSONArray list = new JSONArray();
		list.add("40 polegadas");
		list.add("preta");
		list.add("1 ano de garantia");
		
		obj.put("descricao", list);
		
		try (FileWriter file = new FileWriter("c:\\projects\\test.json")){
			file.write(obj.toJSONString());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(obj);
		
	}
}
