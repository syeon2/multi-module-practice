dependencies {
    implementation(project(":module-domain"))
    implementation(project(":module-storage"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
}
