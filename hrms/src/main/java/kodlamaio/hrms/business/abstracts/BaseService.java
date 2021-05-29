package kodlamaio.hrms.business.abstracts;


import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;

public interface BaseService<T> {
	
    DataResult<List<T>> getAll();
    Result add(T entity);
    
	

}
