package com.mhx.furn.Service;

import com.mhx.furn.Bean.Furn;

import java.util.List;

/**
 * @author 马海鑫
 * @version 1.0
 */
public interface FurnService {

    public void save(Furn furn);

    public List<Furn> findAll();

    //修改家居  返回1成功，返回0失败
    public int updateFurn(Furn furn);

    public int remove(Integer id);
}
