package com.mavenssm.controller.system.login;

import com.mavenssm.controller.base.BaseController;
import com.mavenssm.util.PageData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br>
 * 〈登录controller〉
 *
 * @author liupengtao
 * @create 2017/8/16
 * @since 1.0.0
 */

@Controller
public class LoginController extends BaseController{

    @RequestMapping(value = "/login_toLogin")
    public ModelAndView toLogin(){
        ModelAndView mv=this.getModelAndView();
        PageData pd = new PageData();
        pd.put("xx","你好吗");
        mv.setViewName("system/index/login");
        mv.addObject("pd",pd);

        return mv;
    }
}
