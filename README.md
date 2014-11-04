# Wildcards with Ant's Java task

Small project to show the difference in behaviour when passing wildcards to Ant's Java task on Windows and Mac.
It consists of two tests, passing a string with a wildcard and using pathconvert with a fileset.
Sample outputs from running on Windows and Mac are provided in the `reports` directory.

For an explanation of the difference in behaviour please see [this post](http://spudmux.com/2014/10/24/Wildcards-with-Ant's-Java-Task.html).

## Running the Tests

The `build.xml` file contains multiple targets for building and running the tests. The `run` target should be all you need to compile and execute both tests.
