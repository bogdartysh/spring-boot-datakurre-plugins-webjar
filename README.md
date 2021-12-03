# spring-boot-datakurre-plugins-webjar
Minimal "history plugins" for Camunda Cockpit as a webjar library

## how-to

    <dependency>
      <groupId>org.camunda.bpm.springboot</groupId>
      <artifactId>camunda-bpm-spring-boot-starter-webapp</artifactId>
      <version>7.15.0</version>
      <exclusions>
        <exclusion>
          <groupId>org.camunda.bpm.webapp</groupId>
          <artifactId>camunda-webapp-webjar</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
    
    <dependency>
         <groupId>org.camunda.bpm.webapp.plugins</groupId>
         <artifactId>camunda-webapp-datakurre-webjar</artifactId>
         <version>7.15.0</version>
    </dependency>
