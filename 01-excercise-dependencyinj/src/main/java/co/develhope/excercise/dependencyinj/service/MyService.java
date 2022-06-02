package co.develhope.excercise.dependencyinj.service;

import co.develhope.excercise.dependencyinj.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;


    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService construc called");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }

}
