package com.github.adet.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
