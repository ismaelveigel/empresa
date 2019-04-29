package trab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TesteEmpresa {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		ArrayList<FuncionarioComun> funcionarios = new ArrayList();
		ArrayList<FuncionarioComun> funcionario = new ArrayList();
		ArrayList<gerente> gerente = new ArrayList();
		ArrayList<diretor> diretor = new ArrayList();
		
		int select = 0;
		int sair = 0 ;
		
		
		
		
		while(sair == 0) {
			System.out.println("|   Escolha Uma Opção    |");
			System.out.println("|1-Cadastrar Funcionario |");
			System.out.println("|2-Cadastrar Gerente     |");
			System.out.println("|3-Cadastrar Diretor     |");
			System.out.println("|4-Consultar Salarios Anu|");
			System.out.println("|5-Consultar Bonificações|");
			System.out.println("|6-Empregados -Salarios  |");
			System.out.println("|7-Exit.            	 |");
			
			select = input.nextInt();
			int x = funcionarios.size();
			
			switch(select) {
				case 1: {
								
					FuncionarioComun funci = new FuncionarioComun();
					
					System.out.println("|Informe o nome :|");
					String nome = in.readLine();			
					funci.setNome(nome);
					
					System.out.println("|Informe a data de Nascimento xx/xx/xxxx :|");
					String nas = in.readLine();
					funci.setDataDeNascimento(nas);
					
					System.out.println("|Informe a data de Ingresso xx/xx/xxxx :||");
					String ing = in.readLine();
					funci.setDataDeIngresso(ing);
					
					System.out.println("|Informe a agencia :|");
					int age = input.nextInt();
					funci.setAgência(age);
					
					System.out.println("|Informe a Conta Corrente :|");
					int conta = input.nextInt();
					funci.setContaCorrente(conta);
					
					System.out.println("|Informe o Bando De Horas :|");
					int banco = input.nextInt();
					funci.setBancoDeHoras(banco);
					
					System.out.println("|Informe o salario|");
					float sal = input.nextFloat();
					funci.setSalário(sal);
					
					System.out.println("");
					System.out.println("");
					System.out.println("|Funcionario Cadastrado|");
					System.out.println("");
					System.out.println("");
					
					funcionarios.add(funci);
					funcionario.add(funci);
					break;
				}
				case 2 :{
					gerente funci = new gerente();
					
					System.out.println("|Informe o nome :|");
					String nome = in.readLine();			
					funci.setNome(nome);
					
					System.out.println("|Informe a data de Nascimento xx/xx/xxxx :|");
					String nas = in.readLine();
					funci.setDataDeNascimento(nas);
					
					System.out.println("|Informe a data de Ingresso xx/xx/xxxx :||");
					String ing = in.readLine();
					funci.setDataDeIngresso(ing);
					
					System.out.println("|Informe a agencia :|");
					int age = input.nextInt();
					funci.setAgência(age);
					
					System.out.println("|Informe a Conta Corrente :|");
					int conta = input.nextInt();
					funci.setContaCorrente(127301823);
					
					System.out.println("|Informe o Bando De Horas :|");
					int banco = input.nextInt();
					funci.setBancoDeHoras(banco);
					
					System.out.println("|Informe o salario|");
					float sal = input.nextFloat();
					funci.setSalário(sal);
					
					System.out.println("|Informe o Setor|");
					String set = in.readLine();
					funci.setSetor(set);
					
					System.out.println("|Informe o Nivel|");
					int niv = input.nextInt();
					funci.setNível(niv);
					
					System.out.println("");
					System.out.println("");
					System.out.println("|Gerente Cadastrado|");
					System.out.println("");
					System.out.println("");
					gerente.add(funci);
					funcionario.add(funci);
					break;
				}
				case 3 :
					diretor funci = new diretor();
					
					System.out.println("|Informe o nome :|");
					String nome = in.readLine();			
					funci.setNome(nome);
					
					System.out.println("|Informe a data de Nascimento xx/xx/xxxx :|");
					String nas = in.readLine();
					funci.setDataDeNascimento(nas);
					
					System.out.println("|Informe a data de Ingresso xx/xx/xxxx :||");
					String ing = in.readLine();
					funci.setDataDeIngresso(ing);
					
					System.out.println("|Informe a agencia :|");
					int age = input.nextInt();
					funci.setAgência(age);
					
					System.out.println("|Informe a Conta Corrente :|");
					int conta = input.nextInt();
					funci.setContaCorrente(127301823);
					
					System.out.println("|Informe o Bando De Horas :|");
					int banco = input.nextInt();
					funci.setBancoDeHoras(banco);
					
					System.out.println("|Informe o salario|");
					float sal = input.nextFloat();
					funci.setSalário(sal);
					
					System.out.println("|Informe o Setor|");
					String set = in.readLine();
					funci.setSetor(set);
					
					System.out.println("|Informe o Nivel|");
					int niv = input.nextInt();
					funci.setNível(niv);
					
					System.out.println("|Informe o Departamento|");
					String dep = in.readLine();
					funci.setDepartamento(dep);
					
					System.out.println("|Informe o Participação dos Lucros %|");
					float pl = input.nextFloat();
					funci.setValorParticipaçãoNosLucros(pl);
					
					System.out.println("");
					System.out.println("");
					System.out.println("|Ditretor Cadastrado|");
					System.out.println("");
					System.out.println("");
					funcionario.add(funci);
					diretor.add(funci);
					
					break;
				case 4 :{
					float SomaSal = 0 ;
					for(int i = 0 ;i<funcionario.size();i++){
							SomaSal += funcionario.get(i).getSalário() ;
						}
					
					System.out.println("");
					System.out.println("");
					System.out.println("|Valor anual do sálario R$:"+ SomaSal +" |");
					System.out.println("");
					System.out.println("");
					break;
				}														
				case 5 :{
					float Bonificacao = 0 ;
					
					for(int i = 0 ;i<funcionarios.size();i++){
							if (funcionarios.get(i).equals("FuncionarioComun")) {
								Bonificacao += (funcionarios.get(i).getSalário()) * 0.025;
							}else {
								if (funcionarios.get(i).equals("gerente")) {
									Bonificacao += (funcionarios.get(i).getSalário()) * 0.05;
								}
								else
								{
									Bonificacao += (diretor.get(i).getSalário()) * (0.08 + (diretor.get(i).getValorParticipaçãoNosLucros() / 100));
								}
							}
						}
					System.out.println("");
					System.out.println("Lista de funcionarios");
					System.out.println("");
					System.out.println("|Valor anual do sálario R$:"+ Bonificacao +" |");
					System.out.println("");
					System.out.println("");
					break;
				}												
				case 6 :{
					System.out.println("");
					System.out.println("");
					for(int i = 0 ;i<funcionarios.size();i++){
							System.out.println("" + funcionario.get(i).getNome() + " : R$:" + funcionario.get(i).getSalário());
						}
					System.out.println("");
					System.out.println("");
					break;
				}										
				case 7 :{
					
					sair = 1 ;
					break;
				}													
				default:{
					//caso n entre em nenhum caso equivale ao else
					sair = 1 ;
					break;
				}
			}
		}
			
		
		
		
		
	}
}
