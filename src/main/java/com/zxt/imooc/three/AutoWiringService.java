package com.zxt.imooc.three;

public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    public AutoWiringService(AutoWiringDAO autoWiringDAO){
        this.autoWiringDAO = autoWiringDAO;
    }

//    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
//        this.autoWiringDAO = autoWiringDAO;
//    }

    public void say(String word){
        this.autoWiringDAO.say(word);
    }
}
