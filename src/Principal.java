import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Principal {

	public static void main(String[] args) {
		/*
		 * Biblioteca Gson
		 * https://sites.google.com/site/gson/Home
		 * https://github.com/google/gson
		 */
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente.add(new Cliente("João", "XXXXXX"));
		listaCliente.add(new Cliente("Maria", "YYYYY"));
		listaCliente.add(new Cliente("Carlos", "FFFFFF"));
		listaCliente.add(new Cliente("Pedro", "MMMMMMM"));
		listaCliente.add(new Cliente("Vania", "WWWWWW"));
		System.out.println("ArrayList: " + listaCliente.toString());
		
		
		//Server side
		//Passando de ArrayList para Json(String)
		Gson gson = new GsonBuilder().create();
	    String arrayListToJson = gson.toJson(listaCliente);
		System.out.println("String Json: " + arrayListToJson.toString());
		
		
		//client side
		//Passando de Json(String) para Array do tipo "Cliente"
		Cliente[] JsomEmArray = gson.fromJson(arrayListToJson, Cliente[].class);
		
		//Passando de Array para ArrayList do tipo "Cliente"
		List<Cliente> minhaArrayListNOVAMENTE = new ArrayList<Cliente>();		
		minhaArrayListNOVAMENTE = Arrays.asList(JsomEmArray);
		
		//Mostrando a nova ArrayList de "Cliente"
		for(Cliente umCliente : minhaArrayListNOVAMENTE){
			System.out.println("Cada cliente: " + umCliente.toString());
		}
	}

}
