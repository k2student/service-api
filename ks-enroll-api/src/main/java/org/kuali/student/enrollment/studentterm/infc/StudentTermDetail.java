/*
 * Copyright 2014 The Kuali Foundation 
 *
 * Licensed under the Educational Community License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.kuali.student.enrollment.studentterm.infc;

import org.kuali.student.r2.common.infc.Relationship;
import org.kuali.student.r2.common.infc.TimeAmount;
import org.kuali.student.r2.common.infc.RichText;

import java.util.Date;
import java.util.List;

/**
 * This is a view of a student's course registrations in a term.
 *
 * For now, this is scoped to information derived from Course
 * Registration and related entities. Cumulatives and other cross-Term
 * progress is in the Academic Record.
 */

public interface StudentTermDetail
    extends Relationship {

    /**
     * Student Id to which this record pertains.
     *
     * @name Student Id
     * @required
     * @readonly
     */
    public String getPersonId();

    /**
     * Term Id to which this record pertains.
     *
     * @name Term Id
     * @required
     * @readonly
     */
    public String getTermId();

    /**
     * A placeholder for messages to the student such as exceeded
     * credit limit or ineligible to register.
     *
     * @name Messages
     * @readonly
     */
    public List<RichText> getMessages();

    /**
     * Course Registration Detail.
     *
     * @name Course Registration Detail
     * @readonly
     */
    public List<CourseRegistrationDetail> getCourseRegsitrationDetail();
}
