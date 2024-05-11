package com.github.adet.visitor;

@FunctionalInterface
public interface HTMLNode {
    void execute(Operation operation);
}
