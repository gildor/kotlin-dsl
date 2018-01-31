plugins {
    application
    kotlin("jvm") version "1.2.21"
    kotlin("kapt") version "1.2.21"
}

application {
    mainClassName = "samples.HelloAutoValueKt"
}

repositories {
    jcenter()
}

dependencies {
    compileOnly("com.google.auto.value:auto-value:1.5")
    kapt("com.google.auto.value:auto-value:1.5")

    val daggerVersion = "2.14.1"
    kapt("com.google.dagger:dagger-compiler:$daggerVersion")
    compile("com.google.dagger:dagger:$daggerVersion")

    compile(kotlin("stdlib"))

    testCompile("junit:junit:4.12")
}

kapt {
    correctErrorTypes = true

    javacOptions {
        option("SomeJavacOption", "OptionValue")
    }

    arguments {
        arg("SomeKaptArgument", "ArgumentValue")
    }
}
