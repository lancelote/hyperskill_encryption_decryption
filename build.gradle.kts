plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:+")
}

tasks.test {
    useJUnitPlatform()
}
