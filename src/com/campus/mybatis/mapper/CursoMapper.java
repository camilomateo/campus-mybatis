package com.campus.mybatis.mapper;

import java.util.List;

import com.campus.mybatis.beans.Curso;

public interface CursoMapper {
	Curso				getCursoById(String id);
	List<Curso>			getAllCursos();
}
