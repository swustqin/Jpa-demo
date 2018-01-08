package com.swust.qin;

import com.swust.qin.dao.UserRepository;
import com.swust.qin.po.Account;
import com.swust.qin.po.User;
import com.swust.qin.po.UserId;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import java.util.List;

import static org.springframework.boot.SpringApplication.run;

/**
 * Created by yangyibo on 17/1/17.
 */

@SpringBootApplication
@EntityScan("com.swust.qin")
public class Application {

    @Resource
    private UserRepository userRepository;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(Application.class, args);
    }

    @Bean
//    @Transactional
    public User test() {
        User user = userRepository.findOne(new UserId(1, 10001));
        List<Account> accounts = user.getAccounts();
        System.out.println("user: " + user);
        System.out.println("account: " + accounts);
        return user;
    }

}