/*
 * Universidade Federal de Santa Catarina.
 * CTC - Centro Tecnologico - http://ctc.ufsc.br
 * INE - Departamento de Informatica e Estatistica - http://inf.ufsc.br
 */

/**
 *
 * @author Jean Hauck <jean.hauck at ufsc.br>
 * @date   01/09/2017
 */
public class CategoriaProduto implements ICategoriaProduto {
    
    private int codigo;
    private String nome;
    
    public CategoriaProduto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public CategoriaProduto(){
    }
    
    public int getCodigo(){
	    return this.codigo;
	}
	public void setCodigo(int codigo){
	    this.codigo = codigo;
	}
    public String getNome(){
        return this.nome;
    }
	public void setNome(String nome){
	    this.nome = nome;
	}
}	 	  	  		      	     	      			       	 	
