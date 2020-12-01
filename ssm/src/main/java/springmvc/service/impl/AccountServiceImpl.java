package springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.AccountDao;
import springmvc.domain.Account;
import springmvc.service.AccountService;

import java.util.List;

/**
 * @author sjs
 * @date 2020/5/10 10:15
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("我执行了查询所有");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void save(Account account) {
        System.out.println("我执行了保存");
        accountDao.save(account);
    }
}
