package com.cassio;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "sujeito", configuration = AulaConfig.class)
public class MainConfig {

}
 