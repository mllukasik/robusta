# Java tools library

## Adding *robusta* to maven project

Add GitHub repository to pom file.
```xml
    <repositories>
        <repository>
            <id>central</id>
            <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
            <id>github</id>
            <url>https://maven.pkg.github.com/mllukasik/*</url>
        </repository>
    </repositories>
```
Also, to get access to GitHub maven repository u need to provide authentication token.
Provide username/password in your maven settings.xml like this
```xml
<servers>
    <server>
        <id>github</id>
        <username>${username}</username>
        <password>${password}</password>
    </server>
</servers>
```
