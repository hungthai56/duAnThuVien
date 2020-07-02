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

package com.thuvien.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PhuongThanhPhoLocalService}.
 *
 * @author ADMIN
 * @see PhuongThanhPhoLocalService
 * @generated
 */
public class PhuongThanhPhoLocalServiceWrapper
	implements PhuongThanhPhoLocalService,
		ServiceWrapper<PhuongThanhPhoLocalService> {
	public PhuongThanhPhoLocalServiceWrapper(
		PhuongThanhPhoLocalService phuongThanhPhoLocalService) {
		_phuongThanhPhoLocalService = phuongThanhPhoLocalService;
	}

	/**
	* Adds the phuong thanh pho to the database. Also notifies the appropriate model listeners.
	*
	* @param phuongThanhPho the phuong thanh pho
	* @return the phuong thanh pho that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.PhuongThanhPho addPhuongThanhPho(
		com.thuvien.model.PhuongThanhPho phuongThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.addPhuongThanhPho(phuongThanhPho);
	}

	/**
	* Creates a new phuong thanh pho with the primary key. Does not add the phuong thanh pho to the database.
	*
	* @param name the primary key for the new phuong thanh pho
	* @return the new phuong thanh pho
	*/
	@Override
	public com.thuvien.model.PhuongThanhPho createPhuongThanhPho(long name) {
		return _phuongThanhPhoLocalService.createPhuongThanhPho(name);
	}

	/**
	* Deletes the phuong thanh pho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param name the primary key of the phuong thanh pho
	* @return the phuong thanh pho that was removed
	* @throws PortalException if a phuong thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.PhuongThanhPho deletePhuongThanhPho(long name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.deletePhuongThanhPho(name);
	}

	/**
	* Deletes the phuong thanh pho from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongThanhPho the phuong thanh pho
	* @return the phuong thanh pho that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.PhuongThanhPho deletePhuongThanhPho(
		com.thuvien.model.PhuongThanhPho phuongThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.deletePhuongThanhPho(phuongThanhPho);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phuongThanhPhoLocalService.dynamicQuery();
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.dynamicQueryCount(dynamicQuery);
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
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.thuvien.model.PhuongThanhPho fetchPhuongThanhPho(long name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.fetchPhuongThanhPho(name);
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
	public com.thuvien.model.PhuongThanhPho getPhuongThanhPho(long name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.getPhuongThanhPho(name);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.thuvien.model.PhuongThanhPho> getPhuongThanhPhos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.getPhuongThanhPhos(start, end);
	}

	/**
	* Returns the number of phuong thanh phos.
	*
	* @return the number of phuong thanh phos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhuongThanhPhosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.getPhuongThanhPhosCount();
	}

	/**
	* Updates the phuong thanh pho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phuongThanhPho the phuong thanh pho
	* @return the phuong thanh pho that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.thuvien.model.PhuongThanhPho updatePhuongThanhPho(
		com.thuvien.model.PhuongThanhPho phuongThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongThanhPhoLocalService.updatePhuongThanhPho(phuongThanhPho);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phuongThanhPhoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phuongThanhPhoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phuongThanhPhoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhuongThanhPhoLocalService getWrappedPhuongThanhPhoLocalService() {
		return _phuongThanhPhoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhuongThanhPhoLocalService(
		PhuongThanhPhoLocalService phuongThanhPhoLocalService) {
		_phuongThanhPhoLocalService = phuongThanhPhoLocalService;
	}

	@Override
	public PhuongThanhPhoLocalService getWrappedService() {
		return _phuongThanhPhoLocalService;
	}

	@Override
	public void setWrappedService(
		PhuongThanhPhoLocalService phuongThanhPhoLocalService) {
		_phuongThanhPhoLocalService = phuongThanhPhoLocalService;
	}

	private PhuongThanhPhoLocalService _phuongThanhPhoLocalService;
}