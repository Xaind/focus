package au.com.nti.focus.policy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.nti.focus.policy.model.Policy;
import au.com.nti.focus.policy.repository.PolicyRepository;

@Service
@Transactional
public class PolicyService {

	private PolicyRepository policyRepository;
	
	@Autowired
	public PolicyService(PolicyRepository policyRepository) {
		this.policyRepository = policyRepository;
	}
	
	public Policy createPolicy(Policy policy) {
		return policyRepository.save(policy);
	} 
	
	public Policy updatePolicy(Policy policy) {
		return policyRepository.save(policy);
	}
	
	public void deletePolicy(Long id) {
		policyRepository.delete(id);
	}
	
	public Policy findPolicy(Long id) {
		return policyRepository.findOne(id);
	}
	
	public List<Policy> findAllPolicies() {
		return policyRepository.findAll();
	}
}
