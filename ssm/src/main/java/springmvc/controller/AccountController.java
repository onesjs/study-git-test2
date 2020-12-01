package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.domain.Account;
import springmvc.service.AccountService;
import springmvc.service.impl.AccountServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author sjs
 * @date 2020/5/10 10:17
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("查询所有帐户，嘎嘎嘎嘎嘎");
        List<Account> accounts = accountServiceImpl.findAll();
        model.addAttribute("list",accounts);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        System.out.println(account);
        String s = new String(account.getName().getBytes("ISO-8859-1"), "UTF-8");
        account.setName(s);
        accountServiceImpl.save(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }

}
