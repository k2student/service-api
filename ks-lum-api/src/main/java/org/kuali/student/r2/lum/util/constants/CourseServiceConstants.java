package org.kuali.student.r2.lum.util.constants;


import org.kuali.student.r2.common.constants.CommonServiceConstants;
import org.kuali.student.r2.lum.course.dto.CourseInfo;

/**
 * Course Service constants.
 * 
 * @author Kuali Student Team (sambitpa@kuali.org)
 */
public class CourseServiceConstants {
    public static final String NAMESPACE = CommonServiceConstants.REF_OBJECT_URI_GLOBAL_PREFIX + "course";
    public static final String REF_OBJECT_URI_COURSE = NAMESPACE + "/" + CourseInfo.class.getSimpleName();
    public static final String SERVICE_NAME_LOCAL_PART = "CourseService";
    public static final String COURSE_NAMESPACE = "http://student.kuali.org/wsdl/course";
    public static final String COURSE_NAMESPACE_URI = "{" + COURSE_NAMESPACE + "}courseInfo";


}
