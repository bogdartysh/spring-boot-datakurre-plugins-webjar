# spring-boot-datakurre-plugins-webjar
Minimal "history plugins" for Camunda Cockpit as a webjar library  https://github.com/datakurre/camunda-cockpit-plugins/

based on https://github.com/pme123/spring-boot-datakurre-plugins

## How-to
### option 1. using jitpack
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
        
[![how-to video (in Ukrainian)](https://img.youtube.com/vi/iKASk6JJKIs/0.jpg)](https://www.youtube.com/watch?v=iKASk6JJKIs)
    
### option 2. download
just download  the project, install it into local repo and use
## Example

see [sample](https://github.com/bogdartysh/spring-boot-datakurre-plugins-webjar/tree/main/sample/camunda-euler) folder
