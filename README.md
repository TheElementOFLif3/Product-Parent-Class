# 2.PructParentClass
Creating classes and objects

Assignment
It is necessary to model a simplified information system of a trade. In a Java program, it is necessary to present products using three classes: Product, Wine and Chocolate. The Product class should be used for the general presentation of products that do not have a special type. Two special types of products need to be modeled in the program, so the Product class needs to be inherited by two classes that represent specific groups of products: Chocolate and Wine.
Each product (Product class) should have certain properties:

product name;
bar code;
base price;
tax

Also, each product (Product class) should have one method for calculating the price. The price is calculated by increasing the basic price by the tax amount. Tax (VAT) for each product is 20% and this is information that is constant and will not change.

The Chocolate class should have one property of its own:

Weight.
And the Wine class should have one property of its own:

the volume of the bottle.
Products from the wine group should also have an additional tax, since they belong to the group of alcoholic beverages, and it amounts to 10% of the price already increased by the amount of VAT. And this is data that is constant and will not change. Because of this additional tax, the Wine class should have its own price calculation method, which will include the additional tax in the calculation. This means that the method for calculating the price needs to be redefined in the Wine class.

In all classes, it is necessary to create a method for displaying information about objects. The method must be adapted to the properties of the class, that is, it must display all the properties that the given class has. Therefore, it is necessary that each of the classes has its own method for displaying information, that is, it is necessary to redefine such a method. The basic variant of the method will exist in the Product class, while in the Wine and Chocolate classes such a method will be redefined with logic that takes into account the properties that are characteristic of these classes. Such examples of method redefinition have already been illustrated in the lesson Postulates of OOP, on the example of the classes Car and Convertible.

In the end, it is necessary to create one object of the Product, Wine and Chocolate classes in the main class and display information about the products as well as the amount of the final price defined through the price calculation method. Take an arbitrary amount for the base price.

Otherwise, the price with 20% tax is calculated by multiplying the basic price by (100 + 20) / 100 = 1.2. The price with tax of 20% + 10% is calculated by multiplying the base price as follows: (120 / 100) * (110 / 100) = 1.2 * 1.1, which is equal to 1.32. So 20% + 10% equals 32%.
