package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobseekerService extends BaseService<JobSeeker>{

	DataResult<JobSeeker> getJobseekerByNationalId(String nationalId);
}
