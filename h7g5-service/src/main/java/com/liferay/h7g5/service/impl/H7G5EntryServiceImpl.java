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

package com.liferay.h7g5.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.h7g5.service.H7G5EntryLocalServiceUtil;
import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.h7g5.model.H7G5Entry;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.model.User;

import java.util.List;
import java.util.Objects;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Entry"
	},
	service = AopService.class
)
public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {

public  H7G5Entry addCreateOps(String description, String name ,long h7g5FolderId , String key)throws PortalException{
		userPermissionCheck();
		System.out.println(
		"Invoking H7G5EntryServiceImpl#addMyCustomH7G5Folder(" +
			description + ", " + name + ")");

	H7G5Entry h7g5Entry = H7G5EntryLocalServiceUtil.createH7G5Entry(
		System.currentTimeMillis());

	h7g5Entry.setDescription(description);
	h7g5Entry.setName(name);
	h7g5Entry.setH7g5FolderId(h7g5FolderId);
	h7g5Entry.setKey(key);

	h7g5EntryLocalService.addH7G5Entry(h7g5Entry);

	return h7g5Entry;
	}
	

	public H7G5Entry deleteOps(long id)throws PortalException {
		userPermissionCheck();
		try{
		return H7G5EntryLocalServiceUtil.deleteH7G5Entry(id);

		}
		catch(Exception e){
			return null;
		}
	}

	public H7G5Entry fetchOps(long Id) throws PortalException {
		userPermissionCheck();
		return h7g5EntryLocalService.fetchH7G5Entry(Id);
	}
	
	public H7G5Entry updateOps(long id, String description, String name )throws PortalException {
		userPermissionCheck();
		H7G5Entry h7g5Entry = H7G5EntryLocalServiceUtil.fetchH7G5Entry(id);

	h7g5Entry.setDescription(description);
	h7g5Entry.setName(name);

		return h7g5EntryLocalService.updateH7G5Entry(h7g5Entry);
	}


	public int getH7G5EntriesCount() {
		return h7g5EntryLocalService.getH7G5EntriesCount();
	}



	public H7G5Entry userPermissionCheck()
	throws PortalException {

	User user = getUser();

	if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
		throw new PortalException("You are not test@liferay.com");
	}

	return null;
	}


	public List<H7G5Entry> getDynamicData(long id){
		return h7g5EntryLocalService.DynamicGetData(id);
	}

	public List<H7G5Entry> getDynamicNameData(String Name){
		return h7g5EntryLocalService.DynamicGetNameData(Name);
	}

	public H7G5Entry getDynamicKeyData(String Key)  {
		return h7g5EntryLocalService.DynamicGetKeyData(Key);
	}

	public H7G5Entry getDyanmicH_D_NData(long id , String Description , String Name){
		return h7g5EntryLocalService.DynamicGetH_G_NData(id, Description, Name);
	}

	

}