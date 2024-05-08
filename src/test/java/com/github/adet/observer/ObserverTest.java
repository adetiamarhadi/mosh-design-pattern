package com.github.adet.observer;

import junit.framework.TestCase;

public class ObserverTest extends TestCase {

    public void test() {

        DataSource dataSource = new DataSource();

        Observer sheet1 = new SpreadSheet();
        Observer sheet2 = new SpreadSheet();

        Observer chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
