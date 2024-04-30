import java.io.FileOutputStream;

public class EscrituraArchivoExcel {
    public static void main(String[] args) {
        String nombreArchivo = "nuevo_datos.xlsx";

        try (Workbook workbook = WorkbookFactory.create(true);
             FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo)) {

            Sheet sheet = workbook.createSheet("Hoja1");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hola desde Excel");

            workbook.write(fileOutputStream);
            System.out.println("Datos escritos en el archivo Excel correctamente.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
