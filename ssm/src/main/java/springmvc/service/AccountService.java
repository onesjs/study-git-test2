package springmvc.service;

import springmvc.domain.Account;

import java.util.List;

/**
 * @author sjs
 * @date 2020/5/10 10:15
 */
public interface AccountService {
    //查询所有
    List<Account> findAll();

    //保存账户
    void save(Account account);
}
