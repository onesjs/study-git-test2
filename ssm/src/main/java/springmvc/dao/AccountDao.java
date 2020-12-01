package springmvc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import springmvc.domain.Account;

import java.util.List;

/**
 * @author sjs
 * @date 2020/5/10 10:12
 */
@Repository
public interface AccountDao {

    //查询所有
    @Select("select * from account")
    List<Account> findAll();

    //保存账户
    @Insert("insert into account (name,money) values(#{name},#{money})")
    void save(Account account);
}
