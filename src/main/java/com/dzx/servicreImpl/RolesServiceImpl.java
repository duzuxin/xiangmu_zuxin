package com.dzx.servicreImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dzx.entity.Kfz;
import com.dzx.entity.Modules;
import com.dzx.entity.Roles;
import com.dzx.mapper.RolesMapper;
import com.dzx.servicre.RolesService;
@Service
public class RolesServiceImpl implements RolesService {
	@Resource(name="rolesMapper")
	private  RolesMapper rolesMapper;
		
	
	/*
	 * 角色增删改查
	 */
		public List<Roles> getAllModules(String Name, Integer limit, Integer page) {
			// TODO Auto-generated method stub
			return rolesMapper.selectAllRoles(Name, limit, page);
		}
		public int getConutModules(String Name) {
			// TODO Auto-generated method stub
			return  rolesMapper.getConutRoles(Name);
		}
		public int addRoles(String id, String name) {
			// TODO Auto-generated method stub
			return rolesMapper.addRoles(id, name);
		}
		public int deleteRoles(String id) {
			// TODO Auto-generated method stub
			return rolesMapper.deleteRoles(id);
		}
		public int updateRoles(String id, String name) {
			// TODO Auto-generated method stub
			return rolesMapper.updateRoles(id, name);
		}
		/*
		 * 角色权限增删改查
		 */
		//角色权限树
		public List<Modules> getAllModulesByid(String roleId) {
			// TODO Auto-generated method stub
			return rolesMapper.getAllModulesByid(roleId);
		}
		public int addrolemodules(Integer mId, String rId) {
			// TODO Auto-generated method stub
			return rolesMapper.addrolemodules(mId, rId);
		}
		public int delrolemodules(String rId) {
			// TODO Auto-generated method stub
			return rolesMapper.delrolemodules( rId);
		}
}
