# spring-boot-datakurre-plugins-webjar
Minimal "history plugins" for Camunda Cockpit as a webjar library
based on https://github.com/pme123/spring-boot-datakurre-plugins https://github.com/datakurre/camunda-cockpit-plugins/
## how-to

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    
    <dependencies>
    
        <dependency>
            <groupId>com.github.bogdartysh</groupId>
            <artifactId>spring-boot-datakurre-plugins-webjar</artifactId>
           <version>7.15.0-421.1</version>
        </dependency>
    
        <dependency>
           <groupId>org.camunda.bpm.springboot</groupId>
           <artifactId>camunda-bpm-spring-boot-starter-webapp</artifactId>
           <version>7.15.0</version>
        </dependency>
    
## Example

see sample folder
