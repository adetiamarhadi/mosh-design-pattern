package com.github.adet.command;

import com.github.adet.command.editor.BoldCommand;
import com.github.adet.command.editor.Command;
import com.github.adet.command.editor.HTMLDocument;
import com.github.adet.command.editor.History;
import com.github.adet.command.editor.UndoCommand;
import com.github.adet.command.editor.UndoableCommand;
import junit.framework.TestCase;

public class UndoableCommandTest extends TestCase {

    public void test() {

        History history = new History();
        HTMLDocument document = new HTMLDocument();
        document.setContent("Hello");

        UndoableCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        Command undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
