package com.liferay.h7g5.service.persistence.impl;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.H7G5EntryLocalServiceUtil;
import com.liferay.h7g5.service.persistence.H7G5EntryFinder;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import org.osgi.service.component.annotations.Component;

import java.util.List;
@Component(
        service = H7G5EntryFinder.class
)

public class H7G5EntryFinderImpl extends H7G5EntryPersistenceImpl implements H7G5EntryFinder{

    public List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId){
        Session session = null;
        List<H7G5Entry> entries = null;
        try{
            session = openSession();
            ClassLoader cl = getClass().getClassLoader();
            DynamicQuery dQ = DynamicQueryFactoryUtil.forClass(H7G5Entry.class , cl
            ).add(RestrictionsFactoryUtil.eq("h7g5FolderId",h7g5FolderId));
            entries = H7G5EntryLocalServiceUtil.dynamicQuery(dQ);
        }catch (Exception e) {
        try {
            throw new SystemException(e);
        }
        catch (SystemException se) {
            se.printStackTrace();
        }
    }finally {
        closeSession(session);
    }
    return entries;
}

public List<H7G5Entry> findByName(String h7g5Name){
    Session session = null;
    List<H7G5Entry> entries = null;
    try{
        session = openSession();
        ClassLoader cl = getClass().getClassLoader();
        DynamicQuery dQ = DynamicQueryFactoryUtil.forClass(H7G5Entry.class , cl
        ).add(RestrictionsFactoryUtil.eq("name",h7g5Name));
        entries = H7G5EntryLocalServiceUtil.dynamicQuery(dQ);
    }catch (Exception e) {
    try {
        throw new SystemException(e);
    }
    catch (SystemException se) {
        se.printStackTrace();
    }
}finally {
    closeSession(session);
}
return entries;
}

public H7G5Entry findByKey(String h7g5Key){
    Session session = null;
    List<H7G5Entry> entries = null;
    try{
        session = openSession();
        ClassLoader cl = getClass().getClassLoader();
        DynamicQuery dQ = DynamicQueryFactoryUtil.forClass(H7G5Entry.class , cl
        ).add(RestrictionsFactoryUtil.eq("key_",h7g5Key));
        entries = H7G5EntryLocalServiceUtil.dynamicQuery(dQ);
    }catch (Exception e) {
    try {
        throw new SystemException(e);
    }
    catch (SystemException se) {
        se.printStackTrace();
    }
}finally {
    closeSession(session);
}
return entries.get(0);
}



public H7G5Entry findByH_D_N(long h7g5FolderId, String h7g5Description , String h7g5Name){
    Session session = null;
    List<H7G5Entry> entries = null;
    try{
        session = openSession();
        ClassLoader cl = getClass().getClassLoader();
        DynamicQuery dQ = DynamicQueryFactoryUtil.forClass(H7G5Entry.class , cl
        ).add(RestrictionsFactoryUtil.eq("h7g5FolderId",h7g5FolderId))
        .add(RestrictionsFactoryUtil.eq("description",h7g5Description))
        .add(RestrictionsFactoryUtil.eq("name",h7g5Name));
        entries = H7G5EntryLocalServiceUtil.dynamicQuery(dQ);
    }catch (Exception e) {
    try {
        throw new SystemException(e);
    }
    catch (SystemException se) {
        se.printStackTrace();
    }
}finally {
    closeSession(session);
}
return entries.get(0);
}

}