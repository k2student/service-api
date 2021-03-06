/*
 * Copyright 2012 The Kuali Foundation Licensed under the
 *  Educational Community License, Version 2.0 (the "License"); you may
 *  not use this file except in compliance with the License. You may
 *  obtain a copy of the License at
 *
 *   http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.kuali.student.core.constants;

import org.kuali.student.core.ges.service.GesServiceNamespace;

/**
 * This class holds the constants used by the Scheduling service
 *
 * @Version 1.0
 */
public class GesServiceConstants
        extends GesServiceNamespace {

    // Value Types
    // ----------------
    public static final String GES_VALUE_TYPE_KEY = "kuali.ges.value.type";

    // Parameter Types
    // -------------------
    public static final String GES_PARAMETER_TYPE_KEY = "kuali.ges.parameter.type";
    public static final String GES_PARAMETER_TYPE_COURSE_KEY = "kuali.ges.parameter.type.course";

    // Parameter Group Types
    // -------------------------
    public static final String GES_PARAMETER_GROUP_TYPE_KEY = "kuali.ges.parametergroup.type";

    // Value States
    // -----------------
    public static final String GES_VALUE_ACTIVE_STATE_KEY = "kuali.ges.value.state.active";
    public static final String GES_VALUE_INACTIVE_STATE_KEY = "kuali.ges.value.state.inactive";

    // Parameter States
    // --------------------
    public static final String GES_PARAMETER_ACTIVE_STATE_KEY = "kuali.ges.parameter.state.active";
    public static final String GES_PARAMETER_INACTIVE_STATE_KEY = "kuali.ges.parameter.state.inactive";

    // Parameter Group States
    // -------------------------
    public static final String GES_PARAMETER_GROUP_ACTIVE_STATE_KEY = "kuali.ges.parametergroup.state.active";

    // Parameter Group Keys
    // -------------------------
    public static final String GES_PARAMETER_GROUP_KEY_ROLLOVER = "kuali.student.ges.parametergroup.key.rollover";

    /**
     * known parameters
     */
    public static final String PARAMETER_KEY_CREDIT_MINIMUM = "kuali.ges.credit.minimum";
    public static final String PARAMETER_KEY_CREDIT_LIMIT = "kuali.ges.credit.limit";
    public static final String PARAMETER_KEY_LOAD_CALCULATION_FOR_CREDIT_CHECKS = "kuali.ges.load.calculation.for.credit.checks";
    public static final String PARAMETER_KEY_CLASS_STANDING_CREDIT_THRESHOLDS = "kuali.ges.class.standing.credit.thresholds";

    // Rollover Priorities
    // ------------------------
    public static final String GES_ROLLOVER_PRIORITY_LEVEL_HARD_RULE = "100";
    public static final String GES_ROLLOVER_PRIORITY_LEVEL_COURSE = "200";
    public static final String GES_ROLLOVER_PRIORITY_LEVEL_SUBJECT_CODE = "300";
    public static final String GES_ROLLOVER_PRIORITY_LEVEL_ORG_COURSE = "400";
    public static final String GES_ROLLOVER_PRIORITY_LEVEL_GENERAL = "600";
}
