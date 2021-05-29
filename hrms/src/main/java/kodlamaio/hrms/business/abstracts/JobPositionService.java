package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService extends BaseService<JobPosition>{

	DataResult<JobPosition> getJobByTitle(String title);
}
