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

package com.liferay.h7g5.service.http;

import com.liferay.h7g5.service.H7G5EntryServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>H7G5EntryServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class H7G5EntryServiceHttp {

	public static com.liferay.h7g5.model.H7G5Entry addCreateOps(
			HttpPrincipal httpPrincipal, String description, String name,
			long h7g5FolderId, String key)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "addCreateOps",
				_addCreateOpsParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, description, name, h7g5FolderId, key);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry deleteOps(
			HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "deleteOps",
				_deleteOpsParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry fetchOps(
			HttpPrincipal httpPrincipal, long Id)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "fetchOps",
				_fetchOpsParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, Id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry updateOps(
			HttpPrincipal httpPrincipal, long id, String description,
			String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "updateOps",
				_updateOpsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, description, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static int getH7G5EntriesCount(HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "getH7G5EntriesCount",
				_getH7G5EntriesCountParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry userPermissionCheck(
			HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "userPermissionCheck",
				_userPermissionCheckParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.h7g5.model.H7G5Entry>
		getDynamicData(HttpPrincipal httpPrincipal, long id) {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "getDynamicData",
				_getDynamicDataParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.h7g5.model.H7G5Entry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.h7g5.model.H7G5Entry>
		getDynamicNameData(HttpPrincipal httpPrincipal, String Name) {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "getDynamicNameData",
				_getDynamicNameDataParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, Name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.h7g5.model.H7G5Entry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry getDynamicKeyData(
		HttpPrincipal httpPrincipal, String Key) {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "getDynamicKeyData",
				_getDynamicKeyDataParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, Key);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry getDyanmicH_D_NData(
		HttpPrincipal httpPrincipal, long id, String Description, String Name) {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "getDyanmicH_D_NData",
				_getDyanmicH_D_NDataParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, id, Description, Name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(H7G5EntryServiceHttp.class);

	private static final Class<?>[] _addCreateOpsParameterTypes0 = new Class[] {
		String.class, String.class, long.class, String.class
	};
	private static final Class<?>[] _deleteOpsParameterTypes1 = new Class[] {
		long.class
	};
	private static final Class<?>[] _fetchOpsParameterTypes2 = new Class[] {
		long.class
	};
	private static final Class<?>[] _updateOpsParameterTypes3 = new Class[] {
		long.class, String.class, String.class
	};
	private static final Class<?>[] _getH7G5EntriesCountParameterTypes4 =
		new Class[] {};
	private static final Class<?>[] _userPermissionCheckParameterTypes5 =
		new Class[] {};
	private static final Class<?>[] _getDynamicDataParameterTypes6 =
		new Class[] {long.class};
	private static final Class<?>[] _getDynamicNameDataParameterTypes7 =
		new Class[] {String.class};
	private static final Class<?>[] _getDynamicKeyDataParameterTypes8 =
		new Class[] {String.class};
	private static final Class<?>[] _getDyanmicH_D_NDataParameterTypes9 =
		new Class[] {long.class, String.class, String.class};

}