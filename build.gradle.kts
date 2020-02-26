plugins {
    kotlin("js") version "1.3.61"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin {
//    sourceSets["main"].kotlin.srcDir("src/main/external") // Pluginのdukatを利用するならコメントアウトする
    sourceSets["main"].dependencies {
        implementation(npm("voca", "^1.4.0"))
        implementation(npm("@types/voca", "^1.4.0"))
    }
    target {
        nodejs {
            this.runTask {
                this.nodeJs.versions.dukat.version = "0.0.28"
            }
        }
        useCommonJs()
    }
}
