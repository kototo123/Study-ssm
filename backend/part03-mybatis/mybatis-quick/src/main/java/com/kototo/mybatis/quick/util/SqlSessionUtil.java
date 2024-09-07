package com.kototo.mybatis.quick.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            //1.读取核心配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.构建SqlSessionFactory工厂对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static SqlSession openSession() {
        //3.通过SqlSessionFactory工厂对象获取Sqlsession(类connection)
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
