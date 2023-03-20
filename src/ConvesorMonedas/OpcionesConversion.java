package ConvesorMonedas;
import javax.swing.JOptionPane;

public class OpcionesConversion {

ConvesorMonedas monedas = new ConvesorMonedas();
	
	public void ConvertirMonedas(double valor) {
		String opciones = JOptionPane.showInputDialog(
				null, "Elije la moneda a la que deseas convertir: ", "Monedas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"Convertir de Peso Argentino a Dolar",
						"Convertir de Peso Argentino a Euro",
						"Convertir de Peso Argentino a Libras Esterlinas",
						"Convertir de Peso Argentino a Yen Japonés",
						"Convertir de Peso Argentino a Won Sur-coreano",
						"Convertir de Dolar a Peso Argentino",
						"Convertir de Euro a Peso Argentino",
						"Convertir de Libras Esterlinas a Peso Argentino",
						"Convertir de Yen Japonés a Peso Argentino",
						"Convertir de Won Sur-coreano a Peso Argentino"}, 
						"Seleccion").toString();
		
		switch (opciones) {
			case "Convertir de Peso Argentino a Dolar":
				monedas.ConvertirPesosArgentinoADolares(valor);
				break;
			
			case "Convertir de Peso Argentino a Euro":
				monedas.ConvertirPesosArgentinoAEuro(valor);
				break;
			
			case "Convertir de Peso Argentino a Libras Esterlinas":
				monedas.ConvertirPesosArgentinoALibrasEsterlinas(valor);
				break;
			
			case "Convertir de Peso Argentino a Yen Japonés":
				monedas.ConvertirPesosArgentinoAYenJapones(valor);
				break;
			
			case "Convertir de Peso Argentino a Won Sur-coreano":
				monedas.ConvertirPesosArgentinoAWonSurCoreano(valor);
				break;
				
			case "Convertir de Dolar a Peso Argentino":
				monedas.ConvertirDolaresAPesosArgentino(valor);
				break;
			
			case "Convertir de Euro a Peso Argentino":
				monedas.ConvertirEuroAPesosArgentino(valor);
				break;
			
			case "Convertir de Libras Esterlinas a Peso Argentino":
				monedas.ConvertirLibrasEsterlinasAPesosArgentino(valor);
				break;
			
			case "Convertir de Yen Japonés a Peso Argentino":
				monedas.ConvertirYenJaponesAPesosArgentinoAYenJapones(valor);
				break;
			
			case "Convertir de Won Sur-coreano a Peso Argentino":
				monedas.ConvertirWonSurCoreanoAPesosArgentino(valor);
				break;
					
			
		}
	
	}
}
