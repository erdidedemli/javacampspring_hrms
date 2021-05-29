package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	Result add(VerificationCode code);
}
