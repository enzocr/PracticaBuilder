/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import calculadoracomida.InformacionComida.ComidaBuilder;

/**
 *
 * @author maguero
 */
public class CalculadoraComida {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		InformacionComida porcionOllaDeCarne;
		ComidaBuilder builder = new InformacionComida.ComidaBuilder("Olla De Carne", 240, Medida.ML);
		builder = builder.withCalorias(4).withCantidadPorcion(7).withCarbohidratos(8);
		porcionOllaDeCarne = builder.createFood();
		System.out.println(porcionOllaDeCarne.toString());
	}

}
