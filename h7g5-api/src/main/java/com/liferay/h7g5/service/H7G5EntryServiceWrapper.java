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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link H7G5EntryService}.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5EntryService
 * @generated
 */
public class H7G5EntryServiceWrapper
	implements H7G5EntryService, ServiceWrapper<H7G5EntryService> {

	public H7G5EntryServiceWrapper() {
		this(null);
	}

	public H7G5EntryServiceWrapper(H7G5EntryService h7g5EntryService) {
		_h7g5EntryService = h7g5EntryService;
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry addCreateOps(
			String description, String name, long h7g5FolderId, String key)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.addCreateOps(
			description, name, h7g5FolderId, key);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry deleteOps(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.deleteOps(id);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry fetchOps(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.fetchOps(Id);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry getDyanmicH_D_NData(
		long id, String Description, String Name) {

		return _h7g5EntryService.getDyanmicH_D_NData(id, Description, Name);
	}

	@Override
	public java.util.List<com.liferay.h7g5.model.H7G5Entry> getDynamicData(
		long id) {

		return _h7g5EntryService.getDynamicData(id);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry getDynamicKeyData(String Key) {
		return _h7g5EntryService.getDynamicKeyData(Key);
	}

	@Override
	public java.util.List<com.liferay.h7g5.model.H7G5Entry> getDynamicNameData(
		String Name) {

		return _h7g5EntryService.getDynamicNameData(Name);
	}

	@Override
	public int getH7G5EntriesCount() {
		return _h7g5EntryService.getH7G5EntriesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _h7g5EntryService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry updateOps(
			long id, String description, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.updateOps(id, description, name);
	}

	@Override
	public com.liferay.h7g5.model.H7G5Entry userPermissionCheck()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _h7g5EntryService.userPermissionCheck();
	}

	@Override
	public H7G5EntryService getWrappedService() {
		return _h7g5EntryService;
	}

	@Override
	public void setWrappedService(H7G5EntryService h7g5EntryService) {
		_h7g5EntryService = h7g5EntryService;
	}

	private H7G5EntryService _h7g5EntryService;

}