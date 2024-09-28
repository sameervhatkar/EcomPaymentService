package dev.sameer.PaymentService.Config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorPayClientConfig {

    @Value("${razorpay.client.key}")
    private String razorpayClientKey;
    @Value("${razorpay.client.secretkey}")
    private String razorpayClientSecretKey;

    @Bean
    public RazorpayClient getRazorPayClient () throws RazorpayException {
        RazorpayClient razorpayClient = new RazorpayClient(razorpayClientKey, razorpayClientSecretKey);
        return razorpayClient;

    }
}
