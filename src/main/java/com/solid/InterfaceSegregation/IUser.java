package com.solid.InterfaceSegregation;

public interface IUser {

     // A method of Supplier
     boolean raiseInvoice();

     // Method of the Admin
     boolean paySupplier();

     // Method of InventoryManager
     String viewInvoice();

     //Method of Inspector
    boolean checkQuality();
}
