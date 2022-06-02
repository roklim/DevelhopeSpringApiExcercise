package co.develhope.excercise.dependencyinj.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent() {
        System.out.println("constructor mycomp called");
        myComponentName = "Marco";
    }

    public String getMyComponentName() {
        System.out.println("funct getcompname  called");
        return myComponentName;
    }
}
