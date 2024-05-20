package com.github.adet.bridge.client;

import com.github.adet.bridge.AdvancedRemoteControl;
import com.github.adet.bridge.RemoteControl;
import com.github.adet.bridge.SamsungTV;
import com.github.adet.bridge.SonyTV;
import junit.framework.TestCase;

public class BridgeTest extends TestCase {

    public void test() {
        RemoteControl remote = new RemoteControl(new SonyTV());
        remote.turnOn();
        remote.turnOff();

        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(new SamsungTV());
        advancedRemote.turnOn();
        advancedRemote.setChannel(2);
        advancedRemote.turnOff();
    }
}
