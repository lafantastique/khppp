package com.epam.khppp;

import com.epam.khppp.dao.Mark;
import com.epam.khppp.mapper.MarkMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;
        MarkMapper markMapper;
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            markMapper = sqlSessionFactory.openSession().getMapper(MarkMapper.class);

            List marks = markMapper.getMarkValue();
            Mark mark = markMapper.getMarkById(1);
            System.out.println(mark.toString());
            System.out.println("-------------");
            for (Object m: marks) {
                System.out.println(m);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}