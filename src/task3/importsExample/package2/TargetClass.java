package task3.importsExample.package2;

import task3.importsExample.package1.SourceClass;

public class TargetClass {

    public static void main(String[] args) {
        SourceClass source = new SourceClass();
        String value = source.sampleMethod();
        System.out.println(value);
    }
}
