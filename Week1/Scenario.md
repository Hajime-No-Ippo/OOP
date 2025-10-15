Scenario

You are tasked with creating a program that can represent and display the 
structure of a file system starting from a given root directory. The program 
should show the hierarchy of folders and files in a clear, organized way.

Guidelines

- Think about how you would model files and directories in an object-oriented way.
- Consider what common properties and behaviors files and directories share.
- Decide how to store multiple items inside a directory.
- Figure out how to display the hierarchy so that nested folders are clear.
- Explore how recursion might help when traversing subdirectories.

Questions to Guide Your Designs

What classes will you need? How will they relate to each other?
How can inheritance simplify your design?
What data structure will you use to hold the contents of a directory?
How will you print the structure so that nesting is visible?
How will you handle the traversal of directories and files?


Expected Behavior

When given a root folder, the program should print something like:

+ RootFolder
  - file1.txt
  + SubFolder
    - file2.java
    + NestedFolder
      - file3.txt


Additional Ideas

Add a way to count files or calculate total size.
Filter by file type.
Limit how deep the traversal goes.
Search for a file by name.