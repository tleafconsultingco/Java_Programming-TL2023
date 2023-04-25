package studyGroup.constructor_0425t;

public class constructorNotes {

    //! SUMMARY: We went over the constructor quiz and discussed return types for methods.

    // 1. Can constructors be overloaded?
        //?? YES, but there needs to be different parameters in the constructors

    // 2. A constructor cannot be static, and constructor can return a value as long as the value is matching with its return type.
        //?? FALSE. Constructor does not have a return type or specifier.
        //-- All methods need a return type, constructor is a special method that does NOT have a return type.

    // 3. Constructor's execution always depends on the creation of the object.
        //?? TRUE. Constructor is only executed through objects.

    // 4. (Creating constructor)
        //?? See Q04_Test

    // 5. (Calling constructor)
        //?? See Q05_Test

    // 6. Every class must have at least one constructor, if no constructor is declared, then the compiler will through an exception during the runtime.
        //?? FALSE. If no constructor is declared then compiler will implicitly provide a default constructor. If a constructor is provided, then no default constructor will be provided by compiler.

    // 7. (Calling constructors, constructor chaining)
        //?? See Q07_Test

    // 8. (Constructor chaining)
        //?? See Q08_Test

    // 9. Select the following statements that are correct.
        // Constructor's name must be same with the class name.
            //?? TRUE. Constructor name can only be the class name.
        // Constructor's name can be any name.
            //&& FALSE. Constructor's name can ONLY be the class name.
        // Constructors only get executed one time only for all the objects of the class.
            //&& FALSE. Constructor is executed every time an object calls it.
        // Constructors can be used to create an object from the class.
            //?? TRUE. This is the main function of constructors.
        // Multiple constructors can be given to a class as long as the parameters are different.
            //?? TRUE. All constructors must have the class name, but the constructor can be overloaded with different parameters.
        // Every class must have two constructors, one no-arg constructor and one constructor with parameters.
            //&& FALSE. Every class must have at least ONE constructor (compiler will provide a default constructor if none is created), but a class can contain multiple overloaded constructors.

    // 10. (Constructor vs regular method)
        //?? See Q10_Test


}
