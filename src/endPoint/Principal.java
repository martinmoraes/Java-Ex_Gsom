package endPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entity.Cliente;
import entity.Endereco;

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
//		System.out.println("ArrayList: " + listaCliente.toString());
		
		
		 String arrayJSON = "[{\"Nome\":\"João\",\"idade\":21,\"Endereco\":{\"rua\":\"xxxxxx\",\"numero\":\"1\",\"cidade\":\"XXXXXX\"}},{\"Nome\":\"Maria\",\"idade\":22,\"Endereco\":{\"rua\":\"yyyyyy\",\"numero\":\"1\",\"cidade\":\"YYYYYY\"}},{\"Nome\":\"Carlos\",\"idade\":23,\"Endereco\":{\"rua\":\"uuuuu\",\"numero\":\"1\",\"cidade\":\"UUUUUUU\"}},{\"Nome\":\"Pedro\",\"idade\":24,\"Endereco\":{\"rua\":\"iiiiii\",\"numero\":\"1\",\"cidade\":\"IIIIIII\"}},{\"Nome\":\"Vania\",\"idade\":25,\"Endereco\":{\"rua\":\"oooooo\",\"numero\":\"1\",\"cidade\":\"OOOOOOOOO\"}}]";
		
		Principal principal = new Principal();
		Gson gson = new GsonBuilder().create();

		principal.formListToJSON(gson, listaCliente);
				
		principal.fromArrayJsonToArray(gson, arrayJSON);
		
		principal.fromArrayToList(gson, arrayJSON, principal);
	
	}


	private void fromArrayToList(Gson gson,  String stringJSON, Principal principal) {
		Cliente[] arrayClientes = principal.fromArrayJsonToArray(gson, stringJSON);
		
		List<Cliente> listCliente = Arrays.asList(arrayClientes);
		
		listCliente.forEach( cliente -> {
			System.out.println("Cada cliente: " + cliente);
		});
		
	}

	private Cliente[] fromArrayJsonToArray(Gson gson,  String stringJSON) {
		Cliente[] arrayObjCliente = gson.fromJson(stringJSON, Cliente[].class);
		
		return arrayObjCliente;
	}

	private String formListToJSON(Gson gson, ArrayList<Cliente> listaCliente) {
		String stringJson = gson.toJson(listaCliente);
		System.out.println("String Json: " + stringJson.toString());
		return stringJson;

	}

}
