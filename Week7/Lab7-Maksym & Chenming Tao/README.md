

# **README – Marketplace OOP Assignment**

This program is a Java implementation of a simple **Marketplace System** designed to demonstrate key **Object-Oriented Programming (OOP)** principles. The system models a marketplace where sellers manage products, and the marketplace keeps track of all sellers and their inventories.

---

## **Purpose of the Assignment**

The goal of this assignment is to apply OOP concepts such as:

* **Classes and Objects**
* **Encapsulation**
* **Composition**
* **Enumerations**
* **Interfaces**
* **Polymorphism**
* **Using Java Collections (ArrayList, List)**

The solution follows a modular design based on the provided UML diagram.

---

## **Main Components**

### **1. Marketplace**

* Stores multiple sellers
* Lists all sellers and all products
* Allows adding sellers to the system

### **2. Seller**

* Each seller has an ID, name, and a list of products
* Can add, update, or remove products
* Implements a display method to show seller information

### **3. Product**

* Includes name, price, and category
* Category is implemented using an `enum`
* Also implements a display method

### **4. Category (Enum)**

Defines product categories such as:

* ELECTRONICS
* CLOTHING
* FOOD
* KITCHENERY
* DRINKS

### **5. Displayable (Interface)**

Contains one method:

```java
void displayInfo();
```

Both `Seller` and `Product` implement this interface.
This allows them to be handled together using **polymorphism**, for example:

```java
List<Displayable> items = new ArrayList<>();
items.add(seller1);
items.add(product1);

for (Displayable d : items) {
    d.displayInfo();
}
```

This demonstrates treating different classes in the same way as long as they share the same interface.

---

## **Program Flow (Main.java)**

The `main()` method demonstrates:

1. Creating a marketplace
2. Adding sellers
3. Creating and assigning products
4. Displaying the marketplace state
5. Updating a product’s name and price
6. Displaying the updated state
7. Using a `List<Displayable>` to show polymorphism in action

---

## **Summary**

This assignment successfully demonstrates how OOP concepts can be combined to create a simple but functional marketplace system. The use of an interface (`Displayable`) highlights polymorphism by allowing different types of objects to be processed uniformly.

---
