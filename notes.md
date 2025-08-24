# function

-- function or method is a piece of code that is used to perform a specific task.

<hr>
<b>
|object is a instance of class
|class is a blueprint of class (the first letter of class should be always capitale)
</b>

# encapsulation

-- binding of data

# abstraction
-- hiding irrelevent data

# inheritence
-- child class inheriting properties of parent class
we have to create object of child class

## simple inheritence / single level inheritence.
## multi level inheritence
## hierarcial inheritence

# polymorphism
-- many forms & it's a core concept that allows a single action to be performed in different ways. It enables you to write more flexible and reusable code.

The most common way this is achieved in Java is through method overriding, which is also known as Runtime Polymorphism.

<hr>

|public -  access modifier(variable can be accesed outside the class)<br>
|static - don't want to mention or create object , only single copy<br>
|void - not returning anything. <b>also void here is a return type</b><br>
|String[] args - storing arguments<br>
<hr>

comparison operator
arithmetic operator
assignment operator
logical operator

| keyword is a reserved word in Java

<hr>
| java is case sensistive and platform independent.

Case sensitive means that uppercase letters and lowercase letters are treated as different characters.

Example:

"Hello" ≠ "hello" (they are different because of the capital H)

"Apple" ≠ "apple" ≠ "APPLE"

<hr>
return type


<hr>

Parameters → variables defined in a function/method signature (like placeholders).

Arguments → actual values you pass to the function when calling it.
<hr>
write method definition in first line of method - it contains the information such as what it does .

program starts with main function.
<hr>

# method types

=> without parameters and without any return type
=> with parameters and without return types
=> with parameter and with return type
=> without parameter and with return type

<hr>

while calling an method in static method we have to create the object of the class and then call the class using object.
new → allocates memory for a fresh object.

<hr>

## Method overloading
|no. of parameters should be different 
|changing the data type of parameters
|by changing the sequence of parameters data type.

## Method overriding

|Method overriding is a key concept in object-oriented programming that allows a subclass (child class) to provide its own implementation of a method that is already defined in its superclass (parent class). This is done by defining a method in the subclass with the same name, return type, and parameter list (signature) as the one in the superclass. The overriding method in the subclass "replaces" the inherited method for instances of the subclass.

Key Characteristics of Method Overriding
Inheritance is required: Overriding only happens in an inheritance relationship (i.e., between parent and child classes).

Same method signature: The method name, number, order, and type of parameters, as well as the return type, must all match exactly between the method in the superclass and the method in the subclass.

Run-time polymorphism: Method overriding enables run-time (dynamic) polymorphism, so the version of the method that gets called is determined at run-time based on the actual object type—not the reference type.

Access modifier: The overriding method must have the same or a less restricted (more accessible) access level compared to the method in the superclass.

@Override annotation (Java): In Java, it's common to use the @Override annotation to indicate intentionally overriding a superclass method.

Example:

<code>
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
</code>

When you call makeSound() on an Animal, it prints "Some sound". On a Dog object, it prints "Bark".

Important Details
You cannot override static, final, or private methods.

Overriding is used to implement specialized behavior for derived classes when the inherited method’s functionality needs modification.

Constructors cannot be overridden.

Why Overriding is Useful
It allows subclasses to provide specific behaviors for methods already defined in a parent, supporting polymorphism and code reusability.

It lets you call overridden superclass methods using super.methodName() from within the subclass.

In summary, method overriding in object-oriented programming enables flexible and maintainable code by allowing subclasses to tailor inherited behaviors.

<hr>

# constructor
<hr>

