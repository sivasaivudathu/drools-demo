/**
 * 
 */
package com.project.droolsdemo.configuration;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sivasaiv
 *
 */
@Configuration
public class DroolsConfiguration {

    @Bean
    public KieContainer kieContainer() {
    	String groupId = "com.project";
        String artifactId = "carinsurance-rules";
        String version = "1.0.0-SNAPSHOT";
        KieServices ks = KieServices.Factory.get();
        ReleaseId releaseId = ks.newReleaseId(groupId, artifactId, version);
        KieContainer kcontainer = ks.newKieContainer(releaseId);
        KieScanner kscanner = ks.newKieScanner(kcontainer);
        kscanner.start(2000L);
        return kcontainer;
    }
}
