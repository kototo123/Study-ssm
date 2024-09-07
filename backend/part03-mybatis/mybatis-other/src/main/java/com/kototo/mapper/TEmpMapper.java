package com.kototo.mapper;

import com.kototo.pojo.TEmp;

/**
* @author Administrator
* @description 针对表【t_emp】的数据库操作Mapper
* @createDate 2024-08-29 18:13:57
* @Entity com.kototo.pojo.TEmp
*/
public interface TEmpMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    TEmp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);

}
