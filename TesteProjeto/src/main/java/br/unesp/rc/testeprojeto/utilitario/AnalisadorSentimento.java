package br.unesp.rc.testeprojeto.utilitario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizer;
import opennlp.tools.doccat.DocumentCategorizerME;

/**
 *
 * @author User
 */
public class AnalisadorSentimento {

    private String endereco;

    public AnalisadorSentimento() {
    }

    public AnalisadorSentimento(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String analisar(String mensagem) {

        try (InputStream modelIn = new FileInputStream(endereco)) {

            DoccatModel model = new DoccatModel(modelIn);

            DocumentCategorizer doccat = new DocumentCategorizerME(model);
            String text = mensagem;
            String[] docWords = new Tokenizador().runSimpleTokenizer(text);
            double[] aProbs = doccat.categorize(docWords);

            return (String)(doccat.getBestCategory(aProbs));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            return "";

        } catch (IOException e) {

            e.printStackTrace();
            return "";
        }
    }
}
