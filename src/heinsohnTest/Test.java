package heinsohnTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ejercicio1(Arrays.asList(1, 0, 1, 0, 0, 0, 1, 1), 2);
		System.out.println();

		mayorDeTres(1, 2, 1);
		System.out.println();

		parImpar(Arrays.asList(15, 7, 2, 1, 5, 9, 8, 7, 24, 50));
		System.out.println();

		Integer vector[] = { 15, 7, 2, 1, 5, 9, 8, 7, 24, 50 };
		parImpar(vector);
		System.out.println();

		isSOH();
		System.out.println();
		
		/*
		excepcionesNoChequeadas();
		excepcionesChequeadas();
		*/
		
		encontrarRojo(List.of(new Referencia(5, "verde"), new Referencia(8, "rojo"), new Referencia(3, "amarillo"), new Referencia(1, "blanco")));
	}

	public static List<Integer> ejercicio1(List<Integer> lista, Integer permutaciones) {
		List<Integer> resultado = null;
		for (int i = 0; i < permutaciones; i++) {
			resultado = new ArrayList<>();
			Integer before = 0, after = 0;
			for (int j = 0; j < lista.size(); j++) {
				before = j > 0 ? lista.get(j - 1) : 0;
				after = j < lista.size() - 1 ? lista.get(j + 1) : 0;
				resultado.add(before == after ? 0 : 1);
			}
			lista = resultado;
		}
		return lista;
	}

	public static void mayorDeTres(Integer first, Integer second, Integer third) {
		System.out.println(Collections.max(List.of(first, second, third)));
	}

	public static void parImpar(List<Integer> vector) {
		vector.stream().filter(e -> e % 2 == 0).sorted().forEach(System.out::println);
		vector.stream().filter(e -> e % 2 != 0).sorted().forEach(System.out::println);
	}

	public static void parImpar(Integer vector[]) {
		List.of(vector).stream().filter(e -> e % 2 == 0).sorted().forEach(System.out::println);
		List.of(vector).stream().filter(e -> e % 2 != 0).sorted().forEach(System.out::println);
	}

	public static Boolean isSOH() {
		String nombreEmpresa = "Heinsohn";
		String extraido = nombreEmpresa.substring(4, 7);
		return extraido.equals("soh") ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public static void excepcionesNoChequeadas() {
		Integer enteros [] = {1,2,3};
		System.out.println(enteros[3]);
	}
	
	public static void excepcionesChequeadas() throws FileNotFoundException {
		File archivo = new File("archivo.txt");
		Scanner lector = new Scanner(archivo);
	}
	
	public static void encontrarRojo(Collection<Referencia> coleccion) {
		System.out.println(coleccion.stream().filter(e -> e.getColor().equals("rojo")).findAny().get().getColor());
	}
}







