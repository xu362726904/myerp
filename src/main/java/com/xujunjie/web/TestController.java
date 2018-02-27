package com.xujunjie.web;

import com.xujunjie.vo.TestVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    //    private static Logger logger = Logger.getLogger(TestController.class);
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "index")
    public String index() {
        return "index2";
    }

    @RequestMapping(value = "index2")
    @ResponseBody
    public Object index2(TestVo testVo) {
        logger.info("hhahasd");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", testVo.getName());
        testVo.setMyDate(new Date());
        map.put("age", 123);
        map.put("birthday", testVo.getMyDate());
        return map;
    }
}
