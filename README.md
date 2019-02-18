# cs1302-ce13 Java Generics

> Be careful what you wish for, lest it come true.
> **--Chinese Proverb**

This class exercise covers introduces the reader to Java Generics, a powerful way to write classes,
interfaces, and methods using a type parameter. It also introduces students to time travel using Git.

Generics are used when you want to apply the exact same implementation (code) to various types.
Contrast this with inheritance which is used when you need common functionality to be implemented
in different ways. Think of a `getPerimeter()` method that can be applied to references to objects
of type `Circle` and `Square`. These classes both contain the `getPerimeter()` method but the
implementations depend on the type.

## Prerequisite Knowledge

* Basic knowledge of Java Generics.
* [Git Glossary](https://mirrors.edge.kernel.org/pub/software/scm/git/docs/gitglossary.html)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce13`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce13.git
   ```

1. Change into the `cs1302-ce13` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

   For each Java file under the `src` subdirectory, fill out a table similar to the following:
   
   | File Name | Java Type? | FQN | Depends On |
   |-----------|------------|-----|------------|
   |-----------|------------|-----|------------|
   |-----------|------------|-----|------------|
   |-----------|------------|-----|------------|

   The "Java Type" column should list the outermost type in the file (e.g., class, interface, enum, etc). 
   The "Depends On" column should list any Java types in the starter code that the file
   is dependent upon.
   
1. In your notes, draw a complete, proper UML diagram for all of the code contained in the
   starter code. You might need to devote an entire page to this. We recommend using a pencil.
   Be sure to include generalization (`extends`), realization (`implements`), and 
   dependency arrows. Do not list inherited members unless they are explicitly overriden.

1. Execute the command to generate the API documentation website for the code contained in this exercise
   and place it in the `doc` subdirectory.
   Use the `-link` option with the `javadoc` command to automatically link external types (e.g., `Object`)
   to the official Oracle API documentation website
   [here](https://docs.oracle.com/javase/8/docs/api).
   Be sure to write the full command in your notes.

1. For each line in the `createStringList` method in `Driver.java`, draw a diagram that illustrates any nodes
   that have been created along with their associated string values and next references. Since next is a
   reference, you would either need to denote it as null or draw an arrow to the object it references.
   Redraw the entire picture after each line. Although the associated string is also a reference, you may
   draw it within the node. Number each step in your notes. Reference variables that are not contained in
   node objects should also be included in the diagram.

1. Compile the starter code using `bin` as the default package for compiled code. Make sure you compile
   the classes in the proper order considering the dependencies. If you encounter any compilation
   errors:
   
   1. Look at the first error reported by `javac`;
   1. Write the error down in your notes;
   1. Fix the error in the code using type casting;
   1. Recompile;
   1. Note the fix in your notes; then
   1. Repeat as needed.

   **Note:** Unless absolutely necessary, casting should be avoided. We are doing it here for educational
   purposes.
   
1. Run `Driver`. If you counter an exception, then detail the following in your notes:
   1. The complete output of the compiler;
   1. Why the exception was thrown;
   1. Fix the code without changing the datatype of the `lastDouble` variable;
   1. Recompile;
   1. Note the attempted fix; then
   1. Repeat as needed.

1. Commit the changes to your local copy of the exercise repository. Be sure to include a good log message.

**CHECKPOINT**

1. Now that you have that working, let's use Git to go back in time to what the exercise
   directory looked like when you first cloned the repository so that we can fix the code
   using generics. The following steps make use of Git-related jargon. You may find the
   [official glossary](https://mirrors.edge.kernel.org/pub/software/scm/git/docs/gitglossary.html)
   useful when new terms are used.

   1. Use the following command to view a condensed, graphical version of the Git log:

      ```
      $ git log --graph --oneline --all --decorate
      ```

      The oldest commit in the log is displayed last. In this condensed version, each
      line displays a commit with its associated log message as well as other important
      pieces of information. Here is an example of a similar commit entry in a log (yours
      may differ):
      
      ```
      * d70a020 (HEAD, origin/master, origin/HEAD, master) updated description      
      ```
      
      In this example:
      * `d70a020` is a hexadecimal number that serves as a checksum/identifier for the commit;
      * `(HEAD, origin/master, origin/HEAD, master)` denotes branch names for the commit;
      * `HEAD` indicates that this commit is currently checked out; and
      * the rest of the lines is the associated log message.
      
   1. In your notes, write down the complete line for the most recent commit displayed in your log.
   
   1. Now, use the following command to check out the oldest commit in your log and give
      it a branch name called `restart`, replacing `IDNUM` with the hexadecimal
      identifier for that commit:

      ```
      $ git checkout IDNUM -b restart
      ```

   1. View the output of a condensed, graphical version of the Git log.
      In your notes, describe the graph displayed by the log.
      
   1. Confirm that you traveled through time by inspecting the contents of the `.java`
      files. In your notes, mark today's date as the day that you became a time
      traveler!

1. Now let's create a generic version of the `ObjectContainer` class called
   `cs1302.ce13.Container` with a type parameter called `T`. Before you write the code,
   draw a UML diagram in your notes to illustrate what the class will look like.
   You may denote any type parameters in the class name in your diagram similar to
   how you would denote them in class's signature in a `.java` file.

1. Now write and document the source code for the generic `cs1302.ce13.Container` class.
   Since your class will have a type parameter, be sure to include an `@param` for `<T>`
   in your Javadoc comment for the class -- something that you've likely not had to do in
   the past.  Whenever you refer to the type for  your container class, it must be fully
   parameterized. That is, we are explicitly requiring you not to use the raw type
   version of `Container` for this step.

1. Compile your new `Container` code using `bin` as the default package for compiled code.
   If you encounter any compilation errors:
   
   1. Look at the first error reported by `javac`;
   1. Write the error down in your notes;
   1. Fix the error in the code using type casting;
   1. Recompile;
   1. Note the fix in your notes; then
   1. Repeat as needed.

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Nike using `cs1302-ce13-doc` as the name for your symbolic link.
   What is the URL for the `Container` class on your website?

1. Commit the changes to your local copy of the exercise repository.
   Be sure to include a good log message.

**CHECKPOINT**

1. Update and document the `Driver` class to use your generic `Container` class instead of
   `ObjectContainer` without changing the datatypes of any non-container local variables
   (i.e., do not change the types for `lastString` and `lastDouble`). Whenever you refer to
   the type for your container class, it must be fully parameterized. That is, we are explicitly
   requiring you not to use the raw type version of `Container` for this step.

1. Run the code. If you encounter any compile-time error, then
   detail the following in your notes:
   1. The complete output of the compiler;
   1. Why the exception was thrown;
   1. Fix the code;
   1. Recompile;
   1. Note the attempted fix; then
   1. Repeat as needed.

1. Commit the changes to your local copy of the exercise repository.
   Be sure to include a good log message.

1. Consider the errors you encountered in the last step compared the errors you encountered
   in the previous checkpoint with your old version of the code. Were there any errors that you
   encountered at compile time instead of run-time? If so, **what and why?**

1. In your notes, write down the full statements for each of the following
   variable declarations in the `Driver` class:
   * `stringHead`
   * `lastString`
   * `doubleHead`
   * `lastDouble`

1. View the output of a condensed, graphical version of the Git log.

**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
