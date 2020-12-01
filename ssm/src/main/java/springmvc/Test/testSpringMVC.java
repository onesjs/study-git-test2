package springmvc.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springmvc.domain.Account;
import springmvc.service.AccountService;
import springmvc.service.impl.AccountServiceImpl;

/**
 * @author sjs
 * @date 2020/5/10 10:24
 */
public class testSpringMVC {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext config = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService accountService =(AccountServiceImpl) config.getBean("accountServiceImpl");
        //调用方法
        accountService.findAll();
        accountService.save(new Account(4,"asdasd",45));

    }
}
