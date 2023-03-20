package ConvesorMonedas;
import javax.swing.JOptionPane;

public class ConvesorMonedas {

	//CONVERSIONES DE PESO ARGENTINO A OTRAS MONEDAS
	
		public void ConvertirPesosArgentinoADolares(double valor) {
			double monedaDolar = valor * 0.0492;
			monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Pesos Argentinos equivalen a $ "+monedaDolar+" Dolares");
		}
		
		public void ConvertirPesosArgentinoAEuro(double valor) {
			double monedaEuro = valor * 0.0070;
			monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Pesos Argentinos equivalen a $ "+monedaEuro+" Euros");
		}
		
		public void ConvertirPesosArgentinoALibrasEsterlinas(double valor) {
			double monedaLibra = valor * 0.0061;
			monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Pesos Argentinos equivalen a $ "+monedaLibra+" Libras Esterlinas");
		}
		
		public void ConvertirPesosArgentinoAYenJapones(double valor) {
			double monedaYen = valor * 0.98;
			monedaYen = (double) Math.round(monedaYen * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Pesos Argentinos equivalen a $ "+monedaYen+" Yenes Japoneses");
		}
		
		public void ConvertirPesosArgentinoAWonSurCoreano(double valor) {
			double monedaWon = valor * 9.69;
			monedaWon = (double) Math.round(monedaWon * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Pesos Argentinos equivalen a $ "+monedaWon+" Won Sur-Coreanos");
		}
		
		//CONVERSIONES DE OTRAS MONEDAS A PESO ARGENTINO
		
		public void ConvertirDolaresAPesosArgentino(double valor) {
			double monedaPeso = valor * 145.17;
			monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Dolares equivalen a $ "+monedaPeso+" Pesos Argentinos");
		}
		
		public void ConvertirEuroAPesosArgentino(double valor) {
			double monedaPeso = valor * 142.86;
			monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Euros equivalen a $ "+monedaPeso+" Pesos Argentinos");
		}
		
		public void ConvertirLibrasEsterlinasAPesosArgentino(double valor) {
			double monedaPeso = valor * 163.45;
			monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Libras Esterlinas equivalen a $ "+monedaPeso+" Pesos Argentinos");
		}
		
		public void ConvertirYenJaponesAPesosArgentinoAYenJapones(double valor) {
			double monedaPeso = valor * 1.02;
			monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Yenes Japoneses equivalen a $ "+monedaPeso+" Pesos Argentinos");
		}
		
		public void ConvertirWonSurCoreanoAPesosArgentino(double valor) {
			double monedaPeso = valor * 0.10;
			monedaPeso = (double) Math.round(monedaPeso * 100d)/100;
			JOptionPane.showMessageDialog(null, "$"+valor+" Won Sur-Coreanos equivalen a $ "+monedaPeso+" Pesos Argentinos");
		}
		
}
