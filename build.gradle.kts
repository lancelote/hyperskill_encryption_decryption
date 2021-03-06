plugins {
    java
    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:+")
    testImplementation("org.mockito:mockito-core:2.+")
}

tasks.test {
    useJUnitPlatform()
}
