package au.com.nti.focus.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import au.com.nti.focus.claim.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
