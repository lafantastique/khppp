package com.epam.khppp.mapper;

import com.epam.khppp.dao.Mark;

import java.util.List;

public interface MarkMapper {

    Mark getMarkById(Integer id);

    List getMarkValue();

}