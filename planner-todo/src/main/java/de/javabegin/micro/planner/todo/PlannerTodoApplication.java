package de.javabegin.micro.planner.todo;


import de.javabegin.micro.planner.entity.Category;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan(basePackages = {"de.javabegin.micro.planner.entity"})
@SpringBootApplication
@EnableEurekaClient
public class PlannerTodoApplication {

    public static void main(String[] args) {
        Category category;
        SpringApplication.run(PlannerTodoApplication.class, args);
    }

}
