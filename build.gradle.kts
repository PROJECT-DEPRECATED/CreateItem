plugins {
    groovy
    id("com.github.johnrengelman.shadow") version "6.1.0"
    `maven-publish`
}

group = properties["group"]!!
version = properties["version"]!!

repositories {
    jcenter()
    maven("https://jitpack.io")
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.3.11")
    compileOnly("com.destroystokyo.paper:paper-api:1.16.4-R0.1-SNAPSHOT")
    compileOnly("com.github.ProjectTL12345:InventoryGUI:1.0v")
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }

    compileJava {
        options.encoding = "UTF-8"
    }

    compileGroovy {
        groovyOptions.encoding = "UTF-8"
    }

    create<Jar>("sourceJar") {
        archiveClassifier.set("source")
        from(sourceSets["main"].allSource)
    }

    jar {
        from (shade.map { if (it.isDirectory) it else zipTree(it) } )
    }
}

publishing {
    publications {
        create<MavenPublication>("CreateItem") {
            artifact(tasks["sourceJar"])
            from(components["java"])
        }
    }
}