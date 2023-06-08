package studyGroup.encapsulation_inheritance_0502t;

public class inheritanceNotes {
    /*

    ?? Access modifiers protected vs default
        Protected can be inherited by child, think of parent protecting child by giving them access to their information

    ?? Advantages of static method
        Conserves memory and belongs to the class

    ?? Final vs static
        Static value can be changed, but when final keyword is used you cannot change the value

    ?? default parent class and public child class -- child cannot inherit methods from parent class because parent class is more restrictive

    ?? What is the use case for setting a method to private?
        Private cannot be inherited by child classes....

    ?? Final keyword is inherited but cannot be overridden
        You can only read, not change

    ?? constructor
        Parent constructor default is implicit, the child class constructor is implicitly called
        If parent constructor has a custom constructor, the child class must make a constructor and call the parent constructor using super() keyword. The child class cannot use a default constructor if the parent uses a custom constructor. There will be a compile error in extends.

     */
}
