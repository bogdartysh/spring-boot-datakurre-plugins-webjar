# spring-boot-datakurre-plugins-webjar
Minimal "history plugins" for Camunda Cockpit as a webjar library  https://github.com/datakurre/camunda-cockpit-plugins/

### history
project is based on https://github.com/pme123/spring-boot-datakurre-plugins
for https://github.com/datakurre/camunda-cockpit-plugins/issues/24

## How-to
basically you need to put the dependency in pom.xml before camunda itself and that's it.

so as this repo is not yet in maven-central there are two options how to do that.
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
        
    
### option 2. download
Just download  the project, install it into local repo and use

    <dependencies>
    
        <dependency>
            <groupId>com.github.bogdartysh</groupId>
            <artifactId>spring-boot-datakurre-plugins-webjar</artifactId>
           <version>7.15.0-421.2</version>
        </dependency>
    
        <dependency>
           <groupId>org.camunda.bpm.springboot</groupId>
           <artifactId>camunda-bpm-spring-boot-starter-webapp</artifactId>
           <version>7.15.0</version>
        </dependency>
        
## Example

see [sample](https://github.com/bogdartysh/spring-boot-datakurre-plugins-webjar/tree/main/sample/camunda-euler) folder

## videos 
in Ukrainian: [![how-to video (in Ukrainian)](https://img.youtube.com/vi/iKASk6JJKIs/0.jpg)](https://www.youtube.com/watch?v=iKASk6JJKIs)
