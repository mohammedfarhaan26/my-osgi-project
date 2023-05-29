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

package com.liferay.h7g5.service;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for H7G5Entry. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5EntryServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface H7G5EntryService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the h7g5 entry remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link H7G5EntryServiceUtil} if injection and service tracking are not available.
	 */
	public H7G5Entry addCreateOps(
			String description, String name, long h7g5FolderId, String key)
		throws PortalException;

	public H7G5Entry deleteOps(long id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public H7G5Entry fetchOps(long Id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public H7G5Entry getDyanmicH_D_NData(
		long id, String Description, String Name);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<H7G5Entry> getDynamicData(long id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public H7G5Entry getDynamicKeyData(String Key);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<H7G5Entry> getDynamicNameData(String Name);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getH7G5EntriesCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public H7G5Entry updateOps(long id, String description, String name)
		throws PortalException;

	public H7G5Entry userPermissionCheck() throws PortalException;

}