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

import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.h7g5.service.persistence.impl.H7G5EntryFinderImpl;
import com.liferay.h7g5.model.H7G5Entry;
import org.osgi.service.component.annotations.Component;

import java.util.*;
/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.h7g5.model.H7G5Entry",
	service = AopService.class
)
public class H7G5EntryLocalServiceImpl extends H7G5EntryLocalServiceBaseImpl {

	public List<H7G5Entry> DynamicGetData(long id){
		return h7g5EntryFinder.findByH7G5FolderId(id);
	}

	public List<H7G5Entry> DynamicGetNameData(String Name){
		return h7g5EntryFinder.findByName(Name);
	}

	public H7G5Entry DynamicGetKeyData (String Key){
		return h7g5EntryFinder.findByKey(Key);
	}

	public H7G5Entry DynamicGetH_G_NData (long id , String Description , String Name){
		return h7g5EntryFinder.findByH_D_N(id, Description, Name);
	}
}