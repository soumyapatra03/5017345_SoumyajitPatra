package com.soumyadeep.bookstore.config;

import org.springframework.boot.actuate.metrics.MetricsEndpoint;
import org.springframework.boot.actuate.metrics.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.micrometer.core.instrument.Meter;

@Configuration
public class MetricsConfig {

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return (registry) -> registry.config().commonTags("application", "BookstoreAPI");
    }

    @Bean
    public CustomMetrics customMetrics(MeterRegistry registry) {
        return new CustomMetrics(registry);
    }
}

class CustomMetrics {

    private final MeterRegistry registry;

    CustomMetrics(MeterRegistry registry) {
        this.registry = registry;
        this.registry.counter("custom_metric_example", "type", "example");
    }
}
