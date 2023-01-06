package controle.exception;

public class ParametrosInvalidosException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String MSG = "O segundo parâmetro deve ser MAIOR que o primeiro";
	
	public ParametrosInvalidosException() {}
	
	public String getMsg() {
		return this.MSG;
	}
}
