package com.example.jsonSimple;

import org.json.XML;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

public class JsonSimpleRead {

	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try (Reader reader = new FileReader("c:\\projects\\test.json")) {

			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			System.out.println(jsonObject);

			String nome = (String) jsonObject.get("nome");
			System.out.println(nome);

			double preco = (double) jsonObject.get("preco");
			System.out.println(preco);

			String marca = (String) jsonObject.get("marca");
			System.out.println(marca);

			// loop array
			JSONArray descricao = (JSONArray) jsonObject.get("descricao");
			Iterator<String> iterator = descricao.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
