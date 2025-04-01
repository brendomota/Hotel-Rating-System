package br.unesp.rc.testeprojeto.utilitario;

import br.unesp.rc.testeprojeto.modelo.Hotel;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author User
 */
public class GeradorPlanilha {
    public void writeHotelsToExcel(List<Hotel> hotels, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Hotels Reviews");

        // Criação da linha de cabeçalho
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("");
        for (int i = 0; i < hotels.size(); i++) {
            headerRow.createCell(i + 1).setCellValue(hotels.get(i).getNome());
        }

        // Criação da linha para "Positiva"
        Row positiveRow = sheet.createRow(1);
        positiveRow.createCell(0).setCellValue("Positiva");
        for (int i = 0; i < hotels.size(); i++) {
            positiveRow.createCell(i + 1).setCellValue(hotels.get(i).getNumeroComentariosPositovos());
        }

        // Criação da linha para "Neutra"
        Row neutralRow = sheet.createRow(2);
        neutralRow.createCell(0).setCellValue("Neutra");
        for (int i = 0; i < hotels.size(); i++) {
            neutralRow.createCell(i + 1).setCellValue(hotels.get(i).getNumeroComentariosNeutros());
        }

        // Criação da linha para "Negativa"
        Row negativeRow = sheet.createRow(3);
        negativeRow.createCell(0).setCellValue("Negativa");
        for (int i = 0; i < hotels.size(); i++) {
            negativeRow.createCell(i + 1).setCellValue(hotels.get(i).getNumeroComentariosNegativos());
        }

        // Ajustar largura das colunas
        for (int i = 0; i <= hotels.size(); i++) {
            sheet.autoSizeColumn(i);
        }

        // Escrevendo o arquivo em disco
        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
