/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.thuvien.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.thuvien.model.TheLoai;
import com.thuvien.model.TheLoaiModel;
import com.thuvien.model.TheLoaiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TheLoai service. Represents a row in the &quot;theloai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.thuvien.model.TheLoaiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TheLoaiImpl}.
 * </p>
 *
 * @author ADMIN
 * @see TheLoaiImpl
 * @see com.thuvien.model.TheLoai
 * @see com.thuvien.model.TheLoaiModel
 * @generated
 */
@JSON(strict = true)
public class TheLoaiModelImpl extends BaseModelImpl<TheLoai>
	implements TheLoaiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a the loai model instance should use the {@link com.thuvien.model.TheLoai} interface instead.
	 */
	public static final String TABLE_NAME = "theloai";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "tentheloai", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table theloai (id LONG not null primary key,tentheloai VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table theloai";
	public static final String ORDER_BY_JPQL = " ORDER BY theLoai.Id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY theloai.id ASC";
	public static final String DATA_SOURCE = "qlthuvienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.thuvien.model.TheLoai"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.thuvien.model.TheLoai"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TheLoai toModel(TheLoaiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TheLoai model = new TheLoaiImpl();

		model.setId(soapModel.getId());
		model.setTenTheLoai(soapModel.getTenTheLoai());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TheLoai> toModels(TheLoaiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TheLoai> models = new ArrayList<TheLoai>(soapModels.length);

		for (TheLoaiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.thuvien.model.TheLoai"));

	public TheLoaiModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TheLoai.class;
	}

	@Override
	public String getModelClassName() {
		return TheLoai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("TenTheLoai", getTenTheLoai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String TenTheLoai = (String)attributes.get("TenTheLoai");

		if (TenTheLoai != null) {
			setTenTheLoai(TenTheLoai);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;
	}

	@JSON
	@Override
	public String getTenTheLoai() {
		if (_TenTheLoai == null) {
			return StringPool.BLANK;
		}
		else {
			return _TenTheLoai;
		}
	}

	@Override
	public void setTenTheLoai(String TenTheLoai) {
		_TenTheLoai = TenTheLoai;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			TheLoai.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TheLoai toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TheLoai)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TheLoaiImpl theLoaiImpl = new TheLoaiImpl();

		theLoaiImpl.setId(getId());
		theLoaiImpl.setTenTheLoai(getTenTheLoai());

		theLoaiImpl.resetOriginalValues();

		return theLoaiImpl;
	}

	@Override
	public int compareTo(TheLoai theLoai) {
		long primaryKey = theLoai.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TheLoai)) {
			return false;
		}

		TheLoai theLoai = (TheLoai)obj;

		long primaryKey = theLoai.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<TheLoai> toCacheModel() {
		TheLoaiCacheModel theLoaiCacheModel = new TheLoaiCacheModel();

		theLoaiCacheModel.Id = getId();

		theLoaiCacheModel.TenTheLoai = getTenTheLoai();

		String TenTheLoai = theLoaiCacheModel.TenTheLoai;

		if ((TenTheLoai != null) && (TenTheLoai.length() == 0)) {
			theLoaiCacheModel.TenTheLoai = null;
		}

		return theLoaiCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", TenTheLoai=");
		sb.append(getTenTheLoai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.thuvien.model.TheLoai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenTheLoai</column-name><column-value><![CDATA[");
		sb.append(getTenTheLoai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TheLoai.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TheLoai.class
		};
	private long _Id;
	private String _TenTheLoai;
	private TheLoai _escapedModel;
}