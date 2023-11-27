package com.ana.pruebaspdf.principal;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

        PdfWriter writer = new PdfWriter("C:\\Users\\alumnofp\\Documents\\midocumento.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);
        document.add(new Paragraph("Hello World!"));
        document.close();

    }
}
