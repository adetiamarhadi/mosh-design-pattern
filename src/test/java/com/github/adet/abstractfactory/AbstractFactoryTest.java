package com.github.adet.abstractfactory;

import com.github.adet.abstractfactory.ant.AntWidgetFactory;
import com.github.adet.abstractfactory.app.ContactForm;
import com.github.adet.abstractfactory.material.MaterialWidgetFactory;
import junit.framework.TestCase;

public class AbstractFactoryTest extends TestCase {

    public void test() {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
