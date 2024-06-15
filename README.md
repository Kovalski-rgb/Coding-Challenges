# Coding_Challenges

## What is this repo

I'll use it as both showcase and for quick reference after completing these challenges, the primary purpose of this project is just to practice and get better overall

## Commits
For commit convention, just add the problem's name with its status (`Problem`, `Solution`, `Optimization`, `Refactor`), e.g.
```bash
git commit -m "Diagonal Difference Problem"
git commit -m "Diagonal Difference Solution"
git commit -m "Diagonal Difference Optimization"
git commit -m "Diagonal Difference Refactor"
```

## Adding new solutions:
I won't force myself to use a single language to solve all challenges, but I'll standardize how to add a new solution, and how to run it  

First Thing first! Identify your platform and create/move to the corresponding folder, then create a folder for the solution, the folder name **must** be the solution name, and all \<spaces\> will need to be changed to \_underlines\_  

Also, please, create a `README.md` file, containing the problem that'll be solved, at least a short description is required

On CLI, to add the solution for the "[Diagonal Difference](https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true)" (from HackerRank), it'd be like this:

```bash
cd HackerRank
mkdir -p Diagonal_Difference
cd !$
touch README.md

```

#### Kotlin

To start a Kotlin solution, please use `gradle`
```
gradle init
```

To run a Kotlin solution
```
gradle run
```


Here is an example of the creation of the _Diagonal Difference_ solution
```
Welcome to Gradle 8.4!

Here are the highlights of this release:
 - Compiling and testing with Java 21
 - Faster Java compilation on Windows
 - Role focused dependency configurations creation

For more details see https://docs.gradle.org/8.4/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 4

Generate multiple subprojects for application? (default: no) [yes, no]   <enter>

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 2

Project name (default: Diagonal_Difference): <enter>

Source package (default: diagonal_difference): <enter>

Enter target version of Java (min. 7) (default: 17): <enter>

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] <enter>


> Task :init
To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.4/samples/sample_building_kotlin_applications.html

BUILD SUCCESSFUL in 1m

2 actionable tasks: 2 executed
```

###### Reference: [How to create new Kotlin project by CLI?](https://stackoverflow.com/questions/69081703/how-to-create-new-kotlin-project-by-cli)
