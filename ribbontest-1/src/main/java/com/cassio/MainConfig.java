package com.cassio;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "subject", configuration = AulaConfig.class)
public class MainConfig {

}

//
//
//Replaces the "Ping" strategy Employed when calling "subject" clients
//
//Note: Do NOT component scan SubjectConfig!