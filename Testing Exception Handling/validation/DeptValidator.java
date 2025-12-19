package validation;

import java.util.Arrays;
import java.util.List;

public class DeptValidator {
    public static void validate(String dept) throws InvalidDeptException {
        List<String> validDepts = Arrays.asList("CSE", "ICT","ICE","ME","TE");
        if (!validDepts.contains(dept)) {
            throw new InvalidDeptException("Dept. CSE, ICT, ICE, ME or TE may be");
        }
    }
}