package com.github.liuweijw.business.admin.service;

import java.util.Set;

import com.github.liuweijw.business.admin.domain.Menu;
import com.github.liuweijw.business.commons.web.service.PermissionService;
import com.github.liuweijw.core.beans.system.AuthMenu;

public interface MenuService extends PermissionService {

	/**
     * 通过角色名称查询URL 权限
     *
     * @param roleCode 角色名称
     * @return 菜单列表
     */
    Set<AuthMenu> findMenuByRole(String roleCode);

    /**
     * 级联删除菜单
     *
     * @param id   菜单ID
     * @param roleCode 角色
     * @return 成功、失败
     */
    Boolean deleteMenu(Integer id, String roleCode);

    /**
     * 更新菜单信息
     *
     * @param sysMenu 菜单信息
     * @return 成功、失败
     */
    Boolean updateMenuById(Menu sysMenu,String roleCode);

}
