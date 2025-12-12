package org.java.sb;




import java.util.List;

public interface IEmployService {
    List<Employ> showEmploy();
    String addEmploy(Employ employ);
    Employ searchEmploy(int empno);
}

