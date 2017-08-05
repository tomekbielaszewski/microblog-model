# microblog-model [![Build Status](https://travis-ci.org/tomekbielaszewski/microblog-model.svg)](https://travis-ci.org/tomekbielaszewski/microblog-model)

Model classes for writing wykop.pl/microblog based java apps

## Maven
```xml
<repositories>
    <repository>
        <id>keeper-client-mvn-repository</id>
        <url>https://raw.github.com/tomekbielaszewski/microblog-model/mvn-repo/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
        </snapshots>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>pl.grizwold</groupId>
        <artifactId>microblog-model</artifactId>
        <version>0.0.1-SNAPSHOT</version>	
    </dependency>
</dependencies>
```

## Deployment
1. Create empty branch `mvn-repo`
1. run `mvn clean deploy`