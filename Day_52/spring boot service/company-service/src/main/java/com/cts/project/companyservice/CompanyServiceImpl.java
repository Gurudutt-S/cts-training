package com.cts.project.companyservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepo companyRepo;

	@Override
	public List<CompanyDTO> getAllCompanies() {
		
		return null;
	}

	@Override
	public CompanyDTO getCompanyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompanyDTO saveCompany(CompanyDTO company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompany(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CompanyDTO updateCompany(CompanyDTO company) {
		// TODO Auto-generated method stub
		return null;
	}

}
