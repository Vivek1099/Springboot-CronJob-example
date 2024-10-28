package Springboot_cronjob_basic_example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

public class MyController
{
    @RequestMapping("/test")
    public String test()
    {
        return "This is cron job test";
    }

    @Scheduled(fixedDelay=2000)// or use another class with @Configuration
    public void testing()
    {
        System.out.println("action logged "+ LocalDateTime.now());
    }

    @Scheduled(cron="*/2 * * * * *")   // note there must be 6 fields
    public void testing1()
    {
        System.out.println("action taken "+LocalDateTime.now());
    }
    @Scheduled(cron="${job.cron.vivek}") // check the application.properties file
    public void vivek()
    {
        System.out.println("hello cron job testing");

    }

}
