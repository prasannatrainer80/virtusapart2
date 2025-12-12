package org.java.sb.circuitnewex;

import java.util.List;

public interface EmployService {

    List<Employ> showEmploy();
    Employ showEmployById(Long id);
    String addEmploy(Employ employ);
    String updateEmploy(Employ employ);
}
