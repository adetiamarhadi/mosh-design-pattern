package com.github.adet.command.editor;

public class HTMLDocument {

    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
