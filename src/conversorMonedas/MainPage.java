package conversorMonedas;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MainPage {
	public static void main(String[] args) {
		// ------ Divisas actuales 14/03/2023 ------//
		
		/* ARS = Pesos Argentinos
		 * EUR = Euro
		 * USD = Dólar Estadounidense
		 * GBP = Libra Esterlina
		 * JPY = Yen Japonés
		 * KRW = Won Surcoreano */

		// ------ ARS a ------//
		double ARStoUSD = 0.0049; 
		double ARStoEUR = 0.0046; 
		double ARStoGBP = 0.0041; 
		double ARStoJPY = 0.66;
		double ARStoKRW = 6.45;

		// ------ EUR a ------//
		double EURtoARS = 216.87;
		double EURtoGBP = 0.88;
		double EURtoJPY = 140.31;
		double EURtoKRW = 1390.17;
		double EURtoUSD = 1.06;
		
		// ------ GBP a ------//
		double GBPtoARS = 245.81; 
		double GBPtoUSD = 1.20;
		double GBPtoEUR = 1.14;
		double GBPtoJPY = 160.29;
		double GBPtoKRW = 1587.79;
		
		// ------ JPY a ------//
		double JPYtoARS = 1.51; 
		double JPYtoEUR = 0.0071;
		double JPYtoGBP = 0.0062;
		double JPYtoUSD = 0.0075;
		double JPYtoKRW = 9.91;
		
		// ------ KRW a ------//
		double KRWtoARS = 0.15; 
		double KRWtoEUR = 0.00072;
		double KRWtoGBP = 0.00063;
		double KRWtoJPY = 0.10;
		double KRWtoUSD = 0.00076;
		
		// ------ USD a ------//
		double USDtoARS = 202.16;
		double USDtoEUR = 0.95;
		double USDtoGBP = 0.83;
		double USDtoJPY = 133.03;
		double USDtoKRW = 1318.09;

		double result;
		int input; 

		ImageIcon icon = new ImageIcon("src\\images\\money-icon.png");

		Object[] options = { "ARS", "EUR", "GBP", "JPY", "KRW", "USD"};
		
		do {
			String amountString = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
			
			if (amountString.matches("[a-zA-Z_]+")) {JOptionPane.showMessageDialog(null, "Valor no válido. Ingrese únicamente números.", "Error",JOptionPane.ERROR_MESSAGE);
			} else {
				Object exchange1 = (String) JOptionPane.showInputDialog(null, "Escoga la moneda que desea cambiar",
						"ARS", JOptionPane.QUESTION_MESSAGE, icon, options,
						options[0]);
				Object exchange2 = (String) JOptionPane.showInputDialog(null, "Escoga un cambio de divisas",
						"ARS", JOptionPane.QUESTION_MESSAGE, icon, options,
						options[0]);

				double amount = Double.parseDouble(amountString);

				switch (String.valueOf(exchange1) + " a " + String.valueOf(exchange2)) {
				// ------ ARS a ------//
				case "ARS a ARS" -> {
					result = amount * 1;
					JOptionPane.showMessageDialog(null, "Usted tiene " + String.format("%.2f", amount) + " ARS. Para convertir la moneda, escoja diferentes divisas.");
				}
				case "ARS a USD" -> {
					result = amount * ARStoUSD;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ARS equivalen a "
							+ String.format("%.2f", result) + " USD.");
				}
				case "ARS a EUR" -> {
					result = amount * ARStoEUR;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ARS equivalen a "
							+ String.format("%.2f", result) + " EUR.");
				}
				case "ARS a GBP" -> {
					result = amount * ARStoGBP;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ARS equivalen a "
							+ String.format("%.2f", result) + " GBP.");
				}
				case "ARS a JPY" -> {
					result = amount * ARStoJPY;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ARS equivalen a "
							+ String.format("%.2f", result) + " JPY.");
				}
				case "ARS a KRW" -> {
					result = amount * ARStoKRW;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ARS equivalen a "
							+ String.format("%.2f", result) + " KRW.");
				}
				
				// ------ EUR a ------//
				case "EUR a EUR" -> {
					result = amount * 1;
					JOptionPane.showMessageDialog(null, "Usted tiene " + String.format("%.2f", amount) + " EUR. Para convertir la moneda, escoja diferentes divisas.");
				}
				case "EUR a ARS" -> {
					result = amount * EURtoARS;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a "
							+ String.format("%.2f", result) + " ARS.");
				}
				case "EUR a USD" -> {
					result = amount * EURtoUSD;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a "
							+ String.format("%.2f", result) + " USD.");
				}
				case "EUR a GBP" -> {
					result = amount * EURtoGBP;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a "
							+ String.format("%.2f", result) + " GBP.");
				}
				case "EUR a JPY" -> {
					result = amount * EURtoJPY;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a "
							+ String.format("%.2f", result) + " JPY.");
				}
				case "EUR a KRW" -> {
					result = amount * EURtoKRW;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a "
							+ String.format("%.2f", result) + " KRW.");
				}
				
				// ------ USD a ------//
				case "USD a USD" -> {
					result = amount * 1;
					JOptionPane.showMessageDialog(null, "Usted tiene " + String.format("%.2f", amount) + " USD. Para convertir la moneda, escoja diferentes divisas.");
				}
				case "USD a ARS" -> {
					result = amount * USDtoARS;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a "
							+ String.format("%.2f", result) + " ARS.");
				}
				case "USD a EUR" -> {
					result = amount * USDtoEUR;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a "
							+ String.format("%.2f", result) + " EUR.");
				}
				case "USD a GBP" -> {
					result = amount * USDtoGBP;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a "
							+ String.format("%.2f", result) + " GBP.");
				}
				case "USD a JPY" -> {
					result = amount * USDtoJPY;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a "
							+ String.format("%.2f", result) + " JPY.");
				}
				case "USD a KRW" -> {
					result = amount * USDtoKRW;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a "
							+ String.format("%.2f", result) + " KRW.");
				}
				
				// ------ JPY a ------//
				case "JPY a JPY" -> {
					result = amount * 1;
					JOptionPane.showMessageDialog(null, "Usted tiene " + String.format("%.2f", amount) + " JPY. Para convertir la moneda, escoja diferentes divisas.");
				}
				case "JPY a ARS" -> {
					result = amount * JPYtoARS;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a "
							+ String.format("%.2f", result) + " ARS.");
				}
				case "JPY a USD" -> {
					result = amount * JPYtoUSD;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a "
							+ String.format("%.2f", result) + " USD.");
				}
				case "JPY a EUR" -> {
					result = amount * JPYtoEUR;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a "
							+ String.format("%.2f", result) + " EUR.");
				}
				case "JPY a GBP" -> {
					result = amount * JPYtoGBP;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a "
							+ String.format("%.2f", result) + " GBP.");
				}
				case "JPY a KRW" -> {
					result = amount * JPYtoKRW;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a "
							+ String.format("%.2f", result) + " KRW.");
				}
				
				// ------ KRW a ------//
				case "KRW a KRW" -> {
					result = amount * 1;
					JOptionPane.showMessageDialog(null, "Usted tiene " + String.format("%.2f", amount) + " KRW. Para convertir la moneda, escoja diferentes divisas.");
				}
				case "KRW a ARS" -> {
					result = amount * KRWtoARS;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a "
							+ String.format("%.2f", result) + " ARS.");
				}
				case "KRW a USD" -> {
					result = amount * KRWtoUSD;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a "
							+ String.format("%.2f", result) + " USD.");
				}
				case "KRW a EUR" -> {
					result = amount * KRWtoEUR;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a "
							+ String.format("%.2f", result) + " EUR.");
				}
				case "KRW a GBP" -> {
					result = amount * KRWtoGBP;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a "
							+ String.format("%.2f", result) + " GBP.");
				}
				case "KRW a JPY" -> {
					result = amount * KRWtoJPY;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a "
							+ String.format("%.2f", result) + " JPY.");
				}
				
				// ------ GBP a ------//
				case "GBP a GBP" -> {
					result = amount * 1;
					JOptionPane.showMessageDialog(null, "Usted tiene " + String.format("%.2f", amount) + " GBP. Para convertir la moneda, escoja diferentes divisas.");
				}
				case "GBP a ARS" -> {
					result = amount * GBPtoARS;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a "
							+ String.format("%.2f", result) + " ARS.");
				}
				case "GBP a EUR" -> {
					result = amount * GBPtoEUR;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a "
							+ String.format("%.2f", result) + " EUR.");
				}
				case "GBP a USD" -> {
					result = amount * GBPtoUSD;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a "
							+ String.format("%.2f", result) + " USD.");
				}
				case "GBP a JPY" -> {
					result = amount * GBPtoJPY;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a "
							+ String.format("%.2f", result) + " JPY.");
				}
				case "GBP a KRW" -> {
					result = amount * GBPtoKRW;
					JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a "
							+ String.format("%.2f", result) + " KRW.");
				}
				}

			}
			input = JOptionPane.showInternalConfirmDialog(null, "¿Desea continuar?", null, JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, icon);

		} while (input == 0);
		
		if(input == 1) {
			JOptionPane.showMessageDialog(null, "Cerrando programa");
		}
	}
}


