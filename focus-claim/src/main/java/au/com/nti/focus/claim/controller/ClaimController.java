package au.com.nti.focus.claim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.nti.focus.claim.model.Claim;
import au.com.nti.focus.claim.service.ClaimService;

@RestController
@RequestMapping("/claims")
public class ClaimController {

	@Autowired
	private ClaimService claimService;

	@PostMapping
	public Claim createClaim(Claim claim) {
		return claimService.createClaim(claim);
	}

	@GetMapping("/{id}")
	public Claim getClaim(@PathVariable Long id) {
		return claimService.findClaim(id);
	}
	
	@PutMapping("/{id}")
	public Claim updateClaim(@PathVariable Long id, Claim claim) {
		return claimService.updateClaim(claim);
	}

	@DeleteMapping("/{id}")
	public void deleteClaim(@PathVariable Long id) {
		claimService.deleteClaim(id);
	}

	@GetMapping
	public List<Claim> findAllClaims() {
		return claimService.findAllClaims();
	}
}
