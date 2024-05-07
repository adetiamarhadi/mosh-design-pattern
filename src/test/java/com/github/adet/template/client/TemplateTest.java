package com.github.adet.template.client;

import com.github.adet.template.GenerateReportTask;
import com.github.adet.template.Task;
import junit.framework.TestCase;

public class TemplateTest extends TestCase {

    public void test() {

        Task task = new GenerateReportTask();
        task.execute();
    }
}
