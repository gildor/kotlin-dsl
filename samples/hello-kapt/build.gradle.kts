plugins {
    application
    kotlin("jvm") version "1.2.21"
    kotlin("kapt") version "1.2.21"
}

application {
    mainClassName = "samples.HelloDaggerKt"
}

repositories {
    jcenter()
}

dependencies {
    val daggerVersion = "2.14.1"
    kapt("com.google.dagger:dagger-compiler:$daggerVersion")
    compile("com.google.dagger:dagger:$daggerVersion")

    compile(kotlin("stdlib"))

    testCompile("junit:junit:4.12")
}

