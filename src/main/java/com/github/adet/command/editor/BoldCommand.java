package com.github.adet.command.editor;

public class BoldCommand implements UndoableCommand {

    private final HTMLDocument document;
    private final History history;

    private String prevContent;

    public BoldCommand(HTMLDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
