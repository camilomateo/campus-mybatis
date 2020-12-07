package com.campus.mybatis.mapper;

import java.util.List;

import com.campus.mybatis.beans.Usuario;

public interface UsuarioMapper {
	Usuario				getUsuarioById(String id);
	List<Usuario>		getAllUsuarios();
}
