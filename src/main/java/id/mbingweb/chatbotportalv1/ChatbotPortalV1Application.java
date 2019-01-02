package id.mbingweb.chatbotportalv1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("id.mbingweb.chatbotportalv1.mapper")
public class ChatbotPortalV1Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(ChatbotPortalV1Application.class, args);
    }
}

