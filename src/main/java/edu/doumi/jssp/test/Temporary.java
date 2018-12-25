package edu.doumi.jssp.test;

import edu.doumi.jssp.test.entity.Goods;
import edu.doumi.jssp.test.entity.ResultMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Temporary {
    private final Logger logger = LoggerFactory.getLogger(Temporary.class);
    @RequestMapping(value = "/goods")
    @ResponseBody
    public ResultMessage requestBodytest(@RequestBody List<Goods> goodsList){
        for(Goods goods: goodsList){
            System.out.println(goods.toString());
        }
        return new ResultMessage("accept success");
    }
}
