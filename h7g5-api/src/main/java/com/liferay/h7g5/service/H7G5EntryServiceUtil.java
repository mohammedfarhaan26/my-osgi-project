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

import java.util.List;

/**
 * Provides the remote service utility for H7G5Entry. This utility wraps
 * <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5EntryService
 * @generated
 */
public class H7G5EntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static H7G5Entry addCreateOps(
			String description, String name, long h7g5FolderId, String key)
		throws PortalException {

		return getService().addCreateOps(description, name, h7g5FolderId, key);
	}

	public static H7G5Entry deleteOps(long id) throws PortalException {
		return getService().deleteOps(id);
	}

	public static H7G5Entry fetchOps(long Id) throws PortalException {
		return getService().fetchOps(Id);
	}

	public static H7G5Entry getDyanmicH_D_NData(
		long id, String Description, String Name) {

		return getService().getDyanmicH_D_NData(id, Description, Name);
	}

	public static List<H7G5Entry> getDynamicData(long id) {
		return getService().getDynamicData(id);
	}

	public static H7G5Entry getDynamicKeyData(String Key) {
		return getService().getDynamicKeyData(Key);
	}

	public static List<H7G5Entry> getDynamicNameData(String Name) {
		return getService().getDynamicNameData(Name);
	}

	public static int getH7G5EntriesCount() {
		return getService().getH7G5EntriesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static H7G5Entry updateOps(long id, String description, String name)
		throws PortalException {

		return getService().updateOps(id, description, name);
	}

	public static H7G5Entry userPermissionCheck() throws PortalException {
		return getService().userPermissionCheck();
	}

	public static H7G5EntryService getService() {
		return _service;
	}

	public static void setService(H7G5EntryService service) {
		_service = service;
	}

	private static volatile H7G5EntryService _service;

}