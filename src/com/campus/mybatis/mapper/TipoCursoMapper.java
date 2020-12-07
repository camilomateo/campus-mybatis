package com.campus.mybatis.mapper;

import java.util.List;

import com.campus.mybatis.beans.TipoCurso;

public interface TipoCursoMapper {
	TipoCurso 			getTipoCursoById(String id);
	List<TipoCurso>		getAllTipoCursos();
}
