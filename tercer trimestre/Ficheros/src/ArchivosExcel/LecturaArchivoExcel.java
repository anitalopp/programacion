package ArchivosExcel;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaArchivoExcel {
	public static void main(String[] args) {
		// Enunciado: Lectura de datos desde un archivo Excel
		String nombreArchivo = "datos.xlsx";

		try (FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
				Workbook workbook = WorkbookFactory.create(fileInputStream)) {

			Sheet sheet = workbook.getSheetAt(0);

			for (Row row : sheet) {
				for (Cell cell : row) {
					System.out.print(cell.toString() + "\t");
				}
				System.out.println();
			}

		} catch (IOException | EncryptedDocumentException ex) {
			ex.printStackTrace();
		}
	}
}
