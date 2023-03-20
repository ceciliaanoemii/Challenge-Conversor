package ConversorTemperatura;
import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void ConvertirCelsiusAKelvin(double valor) {
		double temperaturaCelsius = valor + 273.15;
		temperaturaCelsius = (double) Math.round(temperaturaCelsius * 100d)/100;
		JOptionPane.showMessageDialog(null, valor+" Celsius equivalen a "+temperaturaCelsius+" Kelvin");
	}
	
	public void ConvertirCelsiusAFahrenheit(double valor) {
		double temperaturaCelsius = (valor*9/5) + 32;
		temperaturaCelsius = (double) Math.round(temperaturaCelsius * 100d)/100;
		JOptionPane.showMessageDialog(null, valor+" Celsius equivalen a "+temperaturaCelsius+" Fahrenheit");
	}
	
	public void ConvertirKelvinACelsius(double valor) {
		double temperaturaKelvin = valor - 273.15;
		temperaturaKelvin = (double) Math.round(temperaturaKelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, valor+" Kelvin equivalen a "+temperaturaKelvin+" Celsius");
	}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double temperaturaKelvin = (valor - 273.15) * 9/5 + 32;
		temperaturaKelvin = (double) Math.round(temperaturaKelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, valor+" Kelvin equivalen a "+temperaturaKelvin+" Fahrenheit");
	}
	
	public void ConvertirFahrenheitACelsius(double valor) {
		double temperaturaFahrenheit = (valor - 32) * 5/9;
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, valor+" Fahrenheit equivalen a "+temperaturaFahrenheit+" Celsius");
	}
	
	public void ConvertirFahrenheitAKelvin(double valor) {
		double temperaturaFahrenheit = (valor - 32) * 5/9 + 273.15;
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, valor+" Fahrenheit equivalen a "+temperaturaFahrenheit+" Kelvin");
	}

}
