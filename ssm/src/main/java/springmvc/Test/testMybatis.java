package springmvc.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import springmvc.dao.AccountDao;
import springmvc.domain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author sjs
 * @date 2020/5/10 15:30
 */
public class testMybatis {
    @Test
    public void run() throws IOException {
        
        InputStream in = Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);

        Account account = new Account();
        account.setName("相机");
        account.setMoney(6000);
        dao.save(account);
        List<Account> accounts = dao.findAll();
        for (Account account1 : accounts) {
            System.out.println(account1);
        }
        //提交事务
        session.commit();
        session.close();
        in.close();

    }
}
