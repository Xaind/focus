package au.com.nti.focus.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import au.com.nti.focus.policy.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
