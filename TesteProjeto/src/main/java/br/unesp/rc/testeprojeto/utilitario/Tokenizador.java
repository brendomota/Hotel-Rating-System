package br.unesp.rc.testeprojeto.utilitario;

import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.tokenize.Tokenizer;

/**
 *
 * @author User
 */
public class Tokenizador {

    private SimpleTokenizer tokenizer;

    public Tokenizador() {
    }
    
    public Tokenizador(SimpleTokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public SimpleTokenizer getTokenizer() {
        return tokenizer;
    }

    public void setTokenizer(SimpleTokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }
    
    public String[] runSimpleTokenizer(String text){
        
        Tokenizer tokenizador = SimpleTokenizer.INSTANCE;
        String tokens[] = tokenizador.tokenize(text);
        
        return tokens;
    }
}
