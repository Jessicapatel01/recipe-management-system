package model;
public class Recipe{    //class
    private String name;
    private String instructions;
    private String ingredients;

    public Recipe(String name,String ingredients,String instructions){
        this.name=name;     //constructor 
        this.ingredients=ingredients;
        this.instructions=instructions;
    }
    public String getName(){  //Encapsulation...
        return name;
    }
    public String getIngredients(){
        return ingredients;
    }
    public String getInstructions(){
        return instructions;
    }

    public void displayRecipe(){    //methods
        System.out.println("\n========== Recipe ==========");
        System.out.println("Name: " + name);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Instructions: " + instructions);
        System.out.println("============================");
    }
}
