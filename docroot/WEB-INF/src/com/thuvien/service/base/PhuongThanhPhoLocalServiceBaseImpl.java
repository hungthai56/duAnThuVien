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

package com.thuvien.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.thuvien.model.PhuongThanhPho;

import com.thuvien.service.PhuongThanhPhoLocalService;
import com.thuvien.service.persistence.GiaHanFinder;
import com.thuvien.service.persistence.GiaHanPersistence;
import com.thuvien.service.persistence.PhieuMuonFinder;
import com.thuvien.service.persistence.PhieuMuonPersistence;
import com.thuvien.service.persistence.PhuongThanhPhoPersistence;
import com.thuvien.service.persistence.QuanThanhPhoPersistence;
import com.thuvien.service.persistence.SachFinder;
import com.thuvien.service.persistence.SachPersistence;
import com.thuvien.service.persistence.TheLoaiFinder;
import com.thuvien.service.persistence.TheLoaiPersistence;
import com.thuvien.service.persistence.TinhThanhPhoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the phuong thanh pho local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.thuvien.service.impl.PhuongThanhPhoLocalServiceImpl}.
 * </p>
 *
 * @author ADMIN
 * @see com.thuvien.service.impl.PhuongThanhPhoLocalServiceImpl
 * @see com.thuvien.service.PhuongThanhPhoLocalServiceUtil
 * @generated
 */
public abstract class PhuongThanhPhoLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements PhuongThanhPhoLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.thuvien.service.PhuongThanhPhoLocalServiceUtil} to access the phuong thanh pho local service.
	 */

	/**
	 * Adds the phuong thanh pho to the database. Also notifies the appropriate model listeners.
	 *
	 * @param phuongThanhPho the phuong thanh pho
	 * @return the phuong thanh pho that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PhuongThanhPho addPhuongThanhPho(PhuongThanhPho phuongThanhPho)
		throws SystemException {
		phuongThanhPho.setNew(true);

		return phuongThanhPhoPersistence.update(phuongThanhPho);
	}

	/**
	 * Creates a new phuong thanh pho with the primary key. Does not add the phuong thanh pho to the database.
	 *
	 * @param name the primary key for the new phuong thanh pho
	 * @return the new phuong thanh pho
	 */
	@Override
	public PhuongThanhPho createPhuongThanhPho(long name) {
		return phuongThanhPhoPersistence.create(name);
	}

	/**
	 * Deletes the phuong thanh pho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param name the primary key of the phuong thanh pho
	 * @return the phuong thanh pho that was removed
	 * @throws PortalException if a phuong thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PhuongThanhPho deletePhuongThanhPho(long name)
		throws PortalException, SystemException {
		return phuongThanhPhoPersistence.remove(name);
	}

	/**
	 * Deletes the phuong thanh pho from the database. Also notifies the appropriate model listeners.
	 *
	 * @param phuongThanhPho the phuong thanh pho
	 * @return the phuong thanh pho that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PhuongThanhPho deletePhuongThanhPho(PhuongThanhPho phuongThanhPho)
		throws SystemException {
		return phuongThanhPhoPersistence.remove(phuongThanhPho);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(PhuongThanhPho.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return phuongThanhPhoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhuongThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return phuongThanhPhoPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhuongThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return phuongThanhPhoPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return phuongThanhPhoPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return phuongThanhPhoPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public PhuongThanhPho fetchPhuongThanhPho(long name)
		throws SystemException {
		return phuongThanhPhoPersistence.fetchByPrimaryKey(name);
	}

	/**
	 * Returns the phuong thanh pho with the primary key.
	 *
	 * @param name the primary key of the phuong thanh pho
	 * @return the phuong thanh pho
	 * @throws PortalException if a phuong thanh pho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PhuongThanhPho getPhuongThanhPho(long name)
		throws PortalException, SystemException {
		return phuongThanhPhoPersistence.findByPrimaryKey(name);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return phuongThanhPhoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the phuong thanh phos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.thuvien.model.impl.PhuongThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of phuong thanh phos
	 * @param end the upper bound of the range of phuong thanh phos (not inclusive)
	 * @return the range of phuong thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PhuongThanhPho> getPhuongThanhPhos(int start, int end)
		throws SystemException {
		return phuongThanhPhoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of phuong thanh phos.
	 *
	 * @return the number of phuong thanh phos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getPhuongThanhPhosCount() throws SystemException {
		return phuongThanhPhoPersistence.countAll();
	}

	/**
	 * Updates the phuong thanh pho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param phuongThanhPho the phuong thanh pho
	 * @return the phuong thanh pho that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PhuongThanhPho updatePhuongThanhPho(PhuongThanhPho phuongThanhPho)
		throws SystemException {
		return phuongThanhPhoPersistence.update(phuongThanhPho);
	}

	/**
	 * Returns the gia han local service.
	 *
	 * @return the gia han local service
	 */
	public com.thuvien.service.GiaHanLocalService getGiaHanLocalService() {
		return giaHanLocalService;
	}

	/**
	 * Sets the gia han local service.
	 *
	 * @param giaHanLocalService the gia han local service
	 */
	public void setGiaHanLocalService(
		com.thuvien.service.GiaHanLocalService giaHanLocalService) {
		this.giaHanLocalService = giaHanLocalService;
	}

	/**
	 * Returns the gia han remote service.
	 *
	 * @return the gia han remote service
	 */
	public com.thuvien.service.GiaHanService getGiaHanService() {
		return giaHanService;
	}

	/**
	 * Sets the gia han remote service.
	 *
	 * @param giaHanService the gia han remote service
	 */
	public void setGiaHanService(
		com.thuvien.service.GiaHanService giaHanService) {
		this.giaHanService = giaHanService;
	}

	/**
	 * Returns the gia han persistence.
	 *
	 * @return the gia han persistence
	 */
	public GiaHanPersistence getGiaHanPersistence() {
		return giaHanPersistence;
	}

	/**
	 * Sets the gia han persistence.
	 *
	 * @param giaHanPersistence the gia han persistence
	 */
	public void setGiaHanPersistence(GiaHanPersistence giaHanPersistence) {
		this.giaHanPersistence = giaHanPersistence;
	}

	/**
	 * Returns the gia han finder.
	 *
	 * @return the gia han finder
	 */
	public GiaHanFinder getGiaHanFinder() {
		return giaHanFinder;
	}

	/**
	 * Sets the gia han finder.
	 *
	 * @param giaHanFinder the gia han finder
	 */
	public void setGiaHanFinder(GiaHanFinder giaHanFinder) {
		this.giaHanFinder = giaHanFinder;
	}

	/**
	 * Returns the phieu muon local service.
	 *
	 * @return the phieu muon local service
	 */
	public com.thuvien.service.PhieuMuonLocalService getPhieuMuonLocalService() {
		return phieuMuonLocalService;
	}

	/**
	 * Sets the phieu muon local service.
	 *
	 * @param phieuMuonLocalService the phieu muon local service
	 */
	public void setPhieuMuonLocalService(
		com.thuvien.service.PhieuMuonLocalService phieuMuonLocalService) {
		this.phieuMuonLocalService = phieuMuonLocalService;
	}

	/**
	 * Returns the phieu muon remote service.
	 *
	 * @return the phieu muon remote service
	 */
	public com.thuvien.service.PhieuMuonService getPhieuMuonService() {
		return phieuMuonService;
	}

	/**
	 * Sets the phieu muon remote service.
	 *
	 * @param phieuMuonService the phieu muon remote service
	 */
	public void setPhieuMuonService(
		com.thuvien.service.PhieuMuonService phieuMuonService) {
		this.phieuMuonService = phieuMuonService;
	}

	/**
	 * Returns the phieu muon persistence.
	 *
	 * @return the phieu muon persistence
	 */
	public PhieuMuonPersistence getPhieuMuonPersistence() {
		return phieuMuonPersistence;
	}

	/**
	 * Sets the phieu muon persistence.
	 *
	 * @param phieuMuonPersistence the phieu muon persistence
	 */
	public void setPhieuMuonPersistence(
		PhieuMuonPersistence phieuMuonPersistence) {
		this.phieuMuonPersistence = phieuMuonPersistence;
	}

	/**
	 * Returns the phieu muon finder.
	 *
	 * @return the phieu muon finder
	 */
	public PhieuMuonFinder getPhieuMuonFinder() {
		return phieuMuonFinder;
	}

	/**
	 * Sets the phieu muon finder.
	 *
	 * @param phieuMuonFinder the phieu muon finder
	 */
	public void setPhieuMuonFinder(PhieuMuonFinder phieuMuonFinder) {
		this.phieuMuonFinder = phieuMuonFinder;
	}

	/**
	 * Returns the phuong thanh pho local service.
	 *
	 * @return the phuong thanh pho local service
	 */
	public com.thuvien.service.PhuongThanhPhoLocalService getPhuongThanhPhoLocalService() {
		return phuongThanhPhoLocalService;
	}

	/**
	 * Sets the phuong thanh pho local service.
	 *
	 * @param phuongThanhPhoLocalService the phuong thanh pho local service
	 */
	public void setPhuongThanhPhoLocalService(
		com.thuvien.service.PhuongThanhPhoLocalService phuongThanhPhoLocalService) {
		this.phuongThanhPhoLocalService = phuongThanhPhoLocalService;
	}

	/**
	 * Returns the phuong thanh pho remote service.
	 *
	 * @return the phuong thanh pho remote service
	 */
	public com.thuvien.service.PhuongThanhPhoService getPhuongThanhPhoService() {
		return phuongThanhPhoService;
	}

	/**
	 * Sets the phuong thanh pho remote service.
	 *
	 * @param phuongThanhPhoService the phuong thanh pho remote service
	 */
	public void setPhuongThanhPhoService(
		com.thuvien.service.PhuongThanhPhoService phuongThanhPhoService) {
		this.phuongThanhPhoService = phuongThanhPhoService;
	}

	/**
	 * Returns the phuong thanh pho persistence.
	 *
	 * @return the phuong thanh pho persistence
	 */
	public PhuongThanhPhoPersistence getPhuongThanhPhoPersistence() {
		return phuongThanhPhoPersistence;
	}

	/**
	 * Sets the phuong thanh pho persistence.
	 *
	 * @param phuongThanhPhoPersistence the phuong thanh pho persistence
	 */
	public void setPhuongThanhPhoPersistence(
		PhuongThanhPhoPersistence phuongThanhPhoPersistence) {
		this.phuongThanhPhoPersistence = phuongThanhPhoPersistence;
	}

	/**
	 * Returns the quan thanh pho local service.
	 *
	 * @return the quan thanh pho local service
	 */
	public com.thuvien.service.QuanThanhPhoLocalService getQuanThanhPhoLocalService() {
		return quanThanhPhoLocalService;
	}

	/**
	 * Sets the quan thanh pho local service.
	 *
	 * @param quanThanhPhoLocalService the quan thanh pho local service
	 */
	public void setQuanThanhPhoLocalService(
		com.thuvien.service.QuanThanhPhoLocalService quanThanhPhoLocalService) {
		this.quanThanhPhoLocalService = quanThanhPhoLocalService;
	}

	/**
	 * Returns the quan thanh pho remote service.
	 *
	 * @return the quan thanh pho remote service
	 */
	public com.thuvien.service.QuanThanhPhoService getQuanThanhPhoService() {
		return quanThanhPhoService;
	}

	/**
	 * Sets the quan thanh pho remote service.
	 *
	 * @param quanThanhPhoService the quan thanh pho remote service
	 */
	public void setQuanThanhPhoService(
		com.thuvien.service.QuanThanhPhoService quanThanhPhoService) {
		this.quanThanhPhoService = quanThanhPhoService;
	}

	/**
	 * Returns the quan thanh pho persistence.
	 *
	 * @return the quan thanh pho persistence
	 */
	public QuanThanhPhoPersistence getQuanThanhPhoPersistence() {
		return quanThanhPhoPersistence;
	}

	/**
	 * Sets the quan thanh pho persistence.
	 *
	 * @param quanThanhPhoPersistence the quan thanh pho persistence
	 */
	public void setQuanThanhPhoPersistence(
		QuanThanhPhoPersistence quanThanhPhoPersistence) {
		this.quanThanhPhoPersistence = quanThanhPhoPersistence;
	}

	/**
	 * Returns the sach local service.
	 *
	 * @return the sach local service
	 */
	public com.thuvien.service.SachLocalService getSachLocalService() {
		return sachLocalService;
	}

	/**
	 * Sets the sach local service.
	 *
	 * @param sachLocalService the sach local service
	 */
	public void setSachLocalService(
		com.thuvien.service.SachLocalService sachLocalService) {
		this.sachLocalService = sachLocalService;
	}

	/**
	 * Returns the sach remote service.
	 *
	 * @return the sach remote service
	 */
	public com.thuvien.service.SachService getSachService() {
		return sachService;
	}

	/**
	 * Sets the sach remote service.
	 *
	 * @param sachService the sach remote service
	 */
	public void setSachService(com.thuvien.service.SachService sachService) {
		this.sachService = sachService;
	}

	/**
	 * Returns the sach persistence.
	 *
	 * @return the sach persistence
	 */
	public SachPersistence getSachPersistence() {
		return sachPersistence;
	}

	/**
	 * Sets the sach persistence.
	 *
	 * @param sachPersistence the sach persistence
	 */
	public void setSachPersistence(SachPersistence sachPersistence) {
		this.sachPersistence = sachPersistence;
	}

	/**
	 * Returns the sach finder.
	 *
	 * @return the sach finder
	 */
	public SachFinder getSachFinder() {
		return sachFinder;
	}

	/**
	 * Sets the sach finder.
	 *
	 * @param sachFinder the sach finder
	 */
	public void setSachFinder(SachFinder sachFinder) {
		this.sachFinder = sachFinder;
	}

	/**
	 * Returns the the loai local service.
	 *
	 * @return the the loai local service
	 */
	public com.thuvien.service.TheLoaiLocalService getTheLoaiLocalService() {
		return theLoaiLocalService;
	}

	/**
	 * Sets the the loai local service.
	 *
	 * @param theLoaiLocalService the the loai local service
	 */
	public void setTheLoaiLocalService(
		com.thuvien.service.TheLoaiLocalService theLoaiLocalService) {
		this.theLoaiLocalService = theLoaiLocalService;
	}

	/**
	 * Returns the the loai remote service.
	 *
	 * @return the the loai remote service
	 */
	public com.thuvien.service.TheLoaiService getTheLoaiService() {
		return theLoaiService;
	}

	/**
	 * Sets the the loai remote service.
	 *
	 * @param theLoaiService the the loai remote service
	 */
	public void setTheLoaiService(
		com.thuvien.service.TheLoaiService theLoaiService) {
		this.theLoaiService = theLoaiService;
	}

	/**
	 * Returns the the loai persistence.
	 *
	 * @return the the loai persistence
	 */
	public TheLoaiPersistence getTheLoaiPersistence() {
		return theLoaiPersistence;
	}

	/**
	 * Sets the the loai persistence.
	 *
	 * @param theLoaiPersistence the the loai persistence
	 */
	public void setTheLoaiPersistence(TheLoaiPersistence theLoaiPersistence) {
		this.theLoaiPersistence = theLoaiPersistence;
	}

	/**
	 * Returns the the loai finder.
	 *
	 * @return the the loai finder
	 */
	public TheLoaiFinder getTheLoaiFinder() {
		return theLoaiFinder;
	}

	/**
	 * Sets the the loai finder.
	 *
	 * @param theLoaiFinder the the loai finder
	 */
	public void setTheLoaiFinder(TheLoaiFinder theLoaiFinder) {
		this.theLoaiFinder = theLoaiFinder;
	}

	/**
	 * Returns the tinh thanh pho local service.
	 *
	 * @return the tinh thanh pho local service
	 */
	public com.thuvien.service.TinhThanhPhoLocalService getTinhThanhPhoLocalService() {
		return tinhThanhPhoLocalService;
	}

	/**
	 * Sets the tinh thanh pho local service.
	 *
	 * @param tinhThanhPhoLocalService the tinh thanh pho local service
	 */
	public void setTinhThanhPhoLocalService(
		com.thuvien.service.TinhThanhPhoLocalService tinhThanhPhoLocalService) {
		this.tinhThanhPhoLocalService = tinhThanhPhoLocalService;
	}

	/**
	 * Returns the tinh thanh pho remote service.
	 *
	 * @return the tinh thanh pho remote service
	 */
	public com.thuvien.service.TinhThanhPhoService getTinhThanhPhoService() {
		return tinhThanhPhoService;
	}

	/**
	 * Sets the tinh thanh pho remote service.
	 *
	 * @param tinhThanhPhoService the tinh thanh pho remote service
	 */
	public void setTinhThanhPhoService(
		com.thuvien.service.TinhThanhPhoService tinhThanhPhoService) {
		this.tinhThanhPhoService = tinhThanhPhoService;
	}

	/**
	 * Returns the tinh thanh pho persistence.
	 *
	 * @return the tinh thanh pho persistence
	 */
	public TinhThanhPhoPersistence getTinhThanhPhoPersistence() {
		return tinhThanhPhoPersistence;
	}

	/**
	 * Sets the tinh thanh pho persistence.
	 *
	 * @param tinhThanhPhoPersistence the tinh thanh pho persistence
	 */
	public void setTinhThanhPhoPersistence(
		TinhThanhPhoPersistence tinhThanhPhoPersistence) {
		this.tinhThanhPhoPersistence = tinhThanhPhoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.thuvien.model.PhuongThanhPho",
			phuongThanhPhoLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.thuvien.model.PhuongThanhPho");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return PhuongThanhPho.class;
	}

	protected String getModelClassName() {
		return PhuongThanhPho.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = phuongThanhPhoPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.thuvien.service.GiaHanLocalService.class)
	protected com.thuvien.service.GiaHanLocalService giaHanLocalService;
	@BeanReference(type = com.thuvien.service.GiaHanService.class)
	protected com.thuvien.service.GiaHanService giaHanService;
	@BeanReference(type = GiaHanPersistence.class)
	protected GiaHanPersistence giaHanPersistence;
	@BeanReference(type = GiaHanFinder.class)
	protected GiaHanFinder giaHanFinder;
	@BeanReference(type = com.thuvien.service.PhieuMuonLocalService.class)
	protected com.thuvien.service.PhieuMuonLocalService phieuMuonLocalService;
	@BeanReference(type = com.thuvien.service.PhieuMuonService.class)
	protected com.thuvien.service.PhieuMuonService phieuMuonService;
	@BeanReference(type = PhieuMuonPersistence.class)
	protected PhieuMuonPersistence phieuMuonPersistence;
	@BeanReference(type = PhieuMuonFinder.class)
	protected PhieuMuonFinder phieuMuonFinder;
	@BeanReference(type = com.thuvien.service.PhuongThanhPhoLocalService.class)
	protected com.thuvien.service.PhuongThanhPhoLocalService phuongThanhPhoLocalService;
	@BeanReference(type = com.thuvien.service.PhuongThanhPhoService.class)
	protected com.thuvien.service.PhuongThanhPhoService phuongThanhPhoService;
	@BeanReference(type = PhuongThanhPhoPersistence.class)
	protected PhuongThanhPhoPersistence phuongThanhPhoPersistence;
	@BeanReference(type = com.thuvien.service.QuanThanhPhoLocalService.class)
	protected com.thuvien.service.QuanThanhPhoLocalService quanThanhPhoLocalService;
	@BeanReference(type = com.thuvien.service.QuanThanhPhoService.class)
	protected com.thuvien.service.QuanThanhPhoService quanThanhPhoService;
	@BeanReference(type = QuanThanhPhoPersistence.class)
	protected QuanThanhPhoPersistence quanThanhPhoPersistence;
	@BeanReference(type = com.thuvien.service.SachLocalService.class)
	protected com.thuvien.service.SachLocalService sachLocalService;
	@BeanReference(type = com.thuvien.service.SachService.class)
	protected com.thuvien.service.SachService sachService;
	@BeanReference(type = SachPersistence.class)
	protected SachPersistence sachPersistence;
	@BeanReference(type = SachFinder.class)
	protected SachFinder sachFinder;
	@BeanReference(type = com.thuvien.service.TheLoaiLocalService.class)
	protected com.thuvien.service.TheLoaiLocalService theLoaiLocalService;
	@BeanReference(type = com.thuvien.service.TheLoaiService.class)
	protected com.thuvien.service.TheLoaiService theLoaiService;
	@BeanReference(type = TheLoaiPersistence.class)
	protected TheLoaiPersistence theLoaiPersistence;
	@BeanReference(type = TheLoaiFinder.class)
	protected TheLoaiFinder theLoaiFinder;
	@BeanReference(type = com.thuvien.service.TinhThanhPhoLocalService.class)
	protected com.thuvien.service.TinhThanhPhoLocalService tinhThanhPhoLocalService;
	@BeanReference(type = com.thuvien.service.TinhThanhPhoService.class)
	protected com.thuvien.service.TinhThanhPhoService tinhThanhPhoService;
	@BeanReference(type = TinhThanhPhoPersistence.class)
	protected TinhThanhPhoPersistence tinhThanhPhoPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private PhuongThanhPhoLocalServiceClpInvoker _clpInvoker = new PhuongThanhPhoLocalServiceClpInvoker();
}