package com.mhx.furn.Service.impl;

import com.mhx.furn.Bean.Furn;
import com.mhx.furn.Dao.FurnMapper;
import com.mhx.furn.Service.FurnService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author 马海鑫
 * @version 1.0
 */
@Service
public class FurnServiceImpl implements FurnService {


    @Resource
    private   FurnMapper furnMapper;


    @Override
    public void save(Furn furn) {

       furnMapper.insertSelective(furn);


    }

    @Override
    public List<Furn> findAll() {
    return    furnMapper.selectByExample(null);
    }


    @Override
    public int updateFurn(Furn furn) {

        return furnMapper.updateByPrimaryKeySelective(furn);
    }

    @Override
    public int remove(Integer id) {
        return furnMapper.deleteByPrimaryKey(id);
    }
}
