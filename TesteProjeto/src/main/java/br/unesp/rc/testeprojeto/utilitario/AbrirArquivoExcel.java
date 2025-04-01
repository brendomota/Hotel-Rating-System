package br.unesp.rc.testeprojeto.utilitario;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */
public class AbrirArquivoExcel {
    public static void openFile(String filePath) {
        // Cria um objeto File para o arquivo Excel gerado
        File file = new File(filePath);
        
        // Verifica se a classe Desktop é suportada
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                // Verifica se o arquivo existe
                if (file.exists()) {
                    // Abre o arquivo com o aplicativo padrão associado (por exemplo, Excel)
                    desktop.open(file);
                    System.out.println("Arquivo aberto com sucesso.");
                } else {
                    System.out.println("Arquivo não encontrado: " + filePath);
                }
            } catch (IOException e) {
                System.out.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("A classe Desktop não é suportada neste sistema.");
        }
    }
}
