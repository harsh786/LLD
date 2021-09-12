package LLDProblems.BillSharingApp.Interfaces;

import LLDProblems.BillSharingApp.Exceptions.BillSharingException;
import LLDProblems.BillSharingApp.SplitDetailsDto;

public interface IBillSharingValidationService {
    public void isBillCanSplit(SplitDetailsDto splitDetailsDto) throws BillSharingException;
}
