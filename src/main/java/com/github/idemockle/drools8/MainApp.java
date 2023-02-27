package com.github.idemockle.drools8;

import com.github.idemockle.drools8.ruleobjects.Message;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class MainApp {

    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        KieSession kSession = kContainer.newKieSession();
        kSession.setGlobal("out", System.out);
        kSession.insert(new Message(6));
        kSession.fireAllRules();
    }
}
