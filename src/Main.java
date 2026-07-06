import java.util.*;
import model.Recipe;
public class Main{
    public static void main(String args[]){
        ArrayList<Recipe>recipes=new ArrayList<>();
        boolean running=true;

        try(Scanner sc=new Scanner(System.in)){    //try with resources: you dont need to use sc.close later in program. It automatically closes the program!
        while(running){
        System.out.println("==== Recipe App ====");
        System.out.println("1. Add Recipe ");
        System.out.println("2. View Recipe ");
        System.out.println("3. Search Recipe ");
        System.out.println("4. Delete recipe ");
        System.out.println("5.Exit ");

        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                sc.nextLine();
                System.out.print("Enter Recipe Name: ");
                String name=sc.nextLine();

                System.out.print("Enter Ingredients : ");
                String ingredients=sc.nextLine();

                System.out.print("Enter Instructions : ");
                String instructions=sc.nextLine();

                Recipe recipe =new Recipe(name,ingredients,instructions);
                recipes.add(recipe);
                System.out.println("\nRecipe added Successfully!\n");
                recipe.displayRecipe();
                break;
            
            case 2:
                if(recipes.isEmpty()){
                System.out.println("\n No recipes available!!"); //Arraylist empty
                }
                else{
                    System.out.println("\n====All Recipes====");

                    for(Recipe r : recipes){  // :enhanced for loop
                        r.displayRecipe();  // recipes->arraylist contains recipe objects.
                                                 //recipe-> varible that points to one recipe object at a point
                                                 // Recipe-> class
                    }
                }

                break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter recipe name to search: ");
                    String searchName =sc.nextLine();

                    boolean found=false;
                    for(Recipe r: recipes){
                        if(r.getName().equalsIgnoreCase(searchName)){
                            r.displayRecipe();
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Recipe not found!");
                    }
                    break;
            case 4:
                sc.nextLine();
                System.out.print("Enter recipe to delete : ");
                String del=sc.nextLine();

                boolean removed=false;

                for(int i=0;i<recipes.size();i++){
                  if(recipes.get(i).getName().equalsIgnoreCase(del)){
                      recipes.remove(i);
                       System.out.println("Recipe deleted!");
                       removed=true;
                        break;
                    }
                }
              if(!removed){
                  System.out.println("Recipe not found.");
            }
               break; 
                
            case 5:
                running=false;
                System.out.println("Exiting...!");
                break;

            default:
                System.out.println("Invalid Choice");
        }
        }
    }
    }
}

