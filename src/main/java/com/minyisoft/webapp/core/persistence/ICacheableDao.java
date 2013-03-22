package com.minyisoft.webapp.core.persistence;

import com.minyisoft.webapp.core.model.IModelObject;
import com.minyisoft.webapp.core.model.criteria.BaseCriteria;

public interface ICacheableDao<T extends IModelObject, C extends BaseCriteria> extends IBaseDao<T, C> {
}
