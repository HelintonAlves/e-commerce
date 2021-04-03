package com.hatanaka.ecommerce.payment.config;

import com.hatanaka.ecommerce.payment.streaming.CheckoutProccessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(CheckoutProccessor.class)
public class StreamingConfig {
}
