//created by Toyeeb
package org.openmrs.module.patientqueueing.fragment.controller;

import org.openmrs.module.patientqueueing.mapper.PatientQueueMapper;

public class PatientQueueListResponse extends PatientQueueMapper {
	
	private static final long serialVersionUID = 1L;
	
	private boolean isProviderWithPharmacyRole;
	
	private boolean isProviderClinician;
	
	private boolean isProviderLab;
	
	private PatientQueueMapper patientQueueMapper;
	
	public PatientQueueListResponse() {
	}
	
	public PatientQueueListResponse(boolean isProviderWithPharmacyRole, boolean isProviderClinician, boolean isProviderLab) {
		super();
		this.isProviderWithPharmacyRole = isProviderWithPharmacyRole;
		this.isProviderClinician = isProviderClinician;
		this.isProviderLab = isProviderLab;
	}
	
	public boolean getIsProviderWithPharmacyRole() {
		return isProviderWithPharmacyRole;
	}
	
	public void setIsProviderWithPharmacyRole(boolean isProviderWithPharmacyRole) {
		this.isProviderWithPharmacyRole = isProviderWithPharmacyRole;
	}
	
	public PatientQueueMapper getPatientQueueMapper() {
		return patientQueueMapper;
	}
	
	public void setPatientQueueMapper(PatientQueueMapper patientQueueMapper) {
		this.patientQueueMapper = patientQueueMapper;
	}
	
	public boolean getIsProviderClinician() {
		return isProviderClinician;
	}
	
	public void setIsProviderClinician(boolean isProviderClinician) {
		this.isProviderClinician = isProviderClinician;
	}
	
	public boolean getIsProviderLab() {
		return isProviderLab;
	}
	
	public void setIsProviderLab(boolean isProviderLab) {
		this.isProviderLab = isProviderLab;
	}
	
}
