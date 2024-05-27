package com.github.adet.builder;

public class PDFDocumentBuilder implements PresentationBuilder {

    private PDFDocument pdfDocument = new PDFDocument();

    @Override
    public void addSlide(Slide slide) {
        pdfDocument.addPage(slide.getText());
    }

    public PDFDocument getPdfDocument() {
        return pdfDocument;
    }
}
