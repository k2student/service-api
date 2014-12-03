

package org.kuali.student.enrollment.academicrecord.infc;

import org.kuali.rice.core.api.util.type.KualiDecimal;
import org.kuali.student.r2.common.infc.Relationship;

import java.util.Date;
import java.util.List;

/**
 *  A StudentTermRecord is a summary of a student's status in a
 *  specific term. 
 */

public interface StudentTermRecord 
    extends Relationship {

    /**
     * The Id of the Student.
     *
     * @name Person Id
     * @readOnly
     * @required
     */
    public String getPersonId();

    /**
     * The Id of the Program in which the student is/was
     * enrolled.
     *
     * @name Program Id
     */
    public String getProgramId();

    /**
     * The term Id for this record.
     *
     * @name Term Id
     */
    public String getTermId();

    /**
     * The Id of the Program Offering in which the student is/was
     * enrolled.
     *
     * @name Program Offering Id
     */
    public String getProgramOfferingId();

    /** 
     *  Tests if the student is eligible to register for this term.
     *
     *  @return true if the student is eligible to register, false
     *           if ineligable to register
     *  @name Is Eligible To Register
     */    
    public Boolean getIsEligibleToRegister();

    /** 
     *  Tests if the student is registered for this term.
     *
     *  @return true if the student is registered, false
     *          the student has not registered
     *  @name Is Registered
     */    
    public Boolean getIsRegistered();

    /**
     * The number of credits the student has attempted in the program
     * this term. 
     *
     * @name Credits Attempted
     */
    public KualiDecimal getCreditsAttempted();

    /**
     * The number of credits the student has earned in the program
     * this term.
     *
     * @name Credits Earned
     */
    public KualiDecimal getCreditsEarned();

    /**
     * The number of credits the student can apply to this program
     * this term.
     *
     * @name Credits Earned
     */
    public KualiDecimal getCreditsAccepted();

    /**
     * Gets the student GPA for this program and term.
     *
     * @name GPA
     */
    public GPA getGPA();

    /** 
     *  Tests if the student has satisfactory progress,
     *
     *  @return true if the student has satisfactory progress, false
     *          if the student has unsatisfactory progress
     *  @name Has Satisfactory Progress
     */    
    public Boolean getHasSatisfactoryProgress();
}
