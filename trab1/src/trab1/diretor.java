package trab1;

public class diretor extends gerente {
	private String Departamento;
	private float ValorParticipaçãoNosLucros;
	
	
	
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public float getValorParticipaçãoNosLucros() {
		return ValorParticipaçãoNosLucros;
	}
	public void setValorParticipaçãoNosLucros(float valorParticipaçãoNosLucros) {
		ValorParticipaçãoNosLucros = valorParticipaçãoNosLucros;
	}
}
