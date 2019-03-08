package edu.psu.ist;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;

    //Constructor Method
    public Menu(int _menuId){
        this.menuId = _menuId;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}
}
