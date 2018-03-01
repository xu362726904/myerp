package com.xujunjie.web;

import com.xujunjie.entity.EnglishWord;
import com.xujunjie.service.EnglishWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/englishWord")
public class EnglishWordController {
    @Autowired
    private EnglishWordService englishWordService;

    @RequestMapping(value = "list")
    @ResponseBody
    public List<EnglishWord> list() {
        EnglishWord query = new EnglishWord();
        return englishWordService.findList(query);
    }
}
