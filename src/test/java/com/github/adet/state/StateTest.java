package com.github.adet.state;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StateTest extends TestCase {

    public void test() {

        // Create a stream to capture the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // Temporarily redirect standard output to the stream
        PrintStream old = System.out;
        System.setOut(ps);

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());

        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());

        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());

        canvas.mouseDown();
        canvas.mouseUp();

        // Restore the original standard output
        System.setOut(old);

        // Get the captured output as a String
        String capturedOutput = baos.toString();

        assertTrue(capturedOutput.contains("Selection icon"));
        assertTrue(capturedOutput.contains("Draw dashed rectangle"));
        assertTrue(capturedOutput.contains("Brush icon"));
        assertTrue(capturedOutput.contains("Draw a line"));
        assertTrue(capturedOutput.contains("Eraser icon"));
        assertTrue(capturedOutput.contains("Erase something"));
    }
}
