import plugins.*

plugins {
    id("kotlin-library")
    id("with-parallel-tests")
}

dependencies {
    compile(project(":test-fixtures"))
    compile("org.xmlunit:xmlunit-matchers:2.5.1")
}

val customInstallation by rootProject.tasks
tasks {
    "test" {
        dependsOn(customInstallation)
        inputs.dir("../samples")
    }
}

withTestWorkersMemoryLimits()
