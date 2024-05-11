package com.example.blobacademico.blob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Configuration
public class AzureBlobProperties {

    @Value("${azure.myblob.connectionstring}")
    private String connectionstring;

    @Value("${azure.myblob.container}")
    private String container;

    @Value("${azure.myblob.containerforum}")
    private String containerForo;
}