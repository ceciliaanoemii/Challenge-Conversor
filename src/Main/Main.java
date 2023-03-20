package Main;
import javax.swing.JOptionPane;
import ConversorTemperatura.OpcionesConversor;
import ConvesorMonedas.OpcionesConversion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpcionesConversion conversionMoneda = new OpcionesConversion();
		OpcionesConversor conversionTemperatura = new OpcionesConversor();
		
		boolean bucle = true;
		
		while (bucle) {
			try {
				
				String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion: ", "Menú", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moneda","Conversor de Temperatura"}, "Elegir").toString();
				
				switch (opciones) {
					case "Conversor de Moneda":
						String valor = JOptionPane.showInputDialog(null, "Ingrese el monto a convertir");
						double valorDouble = Double.parseDouble(valor);
						conversionMoneda.ConvertirMonedas(valorDouble);
						
						int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión");
						if (JOptionPane.OK_OPTION == respuesta) {
							System.out.println("Selecciona opción Afirmativa");
						}else {
							JOptionPane.showMessageDialog(null, "Programa Finalizado");
							bucle = false;
						}
						
						break;
						
					case "Conversor de Temperatura":	
						String temperatura = JOptionPane.showInputDialog(null, "Ingrese el monto a convertir");
						double temperaturaDouble = Double.parseDouble(temperatura);
						conversionTemperatura.ConvertirMonedas(temperaturaDouble);
						
						int respuesta2 = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión");
						if (JOptionPane.OK_OPTION == respuesta2) {
							System.out.println("Selecciona opción Afirmativa");
						}else {
							JOptionPane.showMessageDialog(null, "Programa Finalizado");
							bucle = false;
						}
						
						break;
				}	
			
			} catch (NullPointerException e) {
			bucle = false;
			}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Solo admite caracteres numericos y el separador decimal es el punto.");
			}	
		}
		
	}

}
