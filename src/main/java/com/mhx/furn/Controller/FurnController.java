package com.mhx.furn.Controller;

import com.mhx.furn.Bean.Furn;
import com.mhx.furn.Bean.Msg;
import com.mhx.furn.Service.FurnService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author 马海鑫
 * @version 1.0
 */
@Controller
public class FurnController {

    @Resource
    private FurnService furnService;

    @PostMapping("/save")
    @ResponseBody
    public Msg save(@RequestBody Furn furn){

        furnService.save(furn);
        Msg success = Msg.success();
        return success;
    }


    @RequestMapping("/furns")
    @ResponseBody
    public Msg show(){

        List<Furn> furnList = furnService.findAll();
        Msg msg = Msg.success();
       msg.add("furnList",furnList);
        return msg;
    }




    @PostMapping("/update")
    @ResponseBody
    public Msg update(@RequestBody Furn furn){

        furnService.updateFurn(furn);
        Msg success = Msg.success();
        return success;
    }



    @PostMapping("/delete")
    @ResponseBody
    public Msg delete(@RequestBody Furn furn){

        furnService.remove(furn.getId());
        Msg success = Msg.success();
        return success;
    }



}
