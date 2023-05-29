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

package com.liferay.h7g5.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the H7G5Entry service. Represents a row in the &quot;OHQIWTSFHL_H7G5Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.h7g5.model.impl.H7G5EntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.h7g5.model.impl.H7G5EntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see H7G5Entry
 * @generated
 */
@ProviderType
public interface H7G5EntryModel
	extends BaseModel<H7G5Entry>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h7g5 entry model instance should use the {@link H7G5Entry} interface instead.
	 */

	/**
	 * Returns the primary key of this h7g5 entry.
	 *
	 * @return the primary key of this h7g5 entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h7g5 entry.
	 *
	 * @param primaryKey the primary key of this h7g5 entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the h7g5 entry ID of this h7g5 entry.
	 *
	 * @return the h7g5 entry ID of this h7g5 entry
	 */
	public long getH7g5EntryId();

	/**
	 * Sets the h7g5 entry ID of this h7g5 entry.
	 *
	 * @param h7g5EntryId the h7g5 entry ID of this h7g5 entry
	 */
	public void setH7g5EntryId(long h7g5EntryId);

	/**
	 * Returns the group ID of this h7g5 entry.
	 *
	 * @return the group ID of this h7g5 entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this h7g5 entry.
	 *
	 * @param groupId the group ID of this h7g5 entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this h7g5 entry.
	 *
	 * @return the company ID of this h7g5 entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this h7g5 entry.
	 *
	 * @param companyId the company ID of this h7g5 entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this h7g5 entry.
	 *
	 * @return the user ID of this h7g5 entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this h7g5 entry.
	 *
	 * @param userId the user ID of this h7g5 entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this h7g5 entry.
	 *
	 * @return the user uuid of this h7g5 entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this h7g5 entry.
	 *
	 * @param userUuid the user uuid of this h7g5 entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this h7g5 entry.
	 *
	 * @return the user name of this h7g5 entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this h7g5 entry.
	 *
	 * @param userName the user name of this h7g5 entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this h7g5 entry.
	 *
	 * @return the create date of this h7g5 entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this h7g5 entry.
	 *
	 * @param createDate the create date of this h7g5 entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this h7g5 entry.
	 *
	 * @return the modified date of this h7g5 entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h7g5 entry.
	 *
	 * @param modifiedDate the modified date of this h7g5 entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the h7g5 folder ID of this h7g5 entry.
	 *
	 * @return the h7g5 folder ID of this h7g5 entry
	 */
	public long getH7g5FolderId();

	/**
	 * Sets the h7g5 folder ID of this h7g5 entry.
	 *
	 * @param h7g5FolderId the h7g5 folder ID of this h7g5 entry
	 */
	public void setH7g5FolderId(long h7g5FolderId);

	/**
	 * Returns the description of this h7g5 entry.
	 *
	 * @return the description of this h7g5 entry
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h7g5 entry.
	 *
	 * @param description the description of this h7g5 entry
	 */
	public void setDescription(String description);

	/**
	 * Returns the key of this h7g5 entry.
	 *
	 * @return the key of this h7g5 entry
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this h7g5 entry.
	 *
	 * @param key the key of this h7g5 entry
	 */
	public void setKey(String key);

	/**
	 * Returns the name of this h7g5 entry.
	 *
	 * @return the name of this h7g5 entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h7g5 entry.
	 *
	 * @param name the name of this h7g5 entry
	 */
	public void setName(String name);

	@Override
	public H7G5Entry cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}