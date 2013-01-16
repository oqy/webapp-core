package com.tex100.webapp.core.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author qingyong_ou
 * 权限信息
 */
@Getter
@Setter
public class PermissionInfo extends DataBaseInfo {
	private static final long serialVersionUID = -1304239625214767579L;
	// 权限值
	private String value;
	// 权限组编码
	private String groupLabel;
	// 模块代码
	private String moduleCode;
}
