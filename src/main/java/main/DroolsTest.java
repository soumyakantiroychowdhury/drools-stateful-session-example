package main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import model.*;

public class DroolsTest {

	public static final void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("business-rule");

			DeviceMessage message1 = new DeviceMessage();
            message1.setDeviceName("Sensor1-Warehouse");
            message1.setMessageSequence(1);
            message1.setMessageContent(30);

			kSession.insert(message1);
			kSession.fireAllRules();

            DeviceMessage message2 = new DeviceMessage();
            message2.setDeviceName("Sensor1-Warehouse");
            message2.setMessageSequence(2);
            message2.setMessageContent(40);

            kSession.insert(message2);
            kSession.fireAllRules();

            DeviceMessage message3 = new DeviceMessage();
            message3.setDeviceName("Sensor1-Warehouse");
            message3.setMessageSequence(3);
            message3.setMessageContent(100);

            kSession.insert(message3);
            kSession.fireAllRules();

            DeviceMessage message4 = new DeviceMessage();
            message4.setDeviceName("Sensor1-Warehouse");
            message4.setMessageSequence(4);
            message4.setMessageContent(200);

            kSession.insert(message4);
            kSession.fireAllRules();

            kSession.dispose();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
