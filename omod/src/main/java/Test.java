import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openmrs.Patient;
import org.openmrs.Visit;
import org.openmrs.api.context.Context;

public class Test {
	
	public static void main(String[] args) {
		
		//added by toyeeb        
		List<Visit> activeVisitList = new ArrayList<Visit>();
		List<Integer> visitlist = new ArrayList<Integer>();
		Patient patient = new Patient();
		patient.setPatientId(58);
		activeVisitList = Context.getVisitService().getActiveVisitsByPatient(patient);
		for (Visit v : activeVisitList) {
			visitlist.add(v.getVisitId());
		}
		Integer visitID = Collections.max(visitlist);
		Visit visit = new Visit();
		visit.setVisitId(visitID);
		System.out.println("Visit ID: " + visitID);
		System.out.println("Visit ID: " + visit.getVisitId());
		//end
		
	}
	
}
