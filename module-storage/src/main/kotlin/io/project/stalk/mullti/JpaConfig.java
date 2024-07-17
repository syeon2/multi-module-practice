package io.project.stalk.mullti;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"io.project.stalk"})
@EnableJpaRepositories(basePackages = {"io.project.stalk"})
public class JpaConfig {
}
