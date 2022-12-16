buildscript {
    repositories {
        mavenLocal()
        maven("https://maven.aliyun.com/repository/public")
        maven("https://repo1.maven.org/maven2/")
        google()
        mavenCentral()
    }

    val kotlin_version by extra { "1.7.20" }
    val compose_version by extra { "1.3.2" }

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}