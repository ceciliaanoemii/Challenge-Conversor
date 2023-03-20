package ConversorTemperatura;
import javax.swing.JOptionPane;

public class OpcionesConversor {

ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void ConvertirMonedas(double valor) {
		String opciones = JOptionPane.showInputDialog(
				null, "Elije la unidad a la que deseas convertir: ", "Temperatura", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"Convertir de Celsius a Kelvin",
						"Convertir de Celsius a Fahrenheit",
						"Convertir de Kelvin a Celsius",
						"Convertir de Kelvin a Fahrenheit",
						"Convertir de Fahrenheit a Celsius",
						"Convertir de Fahrenheit a Kelvin"}, 
						"Seleccion").toString();
		
		switch (opciones) {
			case "Convertir de Celsius a Kelvin":
				temperatura.ConvertirCelsiusAKelvin(valor);
				break;
				
			case "Convertir de Celsius a Fahrenheit":
				temperatura.ConvertirCelsiusAFahrenheit(valor);
				break;
				
			case "Convertir de Kelvin a Celsius":
				temperatura.ConvertirKelvinACelsius(valor);
				break;
				
			case "Convertir de Kelvin a Fahrenheit":
				temperatura.ConvertirKelvinAFahrenheit(valor);
				break;
				
			case "Convertir de Fahrenheit a Celsius":
				temperatura.ConvertirFahrenheitACelsius(valor);
				break;
				
			case "Convertir de Fahrenheit a Kelvin":
				temperatura.ConvertirFahrenheitAKelvin(valor);
				break;	
		}
	}	
}
