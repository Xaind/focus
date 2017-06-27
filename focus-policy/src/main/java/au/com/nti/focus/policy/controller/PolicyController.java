package au.com.nti.focus.policy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.nti.focus.policy.model.Policy;
import au.com.nti.focus.policy.service.PolicyService;

@RestController
@RequestMapping("/policies")
public class PolicyController {

	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@Autowired
	private PolicyService policyService;

	@GetMapping("/info")
	public String getInstanceId() {
		return instanceId;
	}
	
	@PostMapping
	public Policy createPolicy(Policy policy) {
		return policyService.createPolicy(policy);
	}

	@GetMapping("/{id}")
	public Policy getPolicy(@PathVariable Long id) {
		return policyService.findPolicy(id);
	}
	
	@PutMapping("/{id}")
	public Policy updatePolicy(@PathVariable Long id, Policy policy) {
		return policyService.updatePolicy(policy);
	}

	@DeleteMapping("/{id}")
	public void deletePolicy(@PathVariable Long id) {
		policyService.deletePolicy(id);
	}

	@GetMapping
	public List<Policy> findAllPolicies() {
		return policyService.findAllPolicies();
	}
}
