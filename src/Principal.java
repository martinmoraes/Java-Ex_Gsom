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
		listaCliente.add(new Cliente("João", 21, new Endereco("xxxxxx", "1", "XXXXXX")));
		listaCliente.add(new Cliente("Maria", 22, new Endereco("yyyyyy", "1", "YYYYYY")));
		listaCliente.add(new Cliente("Carlos",23, new Endereco("uuuuu", "1", "UUUUUUU")));
		listaCliente.add(new Cliente("Pedro", 24, new Endereco("iiiiii", "1", "IIIIIII")));
		listaCliente.add(new Cliente("Vania", 25, new Endereco("oooooo", "1", "OOOOOOOOO")));
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
