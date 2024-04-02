## The Problem:

Describe how you could solve each of the following problems using data structures we’ve learned so far.
Specify the ADTs (List, Stack, Queue, Iterator, Set, Map, Priority Queue) you would use and how to use
them to efficiently support the required operations.

1. Imagine you are a doctor who advises people with prediabetes. The most important part of controlling
    the disease is analyzing the dependency of the food a patient eats to their blood sugar. To prevent
    diabetes, a patient should figure out how each food affects their blood sugar. To help them do it, you
    decided to create the application that stores the name of the food that was eaten by the patient and
    what was their blood sugar after the consumption. Then, the next time a patient wants to eat this
    food, they can check how it affects their blood sugar before they eat it. You give them the application
    and tell them to store the name of the food and values of their sugar levels every time they try to eat
    something new. What ADT(s) would you use to implement this app?

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
    - main: runs this application
    - Patient: this blood sugar level calculator, get for name and blood sugar level methods and print methods 
- `lib`: the folder to maintain dependencies


Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
