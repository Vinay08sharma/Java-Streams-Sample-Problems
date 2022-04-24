

// If there is not data inside @interface -- Marker Annotation
// IF there is 1 method -- Single Value Annotation
// If there is more than 1 method -- Multi Value Annotation

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Below annotations are called as Meta Annotations
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String os() default "Android";
    int version() default 6;
}

@SmartPhone
class Samsung {

    String model;
    int size;
    public Samsung(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

public class Java_Interface_Annotation {

    public static void main(String[] args) {
        Samsung samsung = new Samsung("Galaxy", 5);
        SmartPhone annotation = samsung.getClass().getAnnotation(SmartPhone.class);
        SmartPhone annotation1 = (SmartPhone) annotation;
        System.out.println(annotation1.os());
        System.out.println(annotation1.version());
    }
}