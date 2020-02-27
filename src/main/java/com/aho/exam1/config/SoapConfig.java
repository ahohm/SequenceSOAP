package com.aho.exam1.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfig {

    @Bean(name = "sequence")
    public DefaultWsdl11Definition definition(XsdSchema schema){
        DefaultWsdl11Definition df = new DefaultWsdl11Definition();
        df.setPortTypeName("sequence");
        df.setLocationUri("/ws");
        df.setSchema(schema);
        df.setTargetNamespace("http://www.aho.com/exam1/sequence");
        return df;
    }

    @Bean
    public XsdSchema schema(){
        return new SimpleXsdSchema(new ClassPathResource("sequence.xsd"));
    }

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> registrationBean(ApplicationContext ctx){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(ctx);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
}
