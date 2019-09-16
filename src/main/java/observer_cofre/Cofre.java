package observer_cofre;

public class Cofre {
	private String numeroDeSerie;
	private CofreListener cofreListener;

	public Cofre(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public void setListener(CofreListener cofreListener) {
		this.cofreListener = cofreListener;
		
	}

	public void abrir(int senha) {
		if (cofreListener != null) {
			cofreListener.cofreFoiAberto(senha, numeroDeSerie);
		}
	}
}
