package com.github.adet.mediator.client;

import com.github.adet.mediator.ArticlesDialogBox;
import junit.framework.TestCase;

public class MediatorTest extends TestCase {

    public void test() {
        ArticlesDialogBox dialogBox = new ArticlesDialogBox();
        dialogBox.simulateUserInteraction();
    }
}
