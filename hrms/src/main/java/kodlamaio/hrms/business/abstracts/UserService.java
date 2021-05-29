package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.entities.concretes.User;



public interface UserService extends BaseService<User>{
	
	DataResult<User> getUserByEmail(String email);
	
}
