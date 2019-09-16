package observer_cofre;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		
		Cofre cofre = new Cofre("312d23a");
		
		cofre.setListener(new CofreListener() {
			public void cofreFoiAberto(int senha, String numeroDeSerie) {
				JOptionPane.showMessageDialog(null, "O cofre " 
			           + numeroDeSerie 
			           + " foi aberto com a senha " 
			           + senha);
			}			
		});
		
		cofre.abrir(123456);
	}
}
