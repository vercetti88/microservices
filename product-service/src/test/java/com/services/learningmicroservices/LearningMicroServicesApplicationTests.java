//package com.services.learningmicroservices;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.services.learningmicroservices.dto.ProductRequest;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//import org.testcontainers.utility.DockerImageName;
//
//import java.math.BigDecimal;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class LearningMicroServicesApplicationTests {
//
////    @Container
////    static PostgreSQLContainer postgres = new PostgreSQLContainer<>(DockerImageName.parse(("postgres:15")))
////            .withEnv("POSTGRES_USER", "myuser")
////            .withEnv("POSTGRES_PASSWORD", "mypassword")
////            .withEnv("POSTGRES_DB", "mydatabase");
////
////    @Autowired
////    private MockMvc mockMvc;
////
////    @Autowired
////    private ObjectMapper objectMapper;
////
//////    @DynamicPropertySource
//////    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//////        dynamicPropertyRegistry.add("spring.datasource.url", postgres::getJdbcUrl);
//////    }
////
////    @Test
////    void shouldCreateProduct() throws Exception {
////        ProductRequest productRequests = getProductRequests();
////
////        String s = objectMapper.writeValueAsString(productRequests);
////
////        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
////                .contentType(MediaType.APPLICATION_JSON)
////                .content(s))
////                .andExpect(status().isCreated());
////    }
////
////
////    @Test
////    void shouldReturnListOfProducts() throws Exception {
////        mockMvc.perform(MockMvcRequestBuilders.get("/api/product")).andExpect(status().isOk());
////    }
////
////
////    private ProductRequest getProductRequests() {
////        return ProductRequest.builder().
////                name("IPhone 13 Pro Max")
////                .description("Brand new Iphone 13 Pro Max")
////                .price(BigDecimal.valueOf(12.31))
////                .build();
////    }
//
//}
