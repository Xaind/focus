package au.com.nti.focus.claim.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.nti.focus.claim.model.Claim;
import au.com.nti.focus.claim.repository.ClaimRepository;

@Service
@Transactional
public class ClaimService {

	private ClaimRepository claimRepository;
	
	@Autowired
	public ClaimService(ClaimRepository claimRepository) {
		this.claimRepository = claimRepository;
	}
	
	public Claim createClaim(Claim claim) {
		return claimRepository.save(claim);
	} 
	
	public Claim updateClaim(Claim claim) {
		return claimRepository.save(claim);
	}
	
	public void deleteClaim(Long id) {
		claimRepository.delete(id);
	}
	
	public Claim findClaim(Long id) {
		return claimRepository.findOne(id);
	}
	
	public List<Claim> findAllClaims() {
		return claimRepository.findAll();
	}
}
