package com.dzx.servicre;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dzx.entity.Modules;
import com.dzx.entity.Roles;

public interface ModulesService {
	public List<Modules> getAllModules();
	   public int updateModulesById(Modules modules);
	   public int deleteModulesById(Integer id);
	   public int addModules(Modules modules);
		  public Modules getAllModulesbyid(Integer id);
	//根据用户id获得角色集合
		public List<Roles> getRolesByUseid(String uid);
		public List<Modules> getModuleByroleid(List<String> rid);
		

}
