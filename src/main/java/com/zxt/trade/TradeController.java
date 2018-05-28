package com.zxt.trade;

import com.zxt.common.FailJson;
import com.zxt.common.SuccessJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "trade")
public class TradeController {
    @Resource
    private TradeService tradeService;

    private String trade_page = "trade_page";

    @RequestMapping(value = "/page")
    public String page(){
        return trade_page;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody Object trade_add(@RequestBody TradeModel tradeModel){

        try{
            tradeService.addTrade(tradeModel);
        }
        catch(Exception e)
        {
            FailJson failJson = new FailJson();
            failJson.setReason(e.getMessage());
            return failJson;
        }
        SuccessJson<TradeModel> successJson = new SuccessJson<>();
        successJson.setData(tradeModel);
        return successJson;
    }
}
