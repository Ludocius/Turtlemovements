plugins {
    id("java")
}

group = "org.turtlemovements"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

ext{
    val junitVersion = "5.10.0"

    dependencies {
        testImplementation(platform("org.junit:junit-bom:$junitVersion"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }
}





tasks.test {
    useJUnitPlatform()
}