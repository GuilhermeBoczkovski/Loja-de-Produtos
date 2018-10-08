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
import java.util.ArrayList; 

public class ControladorProdutos implements IControladorProdutos {
    
    private ArrayList<Produto> produtos = new ArrayList();
    private ArrayList<CategoriaProduto> categorias = new ArrayList();
    
    /**
	*
	* @param inflacao percentual de inflacao a ser aplicado sobre o preco de todos os produtos. Exemplo para 10% de inflacao: 10
	*/
	public void atualizaPrecos(float inflacao){
	    for(Produto produto: produtos){
	        produto.setPreco(produto.getPreco()*(100+inflacao)/100);
	    }
	}

	/**
	*
	* @param codigo codigo do produto desejado
	* @return produto encontrado pelo codigo fornecido. Retorna NULL se nenhum produto foi encontrado com o codigo fornecido
	*/
	public Produto getProdutoPeloCodigo(int codigo){
	    for(Produto produto: produtos){
	        if(codigo == produto.getCodigo()){
	            return produto;
	        }	 	  	  		      	     	      			       	 	
	    }
	    return new Produto();
	}

	/**
	*
	* @param codigo codigo da categoria a ser inserida
	* @param nome nome da categoria a ser inserida
	* @return retorna a categoria que foi inserida
	*/
	public CategoriaProduto incluiCategoriaProduto(int codigo, String nome){
	    CategoriaProduto categoriaProduto = new CategoriaProduto(codigo, nome);
	    categorias.add(categoriaProduto);
	    return categoriaProduto;
	}

	/**
	*
	* @param codigo codigo do produto a ser inserido
	* @param nome nome do produto a ser inserido
	* @param descricao descricao do produto a ser inserido
	* @param preco preco do produto a ser inserido
	* @param quantidade quantidade em estoque do produto a ser inserido
	* @param categoria referencia para a categoria do produto a ser inserido
	* @return retorna o produto que foi inserido
	*/
	public Produto incluiProduto(int codigo, String nome, String descricao, float preco, int quantidade, CategoriaProduto categoria){
	    Produto produto = new Produto(categoria, codigo, descricao, nome, preco, quantidade);
	    produtos.add(produto);
	    return produto;
	}

}	 	  	  		      	     	      			       	 	
